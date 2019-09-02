package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBotExecuteInputModelBQBotInstanceRecordInstanceRecord
 */
public class BQBotExecuteInputModelBQBotInstanceRecordInstanceRecord   {
  private String channelActivityBotDetectionAnalysisAlgorithmSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the intended analytical insights and required input data and outputs 
   * @return channelActivityBotDetectionAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityBotDetectionAnalysisAlgorithmSpecification() {
    return channelActivityBotDetectionAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityBotDetectionAnalysisAlgorithmSpecification(String channelActivityBotDetectionAnalysisAlgorithmSpecification) {
    this.channelActivityBotDetectionAnalysisAlgorithmSpecification = channelActivityBotDetectionAnalysisAlgorithmSpecification;
  }


}

