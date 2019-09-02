package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerBehaviorExecuteOutputModelCustomerBehaviorInstanceRecord;
import org.bian.dto.BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorExecuteOutputModel
 */
public class BQCustomerBehaviorExecuteOutputModel   {
  private BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQCustomerBehaviorExecuteOutputModelCustomerBehaviorInstanceRecord customerBehaviorInstanceRecord = null;

  private String customerBehaviorExecuteActionTaskReference = null;

  private Object customerBehaviorExecuteActionTaskRecord = null;

  private String customerBehaviorExecuteRecordReference = null;

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
   * Get customerBehaviorInstanceRecord
   * @return customerBehaviorInstanceRecord
  **/

  public BQCustomerBehaviorExecuteOutputModelCustomerBehaviorInstanceRecord getCustomerBehaviorInstanceRecord() {
    return customerBehaviorInstanceRecord;
  }

  public void setCustomerBehaviorInstanceRecord(BQCustomerBehaviorExecuteOutputModelCustomerBehaviorInstanceRecord customerBehaviorInstanceRecord) {
    this.customerBehaviorInstanceRecord = customerBehaviorInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior instance execute service call 
   * @return customerBehaviorExecuteActionTaskReference
  **/

  public String getCustomerBehaviorExecuteActionTaskReference() {
    return customerBehaviorExecuteActionTaskReference;
  }

  public void setCustomerBehaviorExecuteActionTaskReference(String customerBehaviorExecuteActionTaskReference) {
    this.customerBehaviorExecuteActionTaskReference = customerBehaviorExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerBehaviorExecuteActionTaskRecord
  **/

  public Object getCustomerBehaviorExecuteActionTaskRecord() {
    return customerBehaviorExecuteActionTaskRecord;
  }

  public void setCustomerBehaviorExecuteActionTaskRecord(Object customerBehaviorExecuteActionTaskRecord) {
    this.customerBehaviorExecuteActionTaskRecord = customerBehaviorExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Behavior execute transaction/record 
   * @return customerBehaviorExecuteRecordReference
  **/

  public String getCustomerBehaviorExecuteRecordReference() {
    return customerBehaviorExecuteRecordReference;
  }

  public void setCustomerBehaviorExecuteRecordReference(String customerBehaviorExecuteRecordReference) {
    this.customerBehaviorExecuteRecordReference = customerBehaviorExecuteRecordReference;
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

