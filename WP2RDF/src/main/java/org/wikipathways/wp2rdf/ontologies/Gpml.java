package org.wikipathways.wp2rdf.ontologies;
/* CVS $Id: $ */
 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from gpml.rdf 
 * @author Auto-generated by schemagen on 24 Apr 2015 13:36 
 */
public class Gpml {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://vocabularies.wikipathways.org/gpml#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property ALIGN = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#align" );
    
    public static final Property ARROW_HEAD = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#arrowHead" );
    
    /** <p>The person who created or edited the pathway in question.</p> */
    public static final Property AUTHOR = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#author" );
    
    /** <p>Refers to a biopax:PublicationXref.</p> */
    public static final Property BIOPAX_REF = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#biopaxRef" );
    
    /** <p>Range minimum is zero</p> */
    public static final Property BOARD_HEIGHT = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#boardHeight" );
    
    /** <p>Range minimum is zero</p> */
    public static final Property BOARD_WIDTH = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#boardWidth" );
    
    /** <p>Middle of a pathway element in the x-direction.</p> */
    public static final Property CENTER_X = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#centerX" );
    
    /** <p>Middle of a pathway element in the y-direction.</p> */
    public static final Property CENTER_Y = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#centerY" );
    
    /** <p>This would be easier to work with if it had a hash "#" at the beginning to 
     *  be consistent with CSS.</p>
     */
    public static final Property COLOR = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#color" );
    
    // TODO: add on vocabularies.wikipathways.org
    public static final Property COMMENT_TEXT = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#commentText" );

    /** <p>&lt;p&gt; &lt;b&gt;Definition:&lt;/b&gt; Specifies a set of rules to govern 
     *  layout of Graphical Lines and Interactions. &lt;/p&gt; &lt;ul&gt; &lt;li&gt;PathVisio 
     *  (Java): Line Type&lt;/li&gt; &lt;li&gt;GPML: ConnectorType&lt;/li&gt; &lt;/ul&gt;</p>
     */
    public static final Property CONNECTOR_TYPE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#connectorType" );
    
    /** <p>See http://www.biopax.org/release/biopax-level3.owl#dataSource</p> */
    public static final Property DATA_SOURCE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#data-Source" );
    
    /** <p>Equivalent to http://www.biopax.org/release/biopax-level3.owl#db</p> */
    public static final Property DATABASE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#database" );
    
    /** <p>Here comes the description on: email</p> */
    public static final Property EMAIL = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#email" );
    
    public static final Property FILL_COLOR = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fillColor" );
    
    /** <p>Collection of different font attributes.</p> */
    public static final Property FONT_ATTRIBUTES = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontAttributes" );
    
    public static final Property FONT_DECORATION = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontDecoration" );
    
    public static final Property FONT_NAME = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontName" );
    
    public static final Property FONT_SIZE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontSize" );
    
    /** <p>Font Strikethru of the objects (DataNode, Label, Shape).</p> */
    public static final Property FONT_STRIKETHRU = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontStrikethru" );
    
    /** <p>The font style of the pathway element (DataNode, Label, Shape).</p> */
    public static final Property FONT_STYLE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontStyle" );
    
    /** <p>Thickness of the font used, e.g a bold font would have more weight. Used for 
     *  DataNodes, Labels and Shapes.</p>
     */
    public static final Property FONT_WEIGHT = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontWeight" );
    
    /** <p>A GraphId is a unique (per Pathway) identifier for a pathway element, such 
     *  as DataNode, Interaction, GraphicalLine, Label, Point, Group, Shape, State 
     *  and Anchor.</p>
     */
    public static final Property GRAPH_ID = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#graphId" );
    
    /** <p>A GraphRef indicates a "depends on" or child/parent relationship between two 
     *  Pathway elements. The element with the GraphRef is the child, and the element 
     *  referred to by the GraphRef is the parent. The parent's GraphId will be specified 
     *  by the child's GraphRef.</p>
     */
    public static final Property GRAPH_REF = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#graphRef" );
    
    /** <p>Graphics is a collection of properties. We think the elements should specify 
     *  the subproperties directly but it is still good to keep the superproperty 
     *  in as well.</p>
     */
    public static final Property GRAPHICS = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#graphics" );
    
    /** <p>Uniquely identifies a gpml:Group in a gpml:Pathway.</p> */
    public static final Property GROUP_ID = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#groupId" );
    
    /** <p>A GroupRef indicates that its element is part of the gpml:Group with the specified 
     *  GroupId. DataNode, GraphicalLine, Group, Interaction, Label and Shape can 
     *  be part of a group.</p>
     */
    public static final Property GROUP_REF = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#groupRef" );
    
    /** <p>An interaction or graphicalLine that has an anchor.</p> */
    public static final Property HAS_ANCHOR = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasAnchor" );
    
