package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord;
import org.bian.dto.BQCustomerFraudExecuteOutputModelCustomerFraudInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudExecuteOutputModel
 */
public class BQCustomerFraudExecuteOutputModel   {
  private BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQCustomerFraudExecuteOutputModelCustomerFraudInstanceRecord customerFraudInstanceRecord = null;

  private String customerFraudExecuteActionTaskReference = null;

  private Object customerFraudExecuteActionTaskRecord = null;

  private String customerFraudExecuteRecordReference = null;

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
   * Get customerFraudInstanceRecord
   * @return customerFraudInstanceRecord
  **/

  public BQCustomerFraudExecuteOutputModelCustomerFraudInstanceRecord getCustomerFraudInstanceRecord() {
    return customerFraudInstanceRecord;
  }

  public void setCustomerFraudInstanceRecord(BQCustomerFraudExecuteOutputModelCustomerFraudInstanceRecord customerFraudInstanceRecord) {
    this.customerFraudInstanceRecord = customerFraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Fraud instance execute service call 
   * @return customerFraudExecuteActionTaskReference
  **/

  public String getCustomerFraudExecuteActionTaskReference() {
    return customerFraudExecuteActionTaskReference;
  }

  public void setCustomerFraudExecuteActionTaskReference(String customerFraudExecuteActionTaskReference) {
    this.customerFraudExecuteActionTaskReference = customerFraudExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerFraudExecuteActionTaskRecord
  **/

  public Object getCustomerFraudExecuteActionTaskRecord() {
    return customerFraudExecuteActionTaskRecord;
  }

  public void setCustomerFraudExecuteActionTaskRecord(Object customerFraudExecuteActionTaskRecord) {
    this.customerFraudExecuteActionTaskRecord = customerFraudExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Fraud execute transaction/record 
   * @return customerFraudExecuteRecordReference
  **/

  public String getCustomerFraudExecuteRecordReference() {
    return customerFraudExecuteRecordReference;
  }

  public void setCustomerFraudExecuteRecordReference(String customerFraudExecuteRecordReference) {
    this.customerFraudExecuteRecordReference = customerFraudExecuteRecordReference;
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

