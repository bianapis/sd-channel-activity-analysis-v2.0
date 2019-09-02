package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudExecuteInputModelCustomerFraudInstanceRecord
 */
public class BQCustomerFraudExecuteInputModelCustomerFraudInstanceRecord   {
  private String channelActivityCustomerFraudAnalysisAlgorithmSpecification = null;


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


}

