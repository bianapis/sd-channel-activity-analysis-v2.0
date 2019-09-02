package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisExecuteOutputModel
 */
public class CRChannelActivityAnalysisExecuteOutputModel   {
  private CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisExecuteActionTaskReference = null;

  private Object channelActivityAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get channelActivityAnalysisInstanceRecord
   * @return channelActivityAnalysisInstanceRecord
  **/

  public CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Channel Activity Analysis instance execute service call 
   * @return channelActivityAnalysisExecuteActionTaskReference
  **/

  public String getChannelActivityAnalysisExecuteActionTaskReference() {
    return channelActivityAnalysisExecuteActionTaskReference;
  }

  public void setChannelActivityAnalysisExecuteActionTaskReference(String channelActivityAnalysisExecuteActionTaskReference) {
    this.channelActivityAnalysisExecuteActionTaskReference = channelActivityAnalysisExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
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

