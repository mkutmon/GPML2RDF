package org.wikipathways.wp2rdf.ontologies;
 
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
 
/**
 * Vocabulary definitions from http://cheminfov.informatics.indiana.edu:8080/chem2bio2rdf.owl 
 * @author Auto-generated by schemagen on 25 Aug 2011 12:59 
 */
public class Chem2bio2rdf {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://chem2bio2rdf.org/chem2bio2rdf.owl#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The addition of a ADP-ribosyl group.</p> */
    public static final Resource ADP_ribosylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#ADP-ribosylation" );
    
    /** <p>The abundance of a chemical (if chemical synthesis is not known).</p> */
    public static final Resource Abundance = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Abundance" );
    
    /** <p>The addition of an acetyl group.</p> */
    public static final Resource Acetylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Acetylation" );
    
    public static final Resource Activation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Activation" );
    
    /** <p>An elemental function of a molecule.</p> */
    public static final Resource Activity = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Activity" );
    
    /** <p>The addition of an acyl group.</p> */
    public static final Resource Acylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Acylation" );
    
    public static final Resource Agonism = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Agonism" );
    
    /** <p>The addition of an alkyl group.</p> */
    public static final Resource Alkylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Alkylation" );
    
    /** <p>The addition of an amine group.</p> */
    public static final Resource Amination = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Amination" );
    
    public static final Resource Antagonism = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Antagonism" );
    
    /** <p>Definition: the genomic responses to chemical compounds (from wiki) Comments: 
     *  In general, it describe the physical interaction between compound and gene 
     *  (or gene expression products), it always have binding affinity values. In 
     *  addition, we consider drug target interaction as chemogenomics, although occasionally, 
     *  the drug is not really interacting with the target. Synonyms: DrugTarget Instance 
     *  examples: http://chem2bio2rdf.org/bindingdb/resource/bindingdb_interaction/12 
     *  Related Databases: DrugBank, TTD, BindingMOAD, BindingDB, ChEMBL, PubChem 
     *  BioAssay, Kidb, QSAR, MATADOR</p>
     */
    public static final Resource Binding = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Binding" );
    
    public static final Resource BindingAssay = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#BindingAssay" );
    
    /** <p>Definition: A scientific experiment to measure the effects of some substance 
     *  on target, cell, or a living organism (wiki) Comments: refer to BioAssay Ontology 
     *  project. Should be further carefully defined. Since we are focusing on the 
     *  binding assay which has particular targets and provides outcomes (i.e, IC50, 
     *  EC50). Need to think whether should set functional assay, ADMET, and binding 
     *  Assay as data properties or subclasses. Synonyms: Instance examples: http://chem2bio2rdf.org/chembl/resource/chembl_assays/14 
     *  http://chem2bio2rdf.org/pubchem/resource/pubchem_bioassay_interaction/1002 
     *  Related Databases: PubChem BioAssay, ChEMBL Bioassay Popular Identifiers: 
     *  BioAssay ID</p>
     */
    public static final Resource BioAssay = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#BioAssay" );
    
    /** <p>The addition of a carbamoyl group.</p> */
    public static final Resource Carbamoylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Carbamoylation" );
    
    /** <p>The addition of a carboxyl group.</p> */
    public static final Resource Carboxylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Carboxylation" );
    
    /** <p>Definition: a biological relationship between compound and gene. Comments: 
     *  it covers all types of relationships between compound and gene. Roughly we 
     *  divide into three classes, which are somewhat overlapped. Not well defined</p>
     */
    public static final Resource ChemicalGeneInteraction = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#ChemicalGeneInteraction" );
    
    /** <p>A biochemical event resulting in a new chemical product.</p> */
    public static final Resource ChemicalSynthesis = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#ChemicalSynthesis" );
    
    /** <p>The processing or splitting of a molecule, not necessarily leading to the 
     *  destruction of the molecule.</p>
     */
    public static final Resource Cleavage = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Cleavage" );
    
    /** <p>Involving the use of two or more chemicals simultaneously.</p> */
    public static final Resource Cotreatment = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Cotreatment" );
    
    /** <p>Catabolism or breakdown.</p> */
    public static final Resource Degradation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Degradation" );
    
    /** <p>Definition: any condition that causes pain, dysfunction, distress, social 
     *  problems, and/or death to the person afflicted, or similar problems for those 
     *  in contact with the person(from wiki) Comments: refer to OMIM Synonyms: Disorder 
     *  Instance examples: http://chem2bio2rdf.org/omim/resource/omim_disease Related 
     *  Databases: OMIM, CTD Disease, PharmGKB disease Popular Identifiers: OMIM, 
     *  MESH term</p>
     */
    public static final Resource Disease = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Disease" );
    
