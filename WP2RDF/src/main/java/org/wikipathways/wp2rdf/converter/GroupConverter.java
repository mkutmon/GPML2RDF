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

import org.pathvisio.core.biopax.PublicationXref;
import org.pathvisio.core.model.MGroup;
import org.pathvisio.core.model.PathwayElement;
import org.pathvisio.core.model.PathwayElement.Comment;
import org.wikipathways.wp2rdf.ontologies.Gpml;
import org.wikipathways.wp2rdf.ontologies.GpmlNew;
import org.wikipathways.wp2rdf.ontologies.Wp;
import org.wikipathways.wp2rdf.utils.DataHandler;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.DC;
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
	 * conversion only GPML vocabulary
	 */
	public static void parseGroupGpml(MGroup group, Model model, DataHandler data) {
		
		String graphId = group.getGraphId();
		if(graphId == null) {
			graphId = group.getGroupId();
		}
		
		Resource groupRes = model.createResource(data.getPathwayRes().getURI() + "/Group/" + graphId);
	
		groupRes.addProperty(DC.type, GpmlNew.GROUP);
		data.getPathwayRes().addProperty(GpmlNew.HAS_GROUP, groupRes);
		groupRes.addProperty(DCTerms.isPartOf, data.getPathwayRes());	
		
		
		if(group.getGroupRef() != null) groupRes.addLiteral(GpmlNew.GROUP_REF, group.getGroupRef());
		groupRes.addLiteral(GpmlNew.GROUP_ID, group.getGroupId());
		if(group.getGraphId() != null) groupRes.addLiteral(GpmlNew.GRAPH_ID, group.getGraphId());
		if(group.getTextLabel() != null) groupRes.addLiteral(GpmlNew.TEXTLABEL, group.getTextLabel());
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
	public static void parseGroup(MGroup group, Model model, DataHandler data) {
		
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
				groupRes.addProperty(Wp.hasParticipant, res);
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