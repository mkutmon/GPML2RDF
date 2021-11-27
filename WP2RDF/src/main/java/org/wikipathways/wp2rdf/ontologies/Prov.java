package org.wikipathways.wp2rdf.ontologies;
 
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
 
/**
 * Vocabulary definitions from http://www.w3.org/TR/2012/WD-prov-o-20120503/prov.owl 
 * @author Auto-generated by schemagen on 14 Sep 2012 14:08 
 */
public class Prov {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.w3.org/ns/prov#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>An object property to express the accountability of an agent towards another 
     *  agent. The subordinate agent acted on behalf of the responsible agent in an 
     *  actual activity.</p>
     */
    public static final Property actedOnBehalfOf = m_model.createProperty( "http://www.w3.org/ns/prov#actedOnBehalfOf" );
    
    /** <p>The property used by an prov:ActivityInvolvement to cite the prov:Activity 
     *  that was involved with either an Activity or Entity. It can be used to refer 
     *  to the activity involved in generating an entity, informing another activity, 
     *  or starting another activity.</p>
     */
    public static final Property activity = m_model.createProperty( "http://www.w3.org/ns/prov#activity" );
    
    /** <p>The property used by a prov:AgentInvolvement to cite the Agent that was prov:involved 
     *  with either an Activity or Entity. It can be used to express the agent involved 
     *  in being responsible for an activity, being attributed to an entity, starting 
     *  or ending an activity, or being responsible for another subordinate agent 
     *  in an activity.</p>
     */
    public static final Property agent = m_model.createProperty( "http://www.w3.org/ns/prov#agent" );
    
    /** <p>An entity is alternate of another if they are both a specialization of some 
     *  common entity. The common entity does not need to be identified.</p>
     */
    public static final Property alternateOf = m_model.createProperty( "http://www.w3.org/ns/prov#alternateOf" );
    
    /** <p>Location is an optional attribute of Entity and Activity.</p> */
    public static final Property atLocation = m_model.createProperty( "http://www.w3.org/ns/prov#atLocation" );
    
    public static final Property atTime = m_model.createProperty( "http://www.w3.org/ns/prov#atTime" );
    
    /** <p>The dictionary was derived from the other by insertion. prov:qualifiedInsertion 
     *  shows details of the insertion, in particular the inserted key-value pairs.</p>
     */
    public static final Property derivedByInsertionFrom = m_model.createProperty( "http://www.w3.org/ns/prov#derivedByInsertionFrom" );
    
    /** <p>The dictionary was derived from the other by removal. prov:qualifiedRemoval 
     *  shows details of the removal, in particular the removed key-value pairs.</p>
     */
    public static final Property derivedByRemovalFrom = m_model.createProperty( "http://www.w3.org/ns/prov#derivedByRemovalFrom" );
    
    /** <p>The property used by a prov:DictionaryInvolvement to cite the prov:Dictionary 
     *  that was prov:involved in insertion or removal of elements of a collection.</p>
     */
    public static final Property dictionary = m_model.createProperty( "http://www.w3.org/ns/prov#dictionary" );
    
    /** <p>The time when an activity ended.</p> */
    public static final Property endedAtTime = m_model.createProperty( "http://www.w3.org/ns/prov#endedAtTime" );
    
    /** <p>The property used by an prov:EntityInvolvement to cite the Entity that was 
     *  prov:involved with either an Activity or Entity. It can be used to refer to 
     *  the entity involved in deriving another entity, being quoted or revised from, 
     *  being the source of another entity, or being used in an activity.</p>
     */
    public static final Property entity = m_model.createProperty( "http://www.w3.org/ns/prov#entity" );
    
    /** <p>This inverse of prov:wasGeneratedBy is defined so that Activities being described 
     *  can reference their generated outputs directly without needing to 'stop' and 
     *  start describing the Entity. This helps 'Activity-centric' modeling as opposed 
     *  to 'Entity-centric' modeling.</p>
     */
    public static final Property generated = m_model.createProperty( "http://www.w3.org/ns/prov#generated" );
    
    /** <p>The activity generating the derived entity and using the derived-from entity.</p> */
    public static final Property hadActivity = m_model.createProperty( "http://www.w3.org/ns/prov#hadActivity" );
    
    /** <p>The generation involving the generated entity and activity.</p> */
    public static final Property hadGeneration = m_model.createProperty( "http://www.w3.org/ns/prov#hadGeneration" );
    
