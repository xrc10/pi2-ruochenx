
/* First created by JCasGen Mon Sep 14 21:38:17 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Inherit BasicAnnot to record the score for an answer.
 * Updated by JCasGen Mon Sep 14 21:38:17 EDT 2015
 * @generated */
public class Score_Type extends BasicAnnot_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Score_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Score_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Score(addr, Score_Type.this);
  			   Score_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Score(addr, Score_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Score.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Score");
 
  /** @generated */
  final Feature casFeat_answer;
  /** @generated */
  final int     casFeatCode_answer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnswer(int addr) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "Score");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswer(int addr, int v) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "Score");
    ll_cas.ll_setRefValue(addr, casFeatCode_answer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Score");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, float v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Score");
    ll_cas.ll_setFloatValue(addr, casFeatCode_score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Score_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answer = jcas.getRequiredFeatureDE(casType, "answer", "Answer", featOkTst);
    casFeatCode_answer  = (null == casFeat_answer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answer).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Float", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

  }
}



    