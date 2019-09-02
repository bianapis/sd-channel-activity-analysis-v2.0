package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorExecuteInputModelMerchantBehaviorInstanceRecord
 */
public class BQMerchantBehaviorExecuteInputModelMerchantBehaviorInstanceRecord   {
  private String channelActivityMerchantBehaviorAnalysisAlgorithmSpecification = null;


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


}

