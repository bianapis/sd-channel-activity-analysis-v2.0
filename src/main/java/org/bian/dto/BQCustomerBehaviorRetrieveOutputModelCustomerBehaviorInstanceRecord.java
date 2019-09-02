package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceRecord
 */
public class BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceRecord   {
  private String channelActivityCustomerBehaviorAnalysisAlgorithmSpecification = null;

  private String channelActivityCustomerBehaviorAnalysisReference = null;

  private String channelActivityCustomerBehaviorAnalysisResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the intended analytical insights and required input data and outputs 
   * @return channelActivityCustomerBehaviorAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityCustomerBehaviorAnalysisAlgorithmSpecification() {
    return channelActivityCustomerBehaviorAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityCustomerBehaviorAnalysisAlgorithmSpecification(String channelActivityCustomerBehaviorAnalysisAlgorithmSpecification) {
    this.channelActivityCustomerBehaviorAnalysisAlgorithmSpecification = channelActivityCustomerBehaviorAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to output from the applied algorithm 
   * @return channelActivityCustomerBehaviorAnalysisReference
  **/

  public String getChannelActivityCustomerBehaviorAnalysisReference() {
    return channelActivityCustomerBehaviorAnalysisReference;
  }

  public void setChannelActivityCustomerBehaviorAnalysisReference(String channelActivityCustomerBehaviorAnalysisReference) {
    this.channelActivityCustomerBehaviorAnalysisReference = channelActivityCustomerBehaviorAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output record from the analysis 
   * @return channelActivityCustomerBehaviorAnalysisResult
  **/

  public String getChannelActivityCustomerBehaviorAnalysisResult() {
    return channelActivityCustomerBehaviorAnalysisResult;
  }

  public void setChannelActivityCustomerBehaviorAnalysisResult(String channelActivityCustomerBehaviorAnalysisResult) {
    this.channelActivityCustomerBehaviorAnalysisResult = channelActivityCustomerBehaviorAnalysisResult;
  }


}

