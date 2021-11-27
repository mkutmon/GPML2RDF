package org.wikipathways.wp2rdf.ontologies;
 
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
 
/**
 * Vocabulary definitions from http://geovocab.org/spatial.rdf 
 * @author Auto-generated by schemagen on 11 Jan 2012 16:06 
 */
public class Spatial {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://geovocab.org/spatial#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>A geographical feature, capable of holding spatial relations.</p> */
    public static final Resource Feature = m_model.createResource( "http://geovocab.org/spatial#Feature" );
    
    public static final Resource a = m_model.createResource( "http://geovocab.org/spatial#a" );
    
    public static final Resource b = m_model.createResource( "http://geovocab.org/spatial#b" );
    
    public static final Resource c = m_model.createResource( "http://geovocab.org/spatial#c" );
    
    public static final Resource x = m_model.createResource( "http://geovocab.org/spatial#x" );
    
}
