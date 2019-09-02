package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBotExecuteInputModelBQBotInstanceRecordInstanceRecord;
import org.bian.dto.CRChannelActivityAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBotExecuteInputModel
 */
public class BQBotExecuteInputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisInstanceReference = null;

  private String botInstanceReference = null;

  private BQBotExecuteInputModelBQBotInstanceRecordInstanceRecord bQBotInstanceRecordInstanceRecord = null;

  private Object botExecuteActionTaskRecord = null;

  private CRChannelActivityAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Channel Activity Analysis instance 
   * @return channelActivityAnalysisInstanceReference
  **/

  public String getChannelActivityAnalysisInstanceReference() {
    return channelActivityAnalysisInstanceReference;
  }

  public void setChannelActivityAnalysisInstanceReference(String channelActivityAnalysisInstanceReference) {
    this.channelActivityAnalysisInstanceReference = channelActivityAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Bot instance 
   * @return botInstanceReference
  **/

  public String getBotInstanceReference() {
    return botInstanceReference;
  }

  public void setBotInstanceReference(String botInstanceReference) {
    this.botInstanceReference = botInstanceReference;
  }


  /**
   * Get bQBotInstanceRecordInstanceRecord
   * @return bQBotInstanceRecordInstanceRecord
  **/

  public BQBotExecuteInputModelBQBotInstanceRecordInstanceRecord getBQBotInstanceRecordInstanceRecord() {
    return bQBotInstanceRecordInstanceRecord;
  }

  public void setBQBotInstanceRecordInstanceRecord(BQBotExecuteInputModelBQBotInstanceRecordInstanceRecord bQBotInstanceRecordInstanceRecord) {
    this.bQBotInstanceRecordInstanceRecord = bQBotInstanceRecordInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return botExecuteActionTaskRecord
  **/

  public Object getBotExecuteActionTaskRecord() {
    return botExecuteActionTaskRecord;
  }

  public void setBotExecuteActionTaskRecord(Object botExecuteActionTaskRecord) {
    this.botExecuteActionTaskRecord = botExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRChannelActivityAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRChannelActivityAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

