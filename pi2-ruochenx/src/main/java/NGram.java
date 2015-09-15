

/* First created by JCasGen Mon Sep 14 21:38:17 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Inherit BasicAnnot to locate and record a n-gram annotation.
 * Updated by JCasGen Mon Sep 14 21:38:17 EDT 2015
 * XML source: /home/ruochenx/git/pi2-ruochenx/pi2-ruochenx/src/main/resources/pi2-ruochenx-typesystem.xml
 * @generated */
public class NGram extends BasicAnnot {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: n

  /** getter for n - gets The cardinality of n-gram.
   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets The cardinality of n-gram. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: grams

  /** getter for grams - gets Array of tokens to reocord n-gram of an annotation.
   * @generated
   * @return value of the feature 
   */
  public FSArray getGrams() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_grams)));}
    
  /** setter for grams - sets Array of tokens to reocord n-gram of an annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGrams(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_grams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for grams - gets an indexed value - Array of tokens to reocord n-gram of an annotation.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getGrams(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_grams), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_grams), i)));}

  /** indexed setter for grams - sets an indexed value - Array of tokens to reocord n-gram of an annotation.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setGrams(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_grams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_grams), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    