package org.wikipathways.wp2rdf.ontologies;
 
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
 
/**
 * Vocabulary definitions from http://vocab.org/relationship/.rdf 
 * @author Auto-generated by schemagen on 11 Mar 2012 18:40 
 */
public class Relations {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://purl.org/vocab/relationship/";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property ambivalentOf = m_model.createProperty( "http://purl.org/vocab/relationship/ambivalentOf" );
    
    public static final Property antagonistOf = m_model.createProperty( "http://purl.org/vocab/relationship/antagonistOf" );
    
    public static final Property apprenticeTo = m_model.createProperty( "http://purl.org/vocab/relationship/apprenticeTo" );
    
    public static final Property childOf = m_model.createProperty( "http://purl.org/vocab/relationship/childOf" );
    
    public static final Property employedBy = m_model.createProperty( "http://purl.org/vocab/relationship/employedBy" );
    
    public static final Property employerOf = m_model.createProperty( "http://purl.org/vocab/relationship/employerOf" );
    
    public static final Property enemyOf = m_model.createProperty( "http://purl.org/vocab/relationship/enemyOf" );
    
    public static final Property grandchildOf = m_model.createProperty( "http://purl.org/vocab/relationship/grandchildOf" );
    
    public static final Property grandparentOf = m_model.createProperty( "http://purl.org/vocab/relationship/grandparentOf" );
    
    public static final Property influencedBy = m_model.createProperty( "http://purl.org/vocab/relationship/influencedBy" );
    
    public static final Property knowsByReputation = m_model.createProperty( "http://purl.org/vocab/relationship/knowsByReputation" );
    
    public static final Property knowsInPassing = m_model.createProperty( "http://purl.org/vocab/relationship/knowsInPassing" );
    
    public static final Property knowsOf = m_model.createProperty( "http://purl.org/vocab/relationship/knowsOf" );
    
    public static final Property mentorOf = m_model.createProperty( "http://purl.org/vocab/relationship/mentorOf" );
    
    public static final Property parentOf = m_model.createProperty( "http://purl.org/vocab/relationship/parentOf" );
    
    public static final Property participant = m_model.createProperty( "http://purl.org/vocab/relationship/participant" );
    
    public static final Property participantIn = m_model.createProperty( "http://purl.org/vocab/relationship/participantIn" );
    
    public static final Property wouldLikeToKnow = m_model.createProperty( "http://purl.org/vocab/relationship/wouldLikeToKnow" );
    
    public static final Property spouseOf = m_model.createProperty( "http://purl.org/vocab/relationship/spouseOf" );
    
    /** <p>&lt;p&gt;The RELATIONSHIP vocabulary can be used without modification with 
     *  &lt;a href="http://xmlns.com/foaf/0.1/"&gt;FOAF&lt;/a&gt; documents. Simply 
     *  replace &lt;code&gt;foaf:knows&lt;/code&gt; properties with a more specific 
     *  property from this vocabulary. For backwards compatibility with older, non-RDF 
     *  aware, tools, you may want to keep the &lt;code&gt;foaf:knows&lt;/code&gt; 
     *  property as well.&lt;/p&gt; &lt;pre&gt; &lt;code class="xml"&gt; &amp;lt;rdf:RDF 
     *  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#" 
     *  xmlns:foaf="http://xmlns.com/foaf/0.1/" xmlns:rel="http://purl.org/vocab/relationship/" 
     *  &amp;gt; &amp;lt;foaf:Person rdf:nodeID="ian"&amp;gt; &amp;lt;foaf:name&amp;gt;Ian 
     *  Davis&amp;lt;/foaf:name&amp;gt; &amp;lt;foaf:title&amp;gt;Mr&amp;lt;/foaf:title&amp;gt; 
     *  &amp;lt;foaf:firstName&amp;gt;Ian&amp;lt;/foaf:firstName&amp;gt; &amp;lt;foaf:surname&amp;gt;Davis&amp;lt;/foaf:surname&amp;gt; 
     *  &amp;lt;rel:hasMet&amp;gt; &amp;lt;foaf:Person&amp;gt; &amp;lt;foaf:name&amp;gt;William 
     *  Tell&amp;lt;/foaf:name&amp;gt; &amp;lt;/foaf:Person&amp;gt; &amp;lt;/rel:hasMet&amp;gt; 
     *  &amp;lt;rel:collaboratesWith rdf:nodeID="eric"/&amp;gt; &amp;lt;/foaf:Person&amp;gt; 
     *  &amp;lt;foaf:Person rdf:nodeID="eric"&amp;gt; &amp;lt;foaf:nick&amp;gt;pixel&amp;lt;/foaf:nick&amp;gt; 
     *  &amp;lt;/foaf:Person&amp;gt; &amp;lt;/rdf:RDF&amp;gt; &lt;/code&gt; &lt;/pre&gt;</p>
     */
    public static final Resource relations = m_model.createResource( "http://purl.org/vocab/relationship/examples/1" );
    
