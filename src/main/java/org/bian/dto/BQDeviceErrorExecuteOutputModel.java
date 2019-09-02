package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord;
import org.bian.dto.BQDeviceErrorExecuteOutputModelDeviceErrorInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorExecuteOutputModel
 */
public class BQDeviceErrorExecuteOutputModel   {
  private BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQDeviceErrorExecuteOutputModelDeviceErrorInstanceRecord deviceErrorInstanceRecord = null;

  private String deviceErrorExecuteActionTaskReference = null;

  private Object deviceErrorExecuteActionTaskRecord = null;

  private String deviceErrorExecuteRecordReference = null;

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
   * Get deviceErrorInstanceRecord
   * @return deviceErrorInstanceRecord
  **/

  public BQDeviceErrorExecuteOutputModelDeviceErrorInstanceRecord getDeviceErrorInstanceRecord() {
    return deviceErrorInstanceRecord;
  }

  public void setDeviceErrorInstanceRecord(BQDeviceErrorExecuteOutputModelDeviceErrorInstanceRecord deviceErrorInstanceRecord) {
    this.deviceErrorInstanceRecord = deviceErrorInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Device Error instance execute service call 
   * @return deviceErrorExecuteActionTaskReference
  **/

  public String getDeviceErrorExecuteActionTaskReference() {
    return deviceErrorExecuteActionTaskReference;
  }

  public void setDeviceErrorExecuteActionTaskReference(String deviceErrorExecuteActionTaskReference) {
    this.deviceErrorExecuteActionTaskReference = deviceErrorExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return deviceErrorExecuteActionTaskRecord
  **/

  public Object getDeviceErrorExecuteActionTaskRecord() {
    return deviceErrorExecuteActionTaskRecord;
  }

  public void setDeviceErrorExecuteActionTaskRecord(Object deviceErrorExecuteActionTaskRecord) {
    this.deviceErrorExecuteActionTaskRecord = deviceErrorExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device Error execute transaction/record 
   * @return deviceErrorExecuteRecordReference
  **/

  public String getDeviceErrorExecuteRecordReference() {
    return deviceErrorExecuteRecordReference;
  }

  public void setDeviceErrorExecuteRecordReference(String deviceErrorExecuteRecordReference) {
    this.deviceErrorExecuteRecordReference = deviceErrorExecuteRecordReference;
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