    public static final Property hadOriginalSource = m_model.createProperty( "http://www.w3.org/ns/prov#hadOriginalSource" );
    
    /** <p>The Activity performed was described by the given plan resource. Activity 
     *  specifications, as referred to by plan links, are out of scope of this specification</p>
     */
    public static final Property hadPlan = m_model.createProperty( "http://www.w3.org/ns/prov#hadPlan" );
    
    /** <p>The agent who attributed to the original entity.</p> */
    public static final Property hadQuoted = m_model.createProperty( "http://www.w3.org/ns/prov#hadQuoted" );
    
    /** <p>The agent who is doing the quoting.</p> */
    public static final Property hadQuoter = m_model.createProperty( "http://www.w3.org/ns/prov#hadQuoter" );
    
    /** <p>When an instance of prov:Involvement uses the prov:hadRole property to cite 
     *  a prov:Role, it is providing a role for the instance referenced by the prov:entity 
     *  or the prov:activity properties. For example, :baking prov:used :spoon; prov:qualified 
     *  [ a prov:Usage; prov:entity :spoon; prov:hadRole roles:mixing_implement ].</p>
     */
    public static final Property hadRole = m_model.createProperty( "http://www.w3.org/ns/prov#hadRole" );
    
    /** <p>The usage involving the used entity and activity.</p> */
    public static final Property hadUsage = m_model.createProperty( "http://www.w3.org/ns/prov#hadUsage" );
    
    public static final Property hasAnnotation = m_model.createProperty( "http://www.w3.org/ns/prov#hasAnnotation" );
    
    /** <p>An object property to refer to the prov:KeyValuePair inserted into a prov:Collection.</p> */
    public static final Property inserted = m_model.createProperty( "http://www.w3.org/ns/prov#inserted" );
    
    /** <p>Subproperties of prov:involved may be be qualified by creating instances of 
     *  a corresponding prov:Involvement class. For example, the binary relation :baking 
     *  prov:used :spoon can be qualified by asserting :baking prov:qualified [ a 
     *  prov:Usage; prov:entity :baking; :foo :bar ] prov:involved should not be used 
     *  without also using one of its subproperties. Subproperties of prov:involved 
     *  may also be asserted directly without being qualified.</p>
     */
    public static final Property involved = m_model.createProperty( "http://www.w3.org/ns/prov#involved" );
    
    /** <p>Subproperties of prov:involvee are used to cite the object of an unqualified 
     *  PROV-O triple whose predicate is a subproperty of prov:involved (e.g. prov:used, 
     *  prov:wasGeneratedBy). prov:involvee is used much like rdf:object is used.</p>
     */
    public static final Property involvee = m_model.createProperty( "http://www.w3.org/ns/prov#involvee" );
    
    /** <p>The key of a KeyValuePair, which is an element of a prov:Collection.</p> */
    public static final Property key = m_model.createProperty( "http://www.w3.org/ns/prov#key" );
    
    /** <p>The key-value pair was part of the membership. A membership can have multiple 
     *  members.</p>
     */
    public static final Property member = m_model.createProperty( "http://www.w3.org/ns/prov#member" );
    
    /** <p>The collection included the specified membership of keys-values.</p> */
    public static final Property membership = m_model.createProperty( "http://www.w3.org/ns/prov#membership" );
    
    /** <p>If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the 
     *  Association using prov:qualifiedAssociation [ a prov:Association; prov:agent 
     *  :ag; :foo :bar ].</p>
     */
    public static final Property qualifiedAssociation = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedAssociation" );
    
    /** <p>If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it 
     *  was using prov:qualifiedAttribution [ a prov:Attribution; prov:agent :ag; 
     *  :foo :bar ].</p>
     */
    public static final Property qualifiedAttribution = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedAttribution" );
    
    /** <p>If this Activity prov:wasInformedBy Activity :a, then it can qualify how it 
     *  was Inform[ed] using prov:qualifiedInform [ a prov:Inform; prov:activity :a; 
     *  :foo :bar ].</p>
     */
    public static final Property qualifiedCommunication = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedCommunication" );
    
    /** <p>If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was 
     *  derived using prov:qualifiedDerivation [ a prov:Derivation; prov:entity :e; 
     *  :foo :bar ].</p>
     */
    public static final Property qualifiedDerivation = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedDerivation" );
    
