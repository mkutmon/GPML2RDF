// WP2RDF
// Conversion from GPML pathways to RDF
// Copyright 2015 BiGCaT Bioinformatics
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package org.wikipathways.wp2rdf.converter;

import java.util.ArrayList;
import java.util.List;

import org.pathvisio.core.biopax.PublicationXref;
import org.pathvisio.core.model.GroupStyle;
import org.pathvisio.core.model.MGroup;
import org.pathvisio.core.model.PathwayElement;
import org.pathvisio.core.model.PathwayElement.Comment;
import org.wikipathways.wp2rdf.ontologies.Gpml;
import org.wikipathways.wp2rdf.ontologies.GpmlNew;
import org.wikipathways.wp2rdf.ontologies.Wp;
import org.wikipathways.wp2rdf.ontologies.WpOld;
import org.wikipathways.wp2rdf.utils.DataHandlerGpml;
import org.wikipathways.wp2rdf.utils.DataHandlerWp;
import org.wikipathways.wp2rdf.utils.Utils;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.DCTerms;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

/**
 * 
 * @author mkutmon
 * @author ryanmiller
 *
 */
public class GroupConverter {

	/**
	 * conversion only WP vocabulary
	 * semantic information about a complex group
	 */
	public static void parseComplexWp(MGroup group, Model model, DataHandlerWp data) {
		System.out.println(group.getGroupStyle());
		if(group.getGroupStyle().equals(GroupStyle.COMPLEX)) {
			List<Resource> participants = new ArrayList<Resource>();
			for(PathwayElement e : group.getGroupElements()) {
				Resource r = data.getDataNodes().get(e.getXref());
				if(r != null) {
					participants.add(r);
				}
			}
			// TODO: what about complexes with only one data node?
			if(participants.size() > 1) {
				String graphId = group.getGraphId();
				if(graphId == null) {
					graphId = group.getGroupId();
				}
				Resource groupRes = model.createResource(Utils.WP_RDF_URL + "/Pathway/" + data.getPwyId() + "_r" + data.getRevision() + "/Complex/" + graphId);
				groupRes.addProperty(RDF.type, Wp.Complex);
				groupRes.addProperty(Wp.isAbout, Utils.WP_RDF_URL + "/Pathway/" + data.getPwyId() + "_r" + data.getRevision() + "/Group/" + graphId);
				groupRes.addProperty(DCTerms.isPartOf, data.getPathwayRes());
				if(group.getTextLabel() != null && !group.getTextLabel().equals("")) groupRes.addLiteral(RDFS.label, group.getTextLabel().replace("\n", " "));

				data.getPathwayElements().put(group, groupRes);
				
				Resource complexBinding = model.createResource(Utils.WP_RDF_URL + "/Pathway/" + data.getPwyId() + "_r" + data.getRevision() + "/ComplexBinding/" + graphId);
				complexBinding.addProperty(RDF.type, Wp.Interaction);
				complexBinding.addProperty(RDF.type, Wp.Binding);
				complexBinding.addProperty(RDF.type, Wp.ComplexBinding);
				complexBinding.addProperty(Wp.participants, groupRes);
				complexBinding.addProperty(Wp.isAbout, Utils.WP_RDF_URL + "/Pathway/" + data.getPwyId() + "_r" + data.getRevision() + "/Group/" + graphId);
				complexBinding.addProperty(DCTerms.isPartOf, data.getPathwayRes());
				
				for(Resource r : participants) {
					groupRes.addProperty(Wp.participants, r);
					complexBinding.addProperty(Wp.participants, r);
					r.addProperty(DCTerms.isPartOf, groupRes);
				}
				
				for(PublicationXref xref : group.getBiopaxReferenceManager().getPublicationXRefs()) {
					if(xref.getPubmedId() != null && !xref.getPubmedId().equals("")) {
						String pubmedUrl = Utils.IDENTIFIERS_ORG_URL + "/pubmed/" + xref.getPubmedId();
						groupRes.addProperty(DCTerms.bibliographicCitation, model.createResource(pubmedUrl));
						complexBinding.addProperty(DCTerms.bibliographicCitation, model.createResource(pubmedUrl));
					}
				}
				
			}
		}
		// TODO - for now only convert groups of type complex - what about other elements
	}
	