    /** <p>&lt;p&gt; The relationship vocabulary can be used to describe relationships 
     *  with the people linked from a web page. This is particularly useful for blogrolls 
     *  or contact lists but can be used with any type of link. The HTML &lt;code&gt;a&lt;/code&gt; 
     *  element provides two attributes, &lt;a href="http://www.w3.org/TR/html401/struct/links.html#adef-rel"&gt;rel 
     *  and rev&lt;/a&gt;, that can be used to specify the relationship. Both &lt;code&gt;rel&lt;/code&gt; 
     *  and &lt;code&gt;rev&lt;/code&gt; take a space separated list of keywords as 
     *  their value. To use a term from the relationship vocabulary just drop the 
     *  &lt;code&gt;http://purl.org/vocab/relationship/&lt;/code&gt; namespace to 
     *  leave the property name, e.g. &lt;code&gt;http://purl.org/vocab/relationship/worksWith&lt;/code&gt; 
     *  would become &lt;code&gt;worksWith&lt;/code&gt; which can be added as the 
     *  value of &lt;code&gt;rel&lt;/code&gt; or &lt;code&gt;rev&lt;/code&gt;. &lt;/p&gt; 
     *  &lt;dl&gt; &lt;dt&gt; &lt;code&gt;rel&lt;/code&gt; &lt;/dt&gt; &lt;dd&gt; 
     *  &lt;p&gt; The &lt;code&gt;rel&lt;/code&gt; attribute specifies a relationship 
     *  that the author of the &lt;em&gt;linked&lt;/em&gt; page has with the author 
     *  of the &lt;em&gt;linking&lt;/em&gt; page. For example: &lt;/p&gt; &lt;pre&gt;&lt;code&gt;&lt;span 
     *  class="elem"&gt;&amp;lt;a&lt;/span&gt;&lt;span class="attr"&gt;href&lt;/span&gt;="&lt;span 
     *  class="attrVal"&gt;http://example.com/boats&lt;/span&gt;" &lt;span class="attr 
     *  highlight"&gt;rel&lt;/span&gt;="&lt;span class="attrVal"&gt;childOf&lt;/span&gt;"&lt;span 
     *  class="elem"&gt;&amp;gt;&lt;/span&gt;&lt;span class="text"&gt;The boat we 
     *  restored&lt;/span&gt;&lt;span class="elem"&gt;"&amp;lt;/a&amp;gt;&lt;/span&gt;&lt;/code&gt;&lt;/pre&gt; 
     *  &lt;p&gt;This link states that the author of &lt;code&gt;http://example.com/boats&lt;/code&gt; 
     *  is a child of the author of the html above. &lt;/p&gt; &lt;/dd&gt; &lt;dt&gt; 
     *  &lt;code&gt;rev&lt;/code&gt; &lt;/dt&gt; &lt;dd&gt; &lt;p&gt; The &lt;code&gt;rev&lt;/code&gt; 
     *  attribute specifies a relationship that the author of the &lt;em&gt;linking&lt;/em&gt; 
     *  page has with the author of the &lt;em&gt;linked&lt;/em&gt; page. The example 
     *  here is: &lt;/p&gt; &lt;pre&gt;&lt;code&gt;&lt;span class="elem"&gt;&amp;lt;a&lt;/span&gt;&lt;span 
     *  class="attr"&gt;href&lt;/span&gt;="&lt;span class="attrVal"&gt;http://example.com/boats&lt;/span&gt;" 
     *  &lt;span class="attr highlight"&gt;rev&lt;/span&gt;="&lt;span class="attrVal"&gt;childOf&lt;/span&gt;"&lt;span 
     *  class="elem"&gt;&amp;gt;&lt;/span&gt;&lt;span class="text"&gt;The boat we 
     *  restored&lt;/span&gt;&lt;span class="elem"&gt;"&amp;lt;/a&amp;gt;&lt;/span&gt;&lt;/code&gt;&lt;/pre&gt; 
     *  &lt;p&gt;In this case the meaning of the link is reversed: the author of the 
     *  html above is a child of the author of &lt;code&gt;http://example.com/boats&lt;/code&gt;.&lt;/p&gt; 
     *  &lt;/dd&gt; &lt;/dl&gt; &lt;p&gt;The HTML and XHTML recommendations require 
     *  an HTML document to declare a custom profile if it uses any non-standard &lt;code&gt;rel&lt;/code&gt; 
     *  or &lt;code&gt;rev&lt;/code&gt; types. This is done by adding a &lt;code&gt;profile&lt;/code&gt; 
     *  attribute with a value of &lt;code&gt;http://purl.org/vocab/relationship/&lt;/code&gt; 
     *  to the document's &lt;code&gt;head&lt;/code&gt; element. &lt;/p&gt; &lt;pre&gt;&lt;code&gt; 
     *  &amp;lt;head profile="http://purl.org/vocab/relationship/"&amp;gt; &amp;lt;title&amp;gt;People 
     *  I Know&amp;lt;/title&amp;gt; &amp;lt;/head&amp;gt;&lt;/code&gt;&lt;/pre&gt; 
     *  &lt;h3&gt;Complete Example&lt;/h3&gt; &lt;pre&gt;&lt;code&gt; &amp;lt;html 
     *  profile="http://purl.org/vocab/relationship/"&amp;gt; &amp;lt;head&amp;gt; 
     *  &amp;lt;title&amp;gt;People I Know&amp;lt;/title&amp;gt; &amp;lt;/head&amp;gt; 
     *  &amp;lt;body&amp;gt; &amp;lt;p&amp;gt;Here are the people I know:&amp;lt;/p&amp;gt; 
     *  &amp;lt;ul&amp;gt; &amp;lt;li&amp;gt;&amp;lt;a href="http://example.com/~freddy" 
     *  rel="closeFriendOf"&amp;gt;Freddy (he's cool!)&amp;lt;/a&amp;gt;&amp;lt;/li&amp;gt; 
     *  &amp;lt;li&amp;gt;&amp;lt;a href="http://frooble.com/" rel="mentorOf"&amp;gt;Jimbo&amp;lt;/a&amp;gt;&amp;lt;/li&amp;gt; 
     *  &amp;lt;li&amp;gt;&amp;lt;a href="http://mmmm.com/klm" rel="friendOf"&amp;gt;Katie&amp;lt;/a&amp;gt;&amp;lt;/li&amp;gt; 
     *  &amp;lt;li&amp;gt;&amp;lt;a href="http://example.com/~omah" rel="worksWith"&amp;gt;Omah 
     *  (does the coding)&amp;lt;/a&amp;gt;&amp;lt;/li&amp;gt; &amp;lt;li&amp;gt;&amp;lt;a 
     *  href="http://example.com/~jason" rev="closeFriendOf employedBy"&amp;gt;Jason, 
     *  my henchman&amp;lt;/a&amp;gt;&amp;lt;/li&amp;gt; &amp;lt;/ul&amp;gt; &amp;lt;/body&amp;gt; 
     *  &amp;lt;/html&amp;gt; &lt;/code&gt;&lt;/pre&gt; &lt;h3&gt;RDF Interpretation&lt;/h3&gt; 
     *  &lt;p&gt;Custom parsers that extract RDF from (X)HTML can use the relationships 
     *  expressed in the links to infer the equivilent RDF triples. It should be remembered 
     *  that the relationship is between the authors of the pages not between the 
     *  pages themselves. Given the following link on a document at &lt;code&gt;http://example.com/mypage.html&lt;/code&gt;: 
     *  &lt;/p&gt; &lt;pre&gt;&lt;code&gt;&lt;span class="elem"&gt;&amp;lt;a&lt;/span&gt;&lt;span 
     *  class="attr"&gt;href&lt;/span&gt;="&lt;span class="attrVal"&gt;http://example.com/boats&lt;/span&gt;" 
     *  &lt;span class="attr highlight"&gt;rel&lt;/span&gt;="&lt;span class="attrVal"&gt;childOf&lt;/span&gt;"&lt;span 
     *  class="elem"&gt;&amp;gt;&lt;/span&gt;&lt;span class="text"&gt;The boat we 
     *  restored&lt;/span&gt;&lt;span class="elem"&gt;"&amp;lt;/a&amp;gt;&lt;/span&gt;&lt;/code&gt;&lt;/pre&gt; 
     *  &lt;p&gt;a suggested RDF extraction is:&lt;/p&gt; &lt;pre&gt;&lt;code&gt; 
     *  &amp;lt;foaf:Person&amp;gt; &amp;lt;foaf:maker rdf:resource="http://example.com/boats"/&amp;gt; 
     *  &amp;lt;rel:childOf&amp;gt; &amp;lt;foaf:Person&amp;gt; &amp;lt;foaf:maker 
     *  rdf:resource="http://example.com/mypage.html"/&amp;gt; &amp;lt;/foaf:Person&amp;gt; 
     *  &amp;lt;/rel:childOf&amp;gt; &amp;lt;/foaf:Person&amp;gt;&lt;/code&gt;&lt;/pre&gt;</p>
     */
    public static final Resource relations_INSTANCE = m_model.createResource( "http://purl.org/vocab/relationship/examples/2" );
    
}
