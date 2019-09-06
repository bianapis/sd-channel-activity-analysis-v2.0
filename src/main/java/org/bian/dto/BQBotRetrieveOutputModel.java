package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBotRetrieveOutputModelBQBotInstanceRecordInstanceRecord;
import org.bian.dto.BQBotRetrieveOutputModelBotInstanceAnalysis;
import org.bian.dto.BQBotRetrieveOutputModelBotInstanceReport;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBotRetrieveOutputModel
 */
public class BQBotRetrieveOutputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQBotRetrieveOutputModelBQBotInstanceRecordInstanceRecord bQBotInstanceRecordInstanceRecord = null;

  private String botRetrieveActionTaskReference = null;

  private Object botRetrieveActionTaskRecord = null;

  private String botRetrieveActionResponse = null;

  private BQBotRetrieveOutputModelBotInstanceReport botInstanceReport = null;

  private BQBotRetrieveOutputModelBotInstanceAnalysis botInstanceAnalysis = null;


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
   * Get bQBotInstanceRecordInstanceRecord
   * @return bQBotInstanceRecordInstanceRecord
  **/

  public BQBotRetrieveOutputModelBQBotInstanceRecordInstanceRecord getBQBotInstanceRecordInstanceRecord() {
    return bQBotInstanceRecordInstanceRecord;
  }
   
  @JsonProperty("bQBotInstanceRecordInstanceRecord")
  public void setBQBotInstanceRecordInstanceRecord(BQBotRetrieveOutputModelBQBotInstanceRecordInstanceRecord bQBotInstanceRecordInstanceRecord) {
    this.bQBotInstanceRecordInstanceRecord = bQBotInstanceRecordInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bot instance retrieve service call 
   * @return botRetrieveActionTaskReference
  **/

  public String getBotRetrieveActionTaskReference() {
    return botRetrieveActionTaskReference;
  }

  public void setBotRetrieveActionTaskReference(String botRetrieveActionTaskReference) {
    this.botRetrieveActionTaskReference = botRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return botRetrieveActionTaskRecord
  **/

  public Object getBotRetrieveActionTaskRecord() {
    return botRetrieveActionTaskRecord;
  }

  public void setBotRetrieveActionTaskRecord(Object botRetrieveActionTaskRecord) {
    this.botRetrieveActionTaskRecord = botRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return botRetrieveActionResponse
  **/

  public String getBotRetrieveActionResponse() {
    return botRetrieveActionResponse;
  }

  public void setBotRetrieveActionResponse(String botRetrieveActionResponse) {
    this.botRetrieveActionResponse = botRetrieveActionResponse;
  }


  /**
   * Get botInstanceReport
   * @return botInstanceReport
  **/

  public BQBotRetrieveOutputModelBotInstanceReport getBotInstanceReport() {
    return botInstanceReport;
  }

  public void setBotInstanceReport(BQBotRetrieveOutputModelBotInstanceReport botInstanceReport) {
    this.botInstanceReport = botInstanceReport;
  }


  /**
   * Get botInstanceAnalysis
   * @return botInstanceAnalysis
  **/

  public BQBotRetrieveOutputModelBotInstanceAnalysis getBotInstanceAnalysis() {
    return botInstanceAnalysis;
  }

  public void setBotInstanceAnalysis(BQBotRetrieveOutputModelBotInstanceAnalysis botInstanceAnalysis) {
    this.botInstanceAnalysis = botInstanceAnalysis;
  }


}