    /** <p>If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was 
     *  ended using prov:qualifiedEnd [ a prov:End; prov:entity :e1; :foo :bar ].</p>
     */
    public static final Property qualifiedEnd = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedEnd" );
    
    /** <p>If this Activity prov:generated Entity :e, then it can qualify how it did 
     *  performed the Generation using prov:qualifiedGeneration [ a prov:Generation; 
     *  prov:entity :e; :foo :bar ].</p>
     */
    public static final Property qualifiedGeneration = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedGeneration" );
    
    /** <p>If this Dictionary prov:derivedByInsertionFrom another Dictionary :e, then 
     *  it can qualify how it did perform the Insertion using prov:qualifiedInsertion 
     *  [ a prov:Insertion; prov:dictionary :e; prov:inserted [a prov:KeyValuePair; 
     *  prov:key "k1"^^xsd:string; prov:value :foo] ].</p>
     */
    public static final Property qualifiedInsertion = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedInsertion" );
    
    /** <p>If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using 
     *  prov:qualifiedQuotation [ a prov:Quotation; prov:entity :e; :foo :bar ].</p>
     */
    public static final Property qualifiedQuotation = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedQuotation" );
    
    /** <p>If this Dictionary prov:derivedByRemovalFrom another Dictionary :e, then it 
     *  can qualify how it did perform the Removal using prov:qualifiedRemoval [ a 
     *  prov:Removal; prov:dictionary :c; prov:removed "k1"^^xsd:string ].</p>
     */
    public static final Property qualifiedRemoval = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedRemoval" );
    
    /** <p>If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with 
     *  prov:qualifiedResponsibility [ a prov:Responsibility; prov:agent :ag; :foo 
     *  :bar ].</p>
     */
    public static final Property qualifiedResponsibility = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedResponsibility" );
    
    /** <p>If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was 
     *  revised using prov:qualifiedRevision [ a prov:Revision; prov:entity :e; :foo 
     *  :bar ].</p>
     */
    public static final Property qualifiedRevision = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedRevision" );
    
    /** <p>If this Entity prov:hadOriginalSource Entity :e, then it can qualify how using 
     *  prov:qualifiedSource [ a prov:Source; prov:entity :e; :foo :bar ].</p>
     */
    public static final Property qualifiedSource = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedSource" );
    
    /** <p>If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it 
     *  was started using prov:qualifiedStart [ a prov:Start; prov:entity :e1; :foo 
     *  :bar ].</p>
     */
    public static final Property qualifiedStart = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedStart" );
    
    /** <p>If this Activity prov:wasStartedByActivity :a, then it can qualify how it 
     *  was started using prov:qualifiedStart [ a prov:Start; prov:activity :a; :foo 
     *  :bar ].</p>
     */
    public static final Property qualifiedStartByActivity = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedStartByActivity" );
    
    /** <p>If this prov:wasAttributedTo Entity :e, then it can qualify how using prov:qualifiedTrace 
     *  [ a prov:Trace; prov:entity :e; :foo :bar ]. If this prov:wasAttributedTo 
     *  Activity :a, then it can qualify how using prov:qualifiedTrace [ a prov:Trace; 
     *  prov:activity :a; :foo :bar ].</p>
     */
    public static final Property qualifiedTrace = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedTrace" );
    
    /** <p>If this Activity prov:used Entity :e, then it can qualify how it used it using 
     *  prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ].</p>
     */
    public static final Property qualifiedUsage = m_model.createProperty( "http://www.w3.org/ns/prov#qualifiedUsage" );
    
    /** <p>The key removed in a Removal.</p> */
    public static final Property removedKey = m_model.createProperty( "http://www.w3.org/ns/prov#removedKey" );
    
    /** <p>An entity is a specialization of another if they both refer to some common 
     *  thing but the former is a more constrained entity than the former. The common 
     *  entity does not need to be identified.</p>
     */
    public static final Property specializationOf = m_model.createProperty( "http://www.w3.org/ns/prov#specializationOf" );
    
    /** <p>The time when an activity started.</p> */
    public static final Property startedAtTime = m_model.createProperty( "http://www.w3.org/ns/prov#startedAtTime" );
    
