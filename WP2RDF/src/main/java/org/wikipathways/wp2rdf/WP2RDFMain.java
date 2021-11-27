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
package org.wikipathways.wp2rdf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.bridgedb.IDMapperException;
import org.pathvisio.core.model.ConverterException;
import org.pathvisio.core.model.Pathway;
import org.pathvisio.core.view.MIMShapes;
import org.wikipathways.wp2rdf.io.PathwayReader;
import org.wikipathways.wp2rdf.utils.Utils;

/**
 * 
 * @author mkutmon
 * @author ryanmiller
 *
 */
public class WP2RDFMain {

	public static void main(String[] args) throws ClassNotFoundException, IDMapperException {
		// TODO: get all pathways from webservice
		
		// change file location if you 
		// want to try a different pathway
		
//		File pathwayFile = new File("resources/WP2059_79765.gpml");
		File pathwayFile = new File("resources/WP2447_75221.gpml");
//		File pathwayFile = new File("resources/complex.gpml");
//		File pathwayFile = new File("resources/test-simple-conversion.gpml");
//		File pathwayFile = new File("resources/test-simple-reversible-regulated.gpml");
//		File pathwayFile = new File("resources/reactome-interaction.gpml");
//		File pathwayFile = new File("resources/test-simple-undirected.gpml");
//		File pathwayFile = new File("resources/test-advanced-conversion-withRegulators.gpml");

		File outputFile = new File("output-test.owl");
		
		try {	
			MIMShapes.registerShapes();
			Pathway p = PathwayReader.readPathway(pathwayFile);

			// TODO: get pathway id
			String wpId = "WP2447";
			// TODO: get revision
			String revision = "75221";
			
			Model pathwayModel = ModelFactory.createDefaultModel();
			Utils.setModelPrefix(pathwayModel);
			
//			File bridgeDbFile = new File("/home/martina/Data/BridgeDb/Hs_Derby_20130701.bridge");
//			File bridgeDbFileMet = new File("/home/martina/Data/BridgeDb/metabolites_20140516.bridge");
			
//			IDMapper geneMapper = Utils.setUpIDMapper(bridgeDbFile);
//			IDMapper metMapper = Utils.setUpIDMapper(bridgeDbFileMet);
			
			// New conversion of the pathway in GPML vocabulary
//			GpmlConverter.convertGpml(p, wpId, revision, pathwayModel);
			
			// New conversion of the pathway in WP vocabulary
			GpmlConverter.convertWp(p, wpId, revision, Collections.<String>emptyList());
			
			// Write model in new file
			pathwayModel.write(new FileWriter(outputFile), "TURTLE");
			
		} catch (ConverterException e) {
			System.out.println("couldn't read pathway file " + pathwayFile.getAbsolutePath());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
