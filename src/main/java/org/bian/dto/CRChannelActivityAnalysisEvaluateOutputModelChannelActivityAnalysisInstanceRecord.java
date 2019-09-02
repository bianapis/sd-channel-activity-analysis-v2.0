package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord
 */
public class CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord   {
  private String channelType = null;

  private String channelActivityAnalysisPeriod = null;

  private String channelActivityAnalysisType = null;

  private String channelActivityAnalysisResult = null;

  private Object channelActivityAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of channel for which the analysis is performed 
   * @return channelType
  **/

  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The period covered by the analysis (from to date time) 
   * @return channelActivityAnalysisPeriod
  **/

  public String getChannelActivityAnalysisPeriod() {
    return channelActivityAnalysisPeriod;
  }

  public void setChannelActivityAnalysisPeriod(String channelActivityAnalysisPeriod) {
    this.channelActivityAnalysisPeriod = channelActivityAnalysisPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of analysis, can combine multiple (e.g. customer fraud, merchant fraud) 
   * @return channelActivityAnalysisType
  **/

  public String getChannelActivityAnalysisType() {
    return channelActivityAnalysisType;
  }

  public void setChannelActivityAnalysisType(String channelActivityAnalysisType) {
    this.channelActivityAnalysisType = channelActivityAnalysisType;
  }


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

