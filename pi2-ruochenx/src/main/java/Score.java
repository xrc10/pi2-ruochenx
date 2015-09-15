

/* First created by JCasGen Mon Sep 14 21:38:17 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Inherit BasicAnnot to record the score for an answer.
 * Updated by JCasGen Mon Sep 14 21:38:17 EDT 2015
 * XML source: /home/ruochenx/git/pi2-ruochenx/pi2-ruochenx/src/main/resources/pi2-ruochenx-typesystem.xml
 * @generated */
public class Score extends BasicAnnot {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Score.class);
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
  protected Score() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Score(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Score(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Score(JCas jcas, int begin, int end) {
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
  //* Feature: answer

  /** getter for answer - gets The answer with which the score is assigned.
   * @generated
   * @return value of the feature 
   */
  public Answer getAnswer() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "Score");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Score_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets The answer with which the score is assigned. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswer(Answer v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "Score");
    jcasType.ll_cas.ll_setRefValue(addr, ((Score_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The score of the answer.
   * @generated
   * @return value of the feature 
   */
  public float getScore() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Score");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Score_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score of the answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(float v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Score");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Score_Type)jcasType).casFeatCode_score, v);}    
  }

    