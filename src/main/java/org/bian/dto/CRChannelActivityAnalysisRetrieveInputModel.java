package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceAnalysis;
import org.bian.dto.CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisRetrieveInputModel
 */
public class CRChannelActivityAnalysisRetrieveInputModel   {
  private Object channelActivityAnalysisRetrieveActionTaskRecord = null;

  private String channelActivityAnalysisRetrieveActionRequest = null;

  private CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceReportRecord channelActivityAnalysisInstanceReportRecord = null;

  private CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceAnalysis channelActivityAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return channelActivityAnalysisRetrieveActionTaskRecord
  **/

  public Object getChannelActivityAnalysisRetrieveActionTaskRecord() {
    return channelActivityAnalysisRetrieveActionTaskRecord;
  }

  public void setChannelActivityAnalysisRetrieveActionTaskRecord(Object channelActivityAnalysisRetrieveActionTaskRecord) {
    this.channelActivityAnalysisRetrieveActionTaskRecord = channelActivityAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return channelActivityAnalysisRetrieveActionRequest
  **/

  public String getChannelActivityAnalysisRetrieveActionRequest() {
    return channelActivityAnalysisRetrieveActionRequest;
  }

  public void setChannelActivityAnalysisRetrieveActionRequest(String channelActivityAnalysisRetrieveActionRequest) {
    this.channelActivityAnalysisRetrieveActionRequest = channelActivityAnalysisRetrieveActionRequest;
  }


  /**
   * Get channelActivityAnalysisInstanceReportRecord
   * @return channelActivityAnalysisInstanceReportRecord
  **/

  public CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceReportRecord getChannelActivityAnalysisInstanceReportRecord() {
    return channelActivityAnalysisInstanceReportRecord;
  }

  public void setChannelActivityAnalysisInstanceReportRecord(CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceReportRecord channelActivityAnalysisInstanceReportRecord) {
    this.channelActivityAnalysisInstanceReportRecord = channelActivityAnalysisInstanceReportRecord;
  }


  /**
   * Get channelActivityAnalysisInstanceAnalysis
   * @return channelActivityAnalysisInstanceAnalysis
  **/

  public CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceAnalysis getChannelActivityAnalysisInstanceAnalysis() {
    return channelActivityAnalysisInstanceAnalysis;
  }

  public void setChannelActivityAnalysisInstanceAnalysis(CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceAnalysis channelActivityAnalysisInstanceAnalysis) {
    this.channelActivityAnalysisInstanceAnalysis = channelActivityAnalysisInstanceAnalysis;
  }


}