    /** <p>Definition: A chemical substance used in the treatment, cure, prevention, 
     *  or diagnosis of disease or used to otherwise enhance physical or mental well-being. 
     *  (from wiki) Comments: refer to DrugBank. It does not include the drugs that 
     *  are combinatorial drugs consisting of multiple compounds.Many ontologies set 
     *  comdpounds as Ingredients of drugs, here, drug is a subclass of compounds, 
     *  thus its properties inherit from compound Synonyms: Medicine Instance examples: 
     *  http://chem2bio2rdf.org/drugbank/resource/drugbank_drug/DB00039 Referred Database: 
     *  DrugBank, TTD, PharmGKB Popular Identifiers: DBID</p>
     */
    public static final Resource Drug = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Drug" );
    
    /** <p>Definition: A drug interaction is a situation in which a substance affects 
     *  the activity of a drug, i.e. the effects are increased or decreased, or they 
     *  produce a new effect that neither produces on its own.(from wiki) Comments: 
     *  Also consider combinatorial drugs, which shows polypharmacology Instance examples: 
     *  http://chem2bio2rdf.org/dcdb/resource/dcdb_drug_interaction/DI00001 Related 
     *  Databases: DCDB, DrugBank</p>
     */
    public static final Resource DrugDrugInteraction = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#DrugDrugInteraction" );
    
    /** <p>The addition of an ethyl group.</p> */
    public static final Resource Ethylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Ethylation" );
    
    /** <p>The movement of a molecule out of a cell (by less specific means than export).The 
     *  movement of a molecule out of a cell (by more specific means than secretion).</p>
     */
    public static final Resource Export = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Export" );
    
    /** <p>The expression of a gene product.</p> */
    public static final Resource Expression = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Expression" );
    
    /** <p>Definition: External identifiers as well as their resources Comments: Often, 
     *  refers to Chem2Bio2RDF datasets</p>
     */
    public static final Resource ExternalSource = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#ExternalSource" );
    
    /** <p>The addition of a farnesyl group</p> */
    public static final Resource Farnesylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Farnesylation" );
    
    /** <p>The bending and positioning of a molecule to achieve conformational integrity.</p> */
    public static final Resource Folding = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Folding" );
    
    public static final Resource FunctionalAssay = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#FunctionalAssay" );
    
    /** <p>The addition of a geranoyl group.</p> */
    public static final Resource Geranoylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Geranoylation" );
    
    /** <p>The addition of a sugar group to form a glucuronide, typically part of an 
     *  inactivating or detoxifying reaction.</p>
     */
    public static final Resource Glucuronidation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Glucuronidation" );
    
    /** <p>The addition of a glutathione group.</p> */
    public static final Resource Glutathionylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Glutathionylation" );
    
    /** <p>The non-enzymatic addition of a sugar.</p> */
    public static final Resource Glycation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Glycation" );
    
    /** <p>The addition of a sugar group.</p> */
    public static final Resource Glycosylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Glycosylation" );
    
    /** <p>The splitting of a molecule via the specific use of water.</p> */
    public static final Resource Hydrolysis = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Hydrolysis" );
    
    /** <p>The addition of a hydroxy group.</p> */
    public static final Resource Hydroxylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Hydroxylation" );
    
    /** <p>The movement of a molecule into a cell (by more specific means than uptake).</p> */
    public static final Resource Import = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Import" );
    
    public static final Resource Inhibition = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Inhibition" );
    
    /** <p>The addition of a lipid group.</p> */
    public static final Resource Lipidation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Lipidation" );
    
    /** <p>Definition: a scientific article Comments: refer to PubMed Synonyms: Paper 
     *  Instance examples: http://chem2bio2rdf.org/medline/resource/medline/12309849 
     *  Related Databases: Medline Popular Identifiers: PMID</p>
     */
    public static final Resource Literature = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Literature" );
    
    /** <p>Part of the cell where a molecule resides.</p> */
    public static final Resource Localization = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Localization" );
    
    /** <p>Definition: a very large molecule commonly created by some form of polymerization. 
     *  In general, it refers to nucleic acids, proteins, carbohydrates, lipids and 
     *  so on, but mostly it talks gene and its gene expression product (e.g., protein) 
     *  in our dataset Comments: We use a very broad definition of MacroMolecule due 
     *  to the nature of its instances. The definition of gene in biopax(A continuant 
     *  that encodes information that can be inherited through replication. This is 
     *  an eneralization of the prokaryotic and eukaryotic notion of a gene. This 
     *  is used only for genetic interactions. Gene expression regulation makes use 
     *  of DNA and RNA physical entities.) Here, we not only include gene but also 
     *  its gene expression products (e.g., protein, mRNA). Since chemogenomics is 
     *  often talking about the interactions between chemical and protein. In general, 
     *  it's assumed that the proteins expressed from the same gene have very similar 
     *  binding activity, so we often use compound XXX interacts with XXX (gene symbol) 
     *  in literature and other places. We cover pharmagenomics and toxigenomics as 
     *  well, which have the data that describes compound interacting gene indirectly. 
     *  Thus lots of biological information is ignored here. In addition, we also 
     *  refer marcomolecule as possible drug targets, although there is a very complicated 
     *  definition of drug target (Lee Harland, 2009) Synonyms: Gene, Protein, Target, 
     *  Enzyme, BiologicalMacromolecules Instance examples: http://chem2bio2rdf.org/uniprot/resource/gene/AHI1 
     *  Related Databases: UNIPROT, HGNC, PDB Popular Identifiers: GI, UNIPROT ID, 
     *  GENE Symbol, EC Number, PDB ID</p>
     */
    public static final Resource MacroMolecule = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#MacroMolecule" );
    
