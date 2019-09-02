package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerBehaviorExecuteInputModelCustomerBehaviorInstanceRecord;
import org.bian.dto.CRChannelActivityAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorExecuteInputModel
 */
public class BQCustomerBehaviorExecuteInputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisInstanceReference = null;

  private String customerBehaviorInstanceReference = null;

  private BQCustomerBehaviorExecuteInputModelCustomerBehaviorInstanceRecord customerBehaviorInstanceRecord = null;

  private Object customerBehaviorExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Behavior instance 
   * @return customerBehaviorInstanceReference
  **/

  public String getCustomerBehaviorInstanceReference() {
    return customerBehaviorInstanceReference;
  }

  public void setCustomerBehaviorInstanceReference(String customerBehaviorInstanceReference) {
    this.customerBehaviorInstanceReference = customerBehaviorInstanceReference;
  }


  /**
   * Get customerBehaviorInstanceRecord
   * @return customerBehaviorInstanceRecord
  **/

  public BQCustomerBehaviorExecuteInputModelCustomerBehaviorInstanceRecord getCustomerBehaviorInstanceRecord() {
    return customerBehaviorInstanceRecord;
  }

  public void setCustomerBehaviorInstanceRecord(BQCustomerBehaviorExecuteInputModelCustomerBehaviorInstanceRecord customerBehaviorInstanceRecord) {
    this.customerBehaviorInstanceRecord = customerBehaviorInstanceRecord;
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

