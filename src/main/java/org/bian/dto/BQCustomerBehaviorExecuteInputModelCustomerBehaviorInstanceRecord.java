package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorExecuteInputModelCustomerBehaviorInstanceRecord
 */
public class BQCustomerBehaviorExecuteInputModelCustomerBehaviorInstanceRecord   {
  private String channelActivityCustomerBehaviorAnalysisAlgorithmSpecification = null;


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


}