    /** <p>The biochemical alteration of a molecule's structure (does not include changes 
     *  in expression, stability, folding, localization, splicing, or transport).</p>
     */
    public static final Resource MetabolicProcessing = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#MetabolicProcessing" );
    
    /** <p>The addition of a methyl group.</p> */
    public static final Resource Methylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Methylation" );
    
    /** <p>The genetic alteration of a gene product.</p> */
    public static final Resource Mutagenesis = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Mutagenesis" );
    
    /** <p>The addition of a myristoyl group.</p> */
    public static final Resource Myristoylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Myristoylation" );
    
    /** <p>The addition of a sugar group to an amide nitrogen.</p> */
    public static final Resource N_linkedGlycosylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#N-linkedGlycosylation" );
    
    /** <p>The addition of a nitroso or nitrosyl group.</p> */
    public static final Resource Nitrosation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Nitrosation" );
    
    /** <p>The addition of a nucleotidyl group.</p> */
    public static final Resource Nucleotidylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Nucleotidylation" );
    
    /** <p>The addition of a sugar group to a hydroxyl group.</p> */
    public static final Resource O_linkedGlycosylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#O-linkedGlycosylation" );
    
    public static final Resource Outcome = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Outcome" );
    
    /** <p>the loss of electrons</p> */
    public static final Resource Oxidation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Oxidation" );
    
    /** <p>The addition of a palmitoyl group.</p> */
    public static final Resource Palmitoylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Palmitoylation" );
    
    /** <p>Definition: influence of genetic variation on drug response in patients by 
     *  correlating gene expression or single-nucleotide polymorphisms (from wiki) 
     *  Comments: it emphasizes on genetic variation upon drug response Synonyms: 
     *  Instance examples: http://chem2bio2rdf.org/pharmgkb/resource/pharmgkb_pharmagenomics/10631CYP3A54016 
     *  Related Databases: PharmGKB</p>
     */
    public static final Resource Pharmagenetic = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Pharmagenetic" );
    
    /** <p>The addition of a phosphate group.</p> */
    public static final Resource Phosphorylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Phosphorylation" );
    
    public static final Resource PhysicalProperty = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#PhysicalProperty" );
    
    /** <p>The addition of a prenyl group.</p> */
    public static final Resource Prenylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Prenylation" );
    
    /** <p>Definition: two or more proteins bind together, often to carry out their biological 
     *  function Comments: consider protein protein or protein DNA interaction. Cover 
     *  yeast 2-hybrid data Instance examples: Related Databases: HPRD, DIP, BIOGRID</p>
     */
    public static final Resource ProteinProteinInteraction = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#ProteinProteinInteraction" );
    
    /** <p>Any general biochemical or molecular event.</p> */
    public static final Resource Reaction = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Reaction" );
    
    /** <p>The gain of electrons.</p> */
    public static final Resource Reduction = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Reduction" );
    
    /** <p>Chemical resistance or chemical sensitivity.</p> */
    public static final Resource ResponseToChemical = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#ResponseToChemical" );
    
    /** <p>The addition of a ribosyl group.</p> */
    public static final Resource Ribosylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Ribosylation" );
    
    /** <p>The movement of a molecule out of a cell (by less specific means than export).</p> */
    public static final Resource Secretion = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Secretion" );
    
    /** <p>Definition: undesired effect from a medicine Comments: refer to SIDER, it 
     *  does not need to be harmful. Synonyms: AdverseEffect, DrugAdverseReaction 
     *  Instance examples: http://chem2bio2rdf.org/sider/resource/sider/C0000768 Related 
     *  Databases: SIDER Popular Identifiers: umls_id</p>
     */
    public static final Resource SideEffect = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#SideEffect" );
    
    /** <p>The removal of introns to generate mRNA.</p> */
    public static final Resource Splicing = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Splicing" );
    
    /** <p>Overall molecular integrity.</p> */
    public static final Resource Stability = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Stability" );
    
    /** <p>The addition of a sulfate group.</p> */
    public static final Resource Sulfation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Sulfation" );
    
    /** <p>The addition of a SUMO group.</p> */
    public static final Resource Sumoylation = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Sumoylation" );
    
    /** <p>The movement of a molecule into or out of a cell.</p> */
    public static final Resource Transport = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Transport" );
    
    /** <p>The addition of an ubiquitin group.</p> */
    public static final Resource Ubiquitination = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Ubiquitination" );
    
    /** <p>The movement of a molecule into a cell (by less specific means than import).</p> */
    public static final Resource Uptake = m_model.createResource( "http://chem2bio2rdf.org/chem2bio2rdf.owl#Uptake" );
    
}
