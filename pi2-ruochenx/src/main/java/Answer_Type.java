
/* First created by JCasGen Mon Sep 14 22:37:02 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Inherit Sentence to locate an answer annotation.
 * Updated by JCasGen Mon Sep 14 22:37:02 EDT 2015
 * @generated */
public class Answer_Type extends Sentence_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answer");
 
  /** @generated */
  final Feature casFeat_isCorrect;
  /** @generated */
  final int     casFeatCode_isCorrect;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isCorrect);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_isCorrect = jcas.getRequiredFeatureDE(casType, "isCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_isCorrect  = (null == casFeat_isCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isCorrect).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

  }
}



    