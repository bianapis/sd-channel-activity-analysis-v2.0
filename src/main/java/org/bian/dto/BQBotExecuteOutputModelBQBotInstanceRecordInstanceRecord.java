package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBotExecuteOutputModelBQBotInstanceRecordInstanceRecord
 */
public class BQBotExecuteOutputModelBQBotInstanceRecordInstanceRecord   {
  private String channelActivityBotDetectionAnalysisAlgorithmSpecification = null;

  private String channelActivityBotDetectionAnalysisReference = null;

  private String channelActivityBotDetectionAnalysisResult = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to output from the applied algorithm 
   * @return channelActivityBotDetectionAnalysisReference
  **/

  public String getChannelActivityBotDetectionAnalysisReference() {
    return channelActivityBotDetectionAnalysisReference;
  }

  public void setChannelActivityBotDetectionAnalysisReference(String channelActivityBotDetectionAnalysisReference) {
    this.channelActivityBotDetectionAnalysisReference = channelActivityBotDetectionAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output record from the analysis 
   * @return channelActivityBotDetectionAnalysisResult
  **/

  public String getChannelActivityBotDetectionAnalysisResult() {
    return channelActivityBotDetectionAnalysisResult;
  }

  public void setChannelActivityBotDetectionAnalysisResult(String channelActivityBotDetectionAnalysisResult) {
    this.channelActivityBotDetectionAnalysisResult = channelActivityBotDetectionAnalysisResult;
  }


}

