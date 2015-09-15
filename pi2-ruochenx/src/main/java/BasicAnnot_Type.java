
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Basic type that records the name of a component that produces the annotation and confidence score assigned to the annotation.
 * Updated by JCasGen Mon Sep 14 22:37:02 EDT 2015
 * @generated */
public class BasicAnnot_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BasicAnnot_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BasicAnnot_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BasicAnnot(addr, BasicAnnot_Type.this);
  			   BasicAnnot_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BasicAnnot(addr, BasicAnnot_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BasicAnnot.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("BasicAnnot");
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "BasicAnnot");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "BasicAnnot");
    ll_cas.ll_setFloatValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotatorName;
  /** @generated */
  final int     casFeatCode_annotatorName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnnotatorName(int addr) {
        if (featOkTst && casFeat_annotatorName == null)
      jcas.throwFeatMissing("annotatorName", "BasicAnnot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotatorName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotatorName(int addr, String v) {
        if (featOkTst && casFeat_annotatorName == null)
      jcas.throwFeatMissing("annotatorName", "BasicAnnot");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotatorName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public BasicAnnot_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Float", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_annotatorName = jcas.getRequiredFeatureDE(casType, "annotatorName", "uima.cas.String", featOkTst);
    casFeatCode_annotatorName  = (null == casFeat_annotatorName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotatorName).getCode();

  }
}



    