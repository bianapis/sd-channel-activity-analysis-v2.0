package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudExecuteOutputModelCustomerFraudInstanceRecord
 */
public class BQCustomerFraudExecuteOutputModelCustomerFraudInstanceRecord   {
  private String channelActivityCustomerFraudAnalysisAlgorithmSpecification = null;

  private String channelActivityCustomerFraudAnalysisReference = null;

  private String channelActivityCustomerFraudAnalysisResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the intended analytical insights and required input data and outputs 
   * @return channelActivityCustomerFraudAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityCustomerFraudAnalysisAlgorithmSpecification() {
    return channelActivityCustomerFraudAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityCustomerFraudAnalysisAlgorithmSpecification(String channelActivityCustomerFraudAnalysisAlgorithmSpecification) {
    this.channelActivityCustomerFraudAnalysisAlgorithmSpecification = channelActivityCustomerFraudAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to output from the applied algorithm 
   * @return channelActivityCustomerFraudAnalysisReference
  **/

  public String getChannelActivityCustomerFraudAnalysisReference() {
    return channelActivityCustomerFraudAnalysisReference;
  }

  public void setChannelActivityCustomerFraudAnalysisReference(String channelActivityCustomerFraudAnalysisReference) {
    this.channelActivityCustomerFraudAnalysisReference = channelActivityCustomerFraudAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output record from the analysis 
   * @return channelActivityCustomerFraudAnalysisResult
  **/

  public String getChannelActivityCustomerFraudAnalysisResult() {
    return channelActivityCustomerFraudAnalysisResult;
  }

  public void setChannelActivityCustomerFraudAnalysisResult(String channelActivityCustomerFraudAnalysisResult) {
    this.channelActivityCustomerFraudAnalysisResult = channelActivityCustomerFraudAnalysisResult;
  }


}

