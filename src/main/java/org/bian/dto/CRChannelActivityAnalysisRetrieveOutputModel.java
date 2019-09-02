package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceAnalysis;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisRetrieveOutputModel
 */
public class CRChannelActivityAnalysisRetrieveOutputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisRetrieveActionTaskReference = null;

  private Object channelActivityAnalysisRetrieveActionTaskRecord = null;

  private String channelActivityAnalysisRetrieveActionResponse = null;

  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceReportRecord channelActivityAnalysisInstanceReportRecord = null;

  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceAnalysis channelActivityAnalysisInstanceAnalysis = null;


  /**
   * Get channelActivityAnalysisInstanceRecord
   * @return channelActivityAnalysisInstanceRecord
  **/

  public CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Channel Activity Analysis instance retrieve service call 
   * @return channelActivityAnalysisRetrieveActionTaskReference
  **/

  public String getChannelActivityAnalysisRetrieveActionTaskReference() {
    return channelActivityAnalysisRetrieveActionTaskReference;
  }

  public void setChannelActivityAnalysisRetrieveActionTaskReference(String channelActivityAnalysisRetrieveActionTaskReference) {
    this.channelActivityAnalysisRetrieveActionTaskReference = channelActivityAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return channelActivityAnalysisRetrieveActionResponse
  **/

  public String getChannelActivityAnalysisRetrieveActionResponse() {
    return channelActivityAnalysisRetrieveActionResponse;
  }

  public void setChannelActivityAnalysisRetrieveActionResponse(String channelActivityAnalysisRetrieveActionResponse) {
    this.channelActivityAnalysisRetrieveActionResponse = channelActivityAnalysisRetrieveActionResponse;
  }


  /**
   * Get channelActivityAnalysisInstanceReportRecord
   * @return channelActivityAnalysisInstanceReportRecord
  **/

  public CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceReportRecord getChannelActivityAnalysisInstanceReportRecord() {
    return channelActivityAnalysisInstanceReportRecord;
  }

  public void setChannelActivityAnalysisInstanceReportRecord(CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceReportRecord channelActivityAnalysisInstanceReportRecord) {
    this.channelActivityAnalysisInstanceReportRecord = channelActivityAnalysisInstanceReportRecord;
  }


  /**
   * Get channelActivityAnalysisInstanceAnalysis
   * @return channelActivityAnalysisInstanceAnalysis
  **/

  public CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceAnalysis getChannelActivityAnalysisInstanceAnalysis() {
    return channelActivityAnalysisInstanceAnalysis;
  }

  public void setChannelActivityAnalysisInstanceAnalysis(CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceAnalysis channelActivityAnalysisInstanceAnalysis) {
    this.channelActivityAnalysisInstanceAnalysis = channelActivityAnalysisInstanceAnalysis;
  }


}

