package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBotExecuteOutputModelBQBotInstanceRecordInstanceRecord;
import org.bian.dto.BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBotExecuteOutputModel
 */
public class BQBotExecuteOutputModel   {
  private BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQBotExecuteOutputModelBQBotInstanceRecordInstanceRecord bQBotInstanceRecordInstanceRecord = null;

  private String botExecuteActionTaskReference = null;

  private Object botExecuteActionTaskRecord = null;

  private String botExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get channelActivityAnalysisInstanceRecord
   * @return channelActivityAnalysisInstanceRecord
  **/

  public BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


  /**
   * Get bQBotInstanceRecordInstanceRecord
   * @return bQBotInstanceRecordInstanceRecord
  **/

  public BQBotExecuteOutputModelBQBotInstanceRecordInstanceRecord getBQBotInstanceRecordInstanceRecord() {
    return bQBotInstanceRecordInstanceRecord;
  }

  public void setBQBotInstanceRecordInstanceRecord(BQBotExecuteOutputModelBQBotInstanceRecordInstanceRecord bQBotInstanceRecordInstanceRecord) {
    this.bQBotInstanceRecordInstanceRecord = bQBotInstanceRecordInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bot instance execute service call 
   * @return botExecuteActionTaskReference
  **/

  public String getBotExecuteActionTaskReference() {
    return botExecuteActionTaskReference;
  }

  public void setBotExecuteActionTaskReference(String botExecuteActionTaskReference) {
    this.botExecuteActionTaskReference = botExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Bot execute transaction/record 
   * @return botExecuteRecordReference
  **/

  public String getBotExecuteRecordReference() {
    return botExecuteRecordReference;
  }

  public void setBotExecuteRecordReference(String botExecuteRecordReference) {
    this.botExecuteRecordReference = botExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