    /** <p>An object property to link back an entity to another by means of derivation 
     *  or responsibility relations, possibly repeatedly traversed.</p>
     */
    public static final Property tracedTo = m_model.createProperty( "http://www.w3.org/ns/prov#tracedTo" );
    
    /** <p>A prov:Entity that was used by this prov:Activity. For example, :baking prov:used 
     *  :spoon, :egg, :oven .</p>
     */
    public static final Property used = m_model.createProperty( "http://www.w3.org/ns/prov#used" );
    
    /** <p>The value of a KeyValuePair.</p> */
    public static final Property value = m_model.createProperty( "http://www.w3.org/ns/prov#value" );
    
    /** <p>An prov:Agent that had some (unspecified) responsibility for the occurrence 
     *  of this prov:Activity.</p>
     */
    public static final Property wasAssociatedWith = m_model.createProperty( "http://www.w3.org/ns/prov#wasAssociatedWith" );
    
    /** <p>Attribution is the ascribing of an entity to an agent.</p> */
    public static final Property wasAttributedTo = m_model.createProperty( "http://www.w3.org/ns/prov#wasAttributedTo" );
    
    /** <p>A derivation is a transformation of an entity into another, a construction 
     *  of an entity into another, or an update of an entity, resulting in a new one.</p>
     */
    public static final Property wasDerivedFrom = m_model.createProperty( "http://www.w3.org/ns/prov#wasDerivedFrom" );
    
    /** <p>End is when an activity is deemed to have ended. An end may refer to an entity, 
     *  known as trigger, that terminated the activity.</p>
     */
    public static final Property wasEndedBy = m_model.createProperty( "http://www.w3.org/ns/prov#wasEndedBy" );
    
    /** <p>wasGeneratedBy links Entitites with Activity representing that entity was 
     *  generated as a result of Activity</p>
     */
    public static final Property wasGeneratedBy = m_model.createProperty( "http://www.w3.org/ns/prov#wasGeneratedBy" );
    
    /** <p>An activity a2 is dependent on or informed by another activity a1, by way 
     *  of some unspecified entity that is generated by a1 and used by a2.</p>
     */
    public static final Property wasInformedBy = m_model.createProperty( "http://www.w3.org/ns/prov#wasInformedBy" );
    
    public static final Property wasInvalidatedBy = m_model.createProperty( "http://www.w3.org/ns/prov#wasInvalidatedBy" );
    
    /** <p>An entity is derived from an original entity by copying, or "quoting", some 
     *  or all of it.</p>
     */
    public static final Property wasQuotedFrom = m_model.createProperty( "http://www.w3.org/ns/prov#wasQuotedFrom" );
    
    /** <p>A revision is a derivation that revises an entity into a revised version.</p> */
    public static final Property wasRevisionOf = m_model.createProperty( "http://www.w3.org/ns/prov#wasRevisionOf" );
    
    /** <p>Start is when an activity is deemed to have started. A start may refer to 
     *  an entity, known as trigger, that initiated the activity.</p>
     */
    public static final Property wasStartedBy = m_model.createProperty( "http://www.w3.org/ns/prov#wasStartedBy" );
    
    /** <p>The start of an activity with an implicit trigger generated by another activity.</p> */
    public static final Property wasStartedByActivity = m_model.createProperty( "http://www.w3.org/ns/prov#wasStartedByActivity" );
    
    /** <p>Note that there are kinds of accounts (e.g. handwritten letters, audio recordings, 
     *  etc.) that are not expressed in PROV-O, but can be still be described by PROV-O.</p>
     */
    public static final Resource Account = m_model.createResource( "http://www.w3.org/ns/prov#Account" );
    
    /** <p>An activity is something that occurs over a period of time and acts upon or 
     *  with entities. This action can take multiple forms: consuming, processing, 
     *  transforming, modifying, relocating, using, generating, or being associated 
     *  with entities. Activities that operate on digital entities may for example 
     *  move, copy, or duplicate them.</p>
     */
    public static final Resource Activity = m_model.createResource( "http://www.w3.org/ns/prov#Activity" );
    
    /** <p>prov:ActivityInvolvement provides descriptions of any binary involvement between 
     *  any instance and an prov:Activity.</p>
     */
    public static final Resource ActivityInvolvement = m_model.createResource( "http://www.w3.org/ns/prov#ActivityInvolvement" );
    
