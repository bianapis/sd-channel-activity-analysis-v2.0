package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord;
import org.bian.dto.CRChannelActivityAnalysisExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisExecuteInputModel
 */
public class CRChannelActivityAnalysisExecuteInputModel   {
  private String channelActivityAnalysisServicingSessionReference = null;

  private String channelActivityAnalysisInstanceReference = null;

  private CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private Object channelActivityAnalysisExecuteActionTaskRecord = null;

  private CRChannelActivityAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return channelActivityAnalysisServicingSessionReference
  **/

  public String getChannelActivityAnalysisServicingSessionReference() {
    return channelActivityAnalysisServicingSessionReference;
  }

  public void setChannelActivityAnalysisServicingSessionReference(String channelActivityAnalysisServicingSessionReference) {
    this.channelActivityAnalysisServicingSessionReference = channelActivityAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Channel Activity Analysis instance 
   * @return channelActivityAnalysisInstanceReference
  **/

  public String getChannelActivityAnalysisInstanceReference() {
    return channelActivityAnalysisInstanceReference;
  }

  public void setChannelActivityAnalysisInstanceReference(String channelActivityAnalysisInstanceReference) {
    this.channelActivityAnalysisInstanceReference = channelActivityAnalysisInstanceReference;
  }


  /**
   * Get channelActivityAnalysisInstanceRecord
   * @return channelActivityAnalysisInstanceRecord
  **/

  public CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return channelActivityAnalysisExecuteActionTaskRecord
  **/

  public Object getChannelActivityAnalysisExecuteActionTaskRecord() {
    return channelActivityAnalysisExecuteActionTaskRecord;
  }

  public void setChannelActivityAnalysisExecuteActionTaskRecord(Object channelActivityAnalysisExecuteActionTaskRecord) {
    this.channelActivityAnalysisExecuteActionTaskRecord = channelActivityAnalysisExecuteActionTaskRecord;
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

