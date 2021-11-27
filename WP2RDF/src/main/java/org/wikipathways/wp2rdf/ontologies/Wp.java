package org.wikipathways.wp2rdf.ontologies;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

/**
 * Vocabulary definitions from WP.rdf 
 * @author Auto-generated by schemagen on 12 Aug 2015 16:49 
 */
public class Wp {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://vocabularies.wikipathways.org/wp#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property bdbWikidata = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbWikidata" );
    
    public static final Property bdbChEBI = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbChEBI" );
    
    public static final Property bdbChemspider = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbChemspider" );
    
    public static final Property bdbEnsembl = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbEnsembl" );
    
    public static final Property bdbEntrezGene = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbEntrezGene" );
    
    public static final Property bdbHgncSymbol = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbHgncSymbol" );
    
    public static final Property bdbHmdb = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbHmdb" );
    
    public static final Property bdbPubChem = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbPubChem" );
    
    public static final Property bdbKeggCompound = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbKeggCompound" );
    
    public static final Property bdbLipidMaps = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbLipidMaps" );
    
    public static final Property bdbInChIKey = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbInChIKey" );

    public static final Property bdbRhea = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbRhea" );

    public static final Property bdbReactome = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbReactome" );

    public static final Property bdbComplexPortal = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbComplexPortal" );

    public static final Property bdbUniprot = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#bdbUniprot" );
    
    public static final Property cellTypeOntologyTag = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#cellTypeOntologyTag" );
    
    public static final Property diseaseOntologyTag = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#diseaseOntologyTag" );
    
    public static final Property isAbout = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#isAbout" );
    
    public static final Property ontologyTag = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#ontologyTag" );
    
    public static final Property organism = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#organism" );
    
    public static final Property organismName = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#organismName" );
    
    public static final Property participants = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#participants" );
    
    public static final Property pathwayOntologyTag = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#pathwayOntologyTag" );
    
    public static final Property source = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#source" );
    
    public static final Property target = m_model.createProperty( "http://vocabularies.wikipathways.org/wp#target" );
    
    public static final Resource Binding = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Binding" );
    
    public static final Resource Catalysis = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Catalysis" );
    
    public static final Resource Complex = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Complex" );
    
    public static final Resource ComplexBinding = m_model.createResource( "http://vocabularies.wikipathways.org/wp#ComplexBinding" );
    
    public static final Resource Conversion = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Conversion" );
    
    public static final Resource DataNode = m_model.createResource( "http://vocabularies.wikipathways.org/wp#DataNode" );
    
    public static final Resource DirectedInteraction = m_model.createResource( "http://vocabularies.wikipathways.org/wp#DirectedInteraction" );
    
    public static final Resource GeneProduct = m_model.createResource( "http://vocabularies.wikipathways.org/wp#GeneProduct" );
    
    public static final Resource Inhibition = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Inhibition" );
    
    public static final Resource Interaction = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Interaction" );
    
    public static final Resource Metabolite = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Metabolite" );
    
    public static final Resource Pathway = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Pathway" );
    
    public static final Resource Protein = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Protein" );
    
    public static final Resource PublicationReference = m_model.createResource( "http://vocabularies.wikipathways.org/wp#PublicationReference" );
    
    public static final Resource Rna = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Rna" );
    
    public static final Resource Stimulation = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Stimulation" );
    
    public static final Resource TranscriptionTranslation = m_model.createResource( "http://vocabularies.wikipathways.org/wp#TranscriptionTranslation" );
    
    public static final Resource Translocation = m_model.createResource( "http://vocabularies.wikipathways.org/wp#Translocation" );

    public static final Resource mkutmon = m_model.createResource( "http://vocabularies.wikipathways.org/wp#mkutmon" );
    
    public static final Resource ryan = m_model.createResource( "http://vocabularies.wikipathways.org/wp#ryan" );
    
}
