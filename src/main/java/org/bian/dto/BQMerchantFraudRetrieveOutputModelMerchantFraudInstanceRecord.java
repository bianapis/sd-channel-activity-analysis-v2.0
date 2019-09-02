package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceRecord
 */
public class BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceRecord   {
  private String channelActivityMerchantFraudAnalysisAlgorithmSpecification = null;

  private String channelActivityMerchantFraudAnalysisReference = null;

  private String channelActivityMerchantFraudAnalysisResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the intended analytical insights and required input data and outputs 
   * @return channelActivityMerchantFraudAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityMerchantFraudAnalysisAlgorithmSpecification() {
    return channelActivityMerchantFraudAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityMerchantFraudAnalysisAlgorithmSpecification(String channelActivityMerchantFraudAnalysisAlgorithmSpecification) {
    this.channelActivityMerchantFraudAnalysisAlgorithmSpecification = channelActivityMerchantFraudAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to output from the applied algorithm 
   * @return channelActivityMerchantFraudAnalysisReference
  **/

  public String getChannelActivityMerchantFraudAnalysisReference() {
    return channelActivityMerchantFraudAnalysisReference;
  }

  public void setChannelActivityMerchantFraudAnalysisReference(String channelActivityMerchantFraudAnalysisReference) {
    this.channelActivityMerchantFraudAnalysisReference = channelActivityMerchantFraudAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output record from the analysis 
   * @return channelActivityMerchantFraudAnalysisResult
  **/

  public String getChannelActivityMerchantFraudAnalysisResult() {
    return channelActivityMerchantFraudAnalysisResult;
  }

  public void setChannelActivityMerchantFraudAnalysisResult(String channelActivityMerchantFraudAnalysisResult) {
    this.channelActivityMerchantFraudAnalysisResult = channelActivityMerchantFraudAnalysisResult;
  }


}