    /** <p>Links the attribute to the parent object (DataNode, GraphicalLine, Group, 
     *  Interaction, Label, Pathway, Shape, State)</p>
     */
    public static final Property HAS_ATTRIBUTE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasAttribute" );
    
    /** <p>A pathway linking to a BioPAX object.</p> */
    public static final Property HAS_BIOPAX = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasBiopax" );
    
    /** <p>Links a comment to its parent object (DataNode, GraphicalLine, Group, Interaction, 
     *  Label, Pathway, Shape, State)</p>
     */
    public static final Property HAS_COMMENT = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasComment" );
    
    /** <p>Links the dataNode to the parent pathway.</p> */
    public static final Property HAS_DATA_NODE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasDataNode" );
    
    /** <p>Links the graphicalLine to the parent pathway.</p> */
    public static final Property HAS_GRAPHICAL_LINE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasGraphicalLine" );
    
    /** <p>Links the groups to the pathway.</p> */
    public static final Property HAS_GROUP = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasGroup" );
    
    /** <p>Links an InfoBox object to a Pathway.</p> */
    public static final Property HAS_INFO_BOX = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasInfoBox" );
    
    /** <p>Links the interaction to the parent pathway.</p> */
    public static final Property HAS_INTERACTION = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasInteraction" );
    
    /** <p>Links the labels to the pathway.</p> */
    public static final Property HAS_LABEL = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasLabel" );
    
    /** <p>Links a Legend to the Pathway.</p> */
    public static final Property HAS_LEGEND = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasLegend" );
    
    /** <p>An interaction or graphical line that has a point.</p> */
    public static final Property HAS_POINT = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasPoint" );
    
    /** <p>Links a publicationXref to its parent object (DataNode, GraphicalLine, Group, 
     *  Interaction, Label, Pathway, Shape, State)</p>
     */
    public static final Property HAS_PUBLICATION_XREF = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasPublicationXref" );
    
    /** <p>Links a shape to the pathway.</p> */
    public static final Property HAS_SHAPE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasShape" );
    
    /** <p>Links the state object to the parent pathway.</p> */
    public static final Property HAS_STATE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasState" );
    
    /** <p>Links a Xref to its parent object (DataNode, Interaction, State)</p> */
    public static final Property HAS_XREF = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasXref" );
    
    /** <p>The height of a DataNode, Label, Shape or State object</p> */
    public static final Property HEIGHT = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#height" );
    
    /** <p>The possible hyperlink in a Label in a pathway.</p> */
    public static final Property HREF = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#href" );
    
    /** <p>The identifier of a PublicationXref or Xref object.</p> */
    public static final Property ID = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#id" );
    
    /** <p>Key of the key/value pair in the Attribute class.</p> */
    public static final Property KEY = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#key" );
    
    /** <p>The date of the last modification of the pathway.</p> */
    public static final Property LAST_MODIFIED = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#last-Modified" );
    
    /** <p>The license of a pathway.</p> */
    public static final Property LICENSE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#license" );
    
    /** <p>The line style of a GraphicalLine or Interaction as well as the line style 
     *  of a border of a DataNode, Label, Shape or State.</p>
     */
    public static final Property LINE_STYLE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#lineStyle" );
    
    /** <p>The thickness of a GraphicalLine or Interaction as well as the border thickness 
     *  for DataNodes, Labels, Shapes and States.</p>
     */
    public static final Property LINE_THICKNESS = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#lineThickness" );
    
    /** <p>The maintainer of the pathway. Currently not used in WP.</p> */
    public static final Property MAINTAINER = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#maintainer" );
    
    /** <p>The name of a pathway.</p> */
    public static final Property NAME = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#name" );
    
    /** <p>The organism of the pathway. Latin name usually provided by BridgeDb.</p> */
    public static final Property ORGANISM = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#organism" );
    
    /** <p>Position of an anchor on the line it belongs to.</p> */
    public static final Property POSITION = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#position" );
    
    public static final Property RECT_ATTRIBUTES = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#rectAttributes" );
    
    /** <p>relX - RelX is the x-coordinate used when a point or state is linked to a 
     *  another object - relative coordinate to the object that it is linked to (0,0 
     *  - center, 1,1 - bottom-right).</p>
     */
    public static final Property REL_X = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#relX" );
    
    /** <p>RelY is the y-coordinate used when a point or state is linked to a another 
     *  object - relative coordinate to the object that it is linked to (0,0 - center, 
     *  1,1 - bottom-right).</p>
     */
    public static final Property REL_Y = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#relY" );
    
    /** <p>Rotation of a shape.</p> */
    public static final Property ROTATION = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#rotation" );
    
    /** <p>Shape of an anchor.</p> */
    public static final Property SHAPE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#shape" );
    
    public static final Property SHAPE_STYLE_ATTRIBUTES = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#shapeStyleAttributes" );
    
