package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord
 */
public class BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord   {
  private String channelActivityAnalysisResult = null;

  private Object channelActivityAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the analysis 
   * @return channelActivityAnalysisResult
  **/

  public String getChannelActivityAnalysisResult() {
    return channelActivityAnalysisResult;
  }

  public void setChannelActivityAnalysisResult(String channelActivityAnalysisResult) {
    this.channelActivityAnalysisResult = channelActivityAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A report combining the results of the analysis in a consumable format 
   * @return channelActivityAnalysisRecord
  **/

  public Object getChannelActivityAnalysisRecord() {
    return channelActivityAnalysisRecord;
  }

  public void setChannelActivityAnalysisRecord(Object channelActivityAnalysisRecord) {
    this.channelActivityAnalysisRecord = channelActivityAnalysisRecord;
  }


}