    /** <p>An agent is a type of entity that bears some form of responsibility for an 
     *  activity taking place.</p>
     */
    public static final Resource Agent = m_model.createResource( "http://www.w3.org/ns/prov#Agent" );
    
    /** <p>prov:AgentInvolvement provides descriptions of any binary involvement between 
     *  any instance and an prov:Agent.</p>
     */
    public static final Resource AgentInvolvement = m_model.createResource( "http://www.w3.org/ns/prov#AgentInvolvement" );
    
    /** <p>An instance of prov:Association provides additional descriptions about the 
     *  binary prov:wasAssociatedWith relation from an prov:Activity to some prov:Agent 
     *  that is responsible for it. For example, :baking prov:wasAssociatedWith :baker; 
     *  prov:qualified [ a prov:Association; prov:entity :baker; :foo :bar ].</p>
     */
    public static final Resource Association = m_model.createResource( "http://www.w3.org/ns/prov#Association" );
    
    /** <p>An instance of prov:Attribution provides additional descriptions about the 
     *  binary prov:wasAttributedTo relation from an prov:Entity to some prov:Agent 
     *  that is responsible for it. For example, :cake prov:wasAttributedTo :baker; 
     *  prov:qualified [ a prov:Attribution; prov:entity :baker; :foo :bar ].</p>
     */
    public static final Resource Attribution = m_model.createResource( "http://www.w3.org/ns/prov#Attribution" );
    
    /** <p>An instance of prov:Communication provides additional descriptions about the 
     *  binary prov:wasInformedBy relation from an informed prov:Activity to the prov:Activity 
     *  that informed it. For example, :you_jumping_off_bridge prov:wasInformedBy 
     *  :everyone_else_jumping_off_bridge; prov:qualifiedCommunication [ a prov:Communication; 
     *  prov:entity :everyone_else_jumping_off_bridge; :foo :bar ].</p>
     */
    public static final Resource Communication = m_model.createResource( "http://www.w3.org/ns/prov#Communication" );
    
    /** <p>An instance of prov:Derivation provides additional descriptions about the 
     *  binary prov:wasDerivedFrom relation from some prov:Entity to another prov:Entity. 
     *  For example, :chewed_bubble_gum prov:wasDerivedFrom :unwrapped_bubble_gum; 
     *  prov:qualified [ a prov:Derivation; prov:entity :unwrapped_bubble_gum; :foo 
     *  :bar ].</p>
     */
    public static final Resource Derivation = m_model.createResource( "http://www.w3.org/ns/prov#Derivation" );
    
    /** <p>This concept allows for the provenance of the dictionary, but also of its 
     *  constituents to be expressed. Such a notion of dictionary corresponds to a 
     *  wide variety of concrete data structures, such as a maps or associative arrays.A 
     *  given dictionary forms a given structure for its members. A different structure 
     *  (obtained either by insertion or removal of members) constitutes a different 
     *  dictionary.</p>
     */
    public static final Resource Dictionary = m_model.createResource( "http://www.w3.org/ns/prov#Dictionary" );
    
    /** <p>prov:DictionaryInvolvement provides descriptions of any binary involvement 
     *  between any instance and a prov:Dictionary.</p>
     */
    public static final Resource DictionaryInvolvement = m_model.createResource( "http://www.w3.org/ns/prov#DictionaryInvolvement" );
    
    /** <p>An empty dictionary.</p> */
    public static final Resource EmptyDictionary = m_model.createResource( "http://www.w3.org/ns/prov#EmptyDictionary" );
    
    /** <p>An instance of prov:End provides additional descriptions about the binary 
     *  prov:wasEndedBy relation from some ended prov:Activity to an prov:Entity that 
     *  ended it. For example, :ball_game prov:wasEndedBy :buzzer; prov:qualified 
     *  [ a prov:Usage; prov:entity :buzzer; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime 
     *  ].</p>
     */
    public static final Resource End = m_model.createResource( "http://www.w3.org/ns/prov#End" );
    
    /** <p>An entity is a thing one wants to provide provenance for. For the purpose 
     *  of this specification, things can be physical, digital, conceptual, or otherwise; 
     *  things may be real or imaginary.</p>
     */
    public static final Resource Entity = m_model.createResource( "http://www.w3.org/ns/prov#Entity" );
    
    /** <p>prov:EntityInvolvement provides descriptions of any binary involvement between 
     *  any instance and an prov:Entity.</p>
     */
    public static final Resource EntityInvolvement = m_model.createResource( "http://www.w3.org/ns/prov#EntityInvolvement" );
    