    /** <p>Currently: Specifies the glyph (graphical representation) to use for GPML 
     *  elements (DataNode, Label, Shape, State) Proposed: Expand it to also describe 
     *  Anchors. It should replace the term currently used to specify the graphical 
     *  representation of an Anchor. The current term is "Shape," which conflicts 
     *  with the GPML element named "Shape." See details for term "Shape."</p>
     */
    public static final Property SHAPE_TYPE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#shapeType" );
    
    /** <p>The source of a comment.</p> */
    public static final Property SOURCE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#source" );
    
    /** <p>The type of a State.</p> */
    public static final Property STATE_TYPE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#stateType" );
    
    /** <p>The style of a group.</p> */
    public static final Property STYLE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#style" );
    
    /** <p>TextLabel of an object (DataNode, Group, Label, Shape, State).</p> */
    public static final Property TEXTLABEL = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#textlabel" );
    
    /** <p>Specifies the type of an object (DataNode, GraphicalLine, Interaction)</p> */
    public static final Property TYPE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#type" );
    
    /** <p>Vertical alignment of a datanode, shape or label.</p> */
    public static final Property VALIGN = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#valign" );
    
    /** <p>Value of the key/value pair in the Attribute class.</p> */
    public static final Property VALUE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#value" );
    
    /** <p>The version of a Pathway (currently not used in WP).</p> */
    public static final Property VERSION = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#version" );
    
    /** <p>The width of an object (DataNode, Label, Shape, State).</p> */
    public static final Property WIDTH = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#width" );
    
    /** <p>The x-coordinate of a point in the 2-dimensional plane in which a pathway 
     *  is drawn.</p>
     */
    public static final Property X = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#x" );

    // TODO: add xref id + datasource to vocabulary!!
    public static final Property XREF_ID = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#xrefId" );

    public static final Property XREF_DATASOURCE = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#xrefDataSource" );

    
    /** <p>The y-coordinate of a point in the 2-dimensional plane a pathway is drawn.</p> */
    public static final Property Y = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#y" );
    
    /** <p>Indicates the zorder of the object in the pathway.</p> */
    public static final Property ZORDER = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#zorder" );
    
    public static final Resource ANCHOR = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Anchor" );
    
    public static final Resource ATTRIBUTE = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Attribute" );
    
    /** <p>Element used to embed &lt;a href="http://www.biopax.org/owldoc/Level3/"&gt;Biopax&lt;/a&gt; 
     *  (namespace: &lt;a href="http://www.biopax.org/release/biopax-level3.owl"&gt;http://www.biopax.org/release/biopax-level3.owl&lt;/a&gt;) 
     *  content in a GPML document.</p>
     */
    public static final Resource BIOPAX = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Biopax" );
    
    public static final Resource COMMENT = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Comment" );
    
    /** <p>denotes a biological entity that forms a node in a pathway and has some biological 
     *  meaning associated with it. For a list of the gpml:DataNode types supported 
     *  at WikiPathways, see the range for &lt;a href="http://vocabularies.wikipathways.org/gpml#Type"&gt;gpml:Type&lt;/a&gt;.</p>
     */
    public static final Resource DATA_NODE = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#DataNode" );
    
    /** <p>A connector between graphical shapes or between a graphical shape and a biopax:Entity.</p> */
    public static final Resource GRAPHICAL_LINE = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#GraphicalLine" );
    
    /** <p>A collection of structurally or functionally similar or related pathway elements.</p> */
    public static final Resource GROUP = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Group" );
    
    /** <p>Currently just a placeholder -- not used.</p> */
    public static final Resource INFO_BOX = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#InfoBox" );
    
    /** <p>defines the relationship between the two entities it connects. The entities 
     *  can be DataNodes or Anchors.</p>
     */
    public static final Resource INTERACTION = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Interaction" );
    
    /** <p>A label is a text box which can be used to describe the elements of a pathway. 
     *  It is mostly used as a name tag, to describe datanodes, interactions or cellular 
     *  compartments in a pathway.</p>
     */
    public static final Resource LABEL = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Label" );
    
    /** <p>An explanatory list of the colors used for visualizing data on the pathway. 
     *  Currently just a placeholder element -- not used.</p>
     */
    public static final Resource LEGEND = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Legend" );
    
    /** <p>A graph diagram representing a biological process. Nodes of which represent 
     *  genes, proteins, metabolites etc and the edges connecting two nodes represent 
     *  the relationship between them, i.e how the two nodes interact.</p>
     */
    public static final Resource PATHWAY = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Pathway" );
    
    public static final Resource POINT = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Point" );
    
    public static final Resource PUBLICATION_XREF = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#PublicationXref" );
    
    /** <p>Shape can refer to two different things in GPML, both of which are associated 
     *  with graphical elements.</p>
     */
    public static final Resource SHAPE_CLASS = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Shape" );
    
    /** <p>The particular condition that biological entity is in at a specific time, 
     *  e.g a protein may be phosphorylated or not, so phosphorylation is a state 
     *  that a protein may have.</p>
     */
    public static final Resource STATE = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#State" );
    
    public static final Resource XREF = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Xref" );
}
