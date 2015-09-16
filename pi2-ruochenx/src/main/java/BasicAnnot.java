

/* First created by JCasGen Wed Sep 16 14:20:51 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Basic type that records the name of a component that produces the annotation and confidence score assigned to the annotation.
 * Updated by JCasGen Wed Sep 16 14:20:51 EDT 2015
 * XML source: /home/ruochenx/git/pi2-ruochenx/pi2-ruochenx/src/main/resources/pi2-ruochenx-typesystem.xml
 * @generated */
public class BasicAnnot extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BasicAnnot.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected BasicAnnot() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public BasicAnnot(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public BasicAnnot(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public BasicAnnot(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Confidence score assigned to the annotation.
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (BasicAnnot_Type.featOkTst && ((BasicAnnot_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BasicAnnot");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((BasicAnnot_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Confidence score assigned to the annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (BasicAnnot_Type.featOkTst && ((BasicAnnot_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BasicAnnot");
    jcasType.ll_cas.ll_setFloatValue(addr, ((BasicAnnot_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: annotatorName

  /** getter for annotatorName - gets The name of a component that produces the annotation.
   * @generated
   * @return value of the feature 
   */
  public String getAnnotatorName() {
    if (BasicAnnot_Type.featOkTst && ((BasicAnnot_Type)jcasType).casFeat_annotatorName == null)
      jcasType.jcas.throwFeatMissing("annotatorName", "BasicAnnot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BasicAnnot_Type)jcasType).casFeatCode_annotatorName);}
    
  /** setter for annotatorName - sets The name of a component that produces the annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotatorName(String v) {
    if (BasicAnnot_Type.featOkTst && ((BasicAnnot_Type)jcasType).casFeat_annotatorName == null)
      jcasType.jcas.throwFeatMissing("annotatorName", "BasicAnnot");
    jcasType.ll_cas.ll_setStringValue(addr, ((BasicAnnot_Type)jcasType).casFeatCode_annotatorName, v);}    
  }

    