package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceRecord
 */
public class BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceRecord   {
  private String channelActivityMerchantBehaviorAnalysisAlgorithmSpecification = null;

  private String channelActivityMerchantBehaviorAnalysisReference = null;

  private String channelActivityMerchantBehaviorAnalysisResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the intended analytical insights and required input data and outputs 
   * @return channelActivityMerchantBehaviorAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityMerchantBehaviorAnalysisAlgorithmSpecification() {
    return channelActivityMerchantBehaviorAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityMerchantBehaviorAnalysisAlgorithmSpecification(String channelActivityMerchantBehaviorAnalysisAlgorithmSpecification) {
    this.channelActivityMerchantBehaviorAnalysisAlgorithmSpecification = channelActivityMerchantBehaviorAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to output from the applied algorithm 
   * @return channelActivityMerchantBehaviorAnalysisReference
  **/

  public String getChannelActivityMerchantBehaviorAnalysisReference() {
    return channelActivityMerchantBehaviorAnalysisReference;
  }

  public void setChannelActivityMerchantBehaviorAnalysisReference(String channelActivityMerchantBehaviorAnalysisReference) {
    this.channelActivityMerchantBehaviorAnalysisReference = channelActivityMerchantBehaviorAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output record from the analysis 
   * @return channelActivityMerchantBehaviorAnalysisResult
  **/

  public String getChannelActivityMerchantBehaviorAnalysisResult() {
    return channelActivityMerchantBehaviorAnalysisResult;
  }

  public void setChannelActivityMerchantBehaviorAnalysisResult(String channelActivityMerchantBehaviorAnalysisResult) {
    this.channelActivityMerchantBehaviorAnalysisResult = channelActivityMerchantBehaviorAnalysisResult;
  }


}