    /** <p>An instance of prov:Generation provides additional descriptions about the 
     *  binary prov:wasGeneratedBy relation from a generated prov:Entity to the prov:Activity 
     *  that generated it. For example, :cake prov:wasGeneratedBy :baking; prov:qualifiedGeneration 
     *  [ a prov:Generation; prov:entity :baking; :foo :bar ].</p>
     */
    public static final Resource Generation = m_model.createResource( "http://www.w3.org/ns/prov#Generation" );
    
    /** <p>Insertion is a derivation that transforms a dictionary into another, by insertion 
     *  of one or more key-value pairs.</p>
     */
    public static final Resource Insertion = m_model.createResource( "http://www.w3.org/ns/prov#Insertion" );
    
    /** <p>An instantaneous event, or event for short, happens in the world and marks 
     *  a change in the world, in its activities and in its entities. The term 'event' 
     *  is commonly used in process algebra with a similar meaning. Events represent 
     *  communications or interactions; they are assumed to be atomic and instantaneous.</p>
     */
    public static final Resource InstantaneousEvent = m_model.createResource( "http://www.w3.org/ns/prov#InstantaneousEvent" );
    
    public static final Resource Invalidation = m_model.createResource( "http://www.w3.org/ns/prov#Invalidation" );
    
    /** <p>Any resource that involved an prov:Activity, prov:Entity, or prov:Agent can 
     *  qualify its involvement by also referencing an instance of prov:Involvement. 
     *  Instances of prov:Involvement reference the involved Activity, Entity, or 
     *  Agent (using prov:activity, prov:entity, or prov:agent, respectively) and 
     *  may be described with any kind of attributes, including user-defined attributes 
     *  and those provided by PROV (prov:hadRole, prov:hadPlan, prov:atTime, prov:hadLocation). 
     *  A description (via prov:Involvement) of the binary involvement implies the 
     *  assertion of the binary involvement.</p>
     */
    public static final Resource Involvement = m_model.createResource( "http://www.w3.org/ns/prov#Involvement" );
    
    /** <p>A key-value pair. Part of a prov:Collection through prov:Membership. The key 
     *  is any RDF Literal, the value is a prov:Entity.</p>
     */
    public static final Resource KeyValuePair = m_model.createResource( "http://www.w3.org/ns/prov#KeyValuePair" );
    
    /** <p>A location can be an identifiable geographic place (ISO 19112), but it can 
     *  also be a non-geographic place such as a directory, row, or column. As such, 
     *  there are numerous ways in which location can be expressed, such as by a coordinate, 
     *  address, landmark, and so forth.</p>
     */
    public static final Resource Location = m_model.createResource( "http://www.w3.org/ns/prov#Location" );
    
    /** <p>Described members of a collection, in the form of key-value pairs. The Membership 
     *  resource can also be annotated with attributes.</p>
     */
    public static final Resource Membership = m_model.createResource( "http://www.w3.org/ns/prov#Membership" );
    
    /** <p>Attribute-value pairs occurring in notes are application specific.</p> */
    public static final Resource Note = m_model.createResource( "http://www.w3.org/ns/prov#Note" );
    
    /** <p>Agents of type Organization are social institutions such as companies, societies 
     *  etc.</p>
     */
    public static final Resource Organization = m_model.createResource( "http://www.w3.org/ns/prov#Organization" );
    
    /** <p>Agents of type Person are people.</p> */
    public static final Resource Person = m_model.createResource( "http://www.w3.org/ns/prov#Person" );
    
    /** <p>There exist no prescriptive requirement on the nature of plans, their representation, 
     *  the actions or steps they consist of, or their intended goals. Since plans 
     *  may evolve over time, it may become necessary to track their provenance, so 
     *  plans themselves are entities. Representing the plan explicitly in the provenance 
     *  can be useful for various tasks: for example, to validate the execution as 
     *  represented in the provenance record, to manage expectation failures, or to 
     *  provide explanations.</p>
     */
    public static final Resource Plan = m_model.createResource( "http://www.w3.org/ns/prov#Plan" );
    
    /** <p>An instance of prov:Quotation provides additional descriptions about the binary 
     *  prov:wasQuotedFrom relation from some prov:Entity to another prov:Entity. 
     *  For example, :here_is_looking_at_you_kid prov:wasQuotedFrom :casablanca_script; 
     *  prov:qualified [ a prov:Quotation; prov:entity :casablanca_script; :foo :bar 
     *  ].</p>
     */
    public static final Resource Quotation = m_model.createResource( "http://www.w3.org/ns/prov#Quotation" );
    
    /** <p>Removal is a derivation that transforms a dictionary into another, by removing 
     *  one or more key-value pairs.</p>
     */
    public static final Resource Removal = m_model.createResource( "http://www.w3.org/ns/prov#Removal" );
    
    /** <p>An instance of prov:Responsibility provides additional descriptions about 
     *  the binary prov:actedOnBehalfOf relation from a performing prov:Agent to some 
     *  prov:Agent for whom it was performed. For example, :mixing prov:wasAssociatedWith 
     *  :toddler . :toddler prov:actedOnBehalfOf :mother; prov:qualified [ a prov:Responsiblity; 
     *  prov:entity :mother; :foo :bar ].</p>
     */
    public static final Resource Responsibility = m_model.createResource( "http://www.w3.org/ns/prov#Responsibility" );
    
    /** <p>An instance of prov:Revision provides additional descriptions about the binary 
     *  prov:wasRevisionOf relation from some prov:Entity to another prov:Entity. 
     *  For example, :draft_2 prov:wasRevisionOf :draft_1; prov:qualified [ a prov:Source; 
     *  prov:entity :draft_1; :foo :bar ].</p>
     */
    public static final Resource Revision = m_model.createResource( "http://www.w3.org/ns/prov#Revision" );
    
    /** <p>A Role is the function of an entity with respect to an activity, in the context 
     *  of a usage, generation, association, start, and end.</p>
     */
    public static final Resource Role = m_model.createResource( "http://www.w3.org/ns/prov#Role" );
    
    /** <p>A software agent is running software.</p> */
    public static final Resource SoftwareAgent = m_model.createResource( "http://www.w3.org/ns/prov#SoftwareAgent" );
    
    /** <p>An instance of prov:Source provides additional descriptions about the binary 
     *  prov:hadOriginalSource relation from some prov:Entity to another prov:Entity. 
     *  For example, :blog prov:hadOriginalSource :newsArticle; prov:qualified [ a 
     *  prov:Source; prov:entity :newsArticle; :foo :bar ].</p>
     */
    public static final Resource Source = m_model.createResource( "http://www.w3.org/ns/prov#Source" );
    
    /** <p>An instance of prov:Start provides additional descriptions about the binary 
     *  prov:wasStartedBy relation from some started prov:Activity to an prov:Entity 
     *  that started it. For example, :foot_race prov:wasStartedBy :bang; prov:qualified 
     *  [ a prov:Usage; prov:entity :bang; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime 
     *  ].</p>
     */
    public static final Resource Start = m_model.createResource( "http://www.w3.org/ns/prov#Start" );
    
    /** <p>An instance of prov:StartedByActivity provides additional descriptions about 
     *  the binary prov:wasStartedByActivity relation from some started prov:Activity 
     *  to another prov:Activity started it. For example, :second_leg_of_relay prov:wasStartedByActivity 
     *  :handed_baton; prov:qualified [ a prov:Usage; prov:entity :handed_baton; :foo 
     *  :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ].</p>
     */
    public static final Resource StartByActivity = m_model.createResource( "http://www.w3.org/ns/prov#StartByActivity" );
    
    /** <p>An instance of prov:Trace provides additional descriptions about the binary 
     *  prov:tracedTo relation from some prov:Entity to some other prov:Element. For 
     *  example, :stomach_ache prov:tracedTo :spoon; prov:qualified [ a prov:Trace; 
     *  prov:entity :spoon; :foo :bar ].</p>
     */
    public static final Resource Trace = m_model.createResource( "http://www.w3.org/ns/prov#Trace" );
    
    /** <p>An instance of prov:Usage provides additional descriptions about the binary 
     *  prov:used relation from some prov:Activity to an prov:Entity that it used. 
     *  For example, :keynote prov:used :podium; prov:qualified [ a prov:Usage; prov:entity 
     *  :podium; :foo :bar ].</p>
     */
    public static final Resource Usage = m_model.createResource( "http://www.w3.org/ns/prov#Usage" );
    
}
