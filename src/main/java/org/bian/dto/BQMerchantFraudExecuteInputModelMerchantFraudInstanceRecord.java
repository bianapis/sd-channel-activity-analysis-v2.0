package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudExecuteInputModelMerchantFraudInstanceRecord
 */
public class BQMerchantFraudExecuteInputModelMerchantFraudInstanceRecord   {
  private String channelActivityMerchantFraudAnalysisAlgorithmSpecification = null;


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


}

