package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorExecuteInputModelDeviceErrorInstanceRecord
 */
public class BQDeviceErrorExecuteInputModelDeviceErrorInstanceRecord   {
  private String channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the intended analytical insights and required input data and outputs 
   * @return channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification() {
    return channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification(String channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification) {
    this.channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification = channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification;
  }


}