	/**
	 * conversion only GPML vocabulary
	 */
	public static void parseGroupGpml(MGroup group, Model model, DataHandlerGpml data) {
		
		String graphId = group.getGraphId();
		if(graphId == null) {
			graphId = group.getGroupId();
		}
		
		Resource groupRes = model.createResource(data.getPathwayRes().getURI() + "/Group/" + graphId);
	
		groupRes.addProperty(RDF.type, GpmlNew.GROUP);
		data.getPathwayRes().addProperty(GpmlNew.HAS_GROUP, groupRes);
		groupRes.addProperty(DCTerms.isPartOf, data.getPathwayRes());	
		
		
		if(group.getGroupRef() != null) groupRes.addLiteral(GpmlNew.GROUP_REF, group.getGroupRef());
		groupRes.addLiteral(GpmlNew.GROUP_ID, group.getGroupId());
		if(group.getGraphId() != null) groupRes.addLiteral(GpmlNew.GRAPH_ID, group.getGraphId());
		if(group.getTextLabel() != null && !group.getTextLabel().equals("")) groupRes.addLiteral(GpmlNew.TEXTLABEL, group.getTextLabel());
		groupRes.addLiteral(GpmlNew.STYLE, group.getGroupStyle().getName());
		
		for(String s : group.getBiopaxRefs()) {
			groupRes.addLiteral(GpmlNew.BIOPAX_REF, s);
		}
		
		for(Comment c : group.getComments()) {
			CommentConverter.parseCommentGpml(c, model, groupRes, data);
		}
		
		for(PublicationXref xref : group.getBiopaxReferenceManager().getPublicationXRefs()) {
			PublicationXrefConverter.parsePublicationXrefGpml(xref, groupRes, model, data);
		}
		
		for(PathwayElement e : group.getGroupElements()) {
			Resource r = data.getPathwayElements().get(e);
			r.addProperty(DCTerms.isPartOf, groupRes);
		}
		
		data.getPathwayElements().put(group, groupRes);
	}
	
	/**
	 * old conversion GPML + WP
	 */
	public static void parseGroup(MGroup group, Model model, DataHandlerGpml data) {
		
		// TODO: should this contain the groupId or graphId?
		Resource groupRes = model.createResource(data.getPathwayRes().getURI() + "/Group/" + group.getGroupId());
		groupRes.addProperty(DCTerms.isPartOf, data.getPathwayRes());
		groupRes.addProperty(RDF.type, Gpml.Group);
		
		// GPML RELATED PROPERTIES
		// TODO: fix this in WP!!!!
		if(group.getGraphId() != null) groupRes.addLiteral(Gpml.graphid, group.getGraphId());
		groupRes.addLiteral(Gpml.groupid, group.getGroupId());
		if(group.getGroupRef() != null) {
			groupRes.addLiteral(Gpml.groupref, group.getGroupRef());
		}
		groupRes.addLiteral(Gpml.style, group.getGroupStyle().getName());
		if(!group.getTextLabel().equals("")) {
			groupRes.addLiteral(RDFS.label, group.getTextLabel().replace("\n", " "));
		}

		for(PathwayElement e : group.getGroupElements()) {
			Resource res = data.getPathwayElements().get(e);
			if(res != null) {
				res.addProperty(DCTerms.isPartOf, groupRes);
				// TODO: adding a hasParticipants or so, might be nice for the groups
				groupRes.addProperty(WpOld.hasParticipant, res);
			} else {
				System.out.println("ERRRORR");
			}
		}
		// TODO: Comments
		
		// PUBLICATION REFERENCES
		for(PublicationXref xref : group.getBiopaxReferenceManager().getPublicationXRefs()) {
			PublicationXrefConverter.parsePublicationXref(xref, groupRes, model);
		}
		
		data.getPathwayElements().put(group, groupRes);
	}
}
