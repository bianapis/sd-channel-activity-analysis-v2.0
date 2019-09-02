package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceRecord
 */
public class BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceRecord   {
  private String channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification = null;

  private String channelActivityDeviceErrorDetectionAnalysisReference = null;

  private String channelActivityDeviceErrorDetectionAnalysisResult = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info:  Reference to output from the applied algorithm 
   * @return channelActivityDeviceErrorDetectionAnalysisReference
  **/

  public String getChannelActivityDeviceErrorDetectionAnalysisReference() {
    return channelActivityDeviceErrorDetectionAnalysisReference;
  }

  public void setChannelActivityDeviceErrorDetectionAnalysisReference(String channelActivityDeviceErrorDetectionAnalysisReference) {
    this.channelActivityDeviceErrorDetectionAnalysisReference = channelActivityDeviceErrorDetectionAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output record from the analysis 
   * @return channelActivityDeviceErrorDetectionAnalysisResult
  **/

  public String getChannelActivityDeviceErrorDetectionAnalysisResult() {
    return channelActivityDeviceErrorDetectionAnalysisResult;
  }

  public void setChannelActivityDeviceErrorDetectionAnalysisResult(String channelActivityDeviceErrorDetectionAnalysisResult) {
    this.channelActivityDeviceErrorDetectionAnalysisResult = channelActivityDeviceErrorDetectionAnalysisResult;
  }


}

