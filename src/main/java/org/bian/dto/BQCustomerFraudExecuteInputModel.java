package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerFraudExecuteInputModelCustomerFraudInstanceRecord;
import org.bian.dto.CRChannelActivityAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudExecuteInputModel
 */
public class BQCustomerFraudExecuteInputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisInstanceReference = null;

  private String customerFraudInstanceReference = null;

  private BQCustomerFraudExecuteInputModelCustomerFraudInstanceRecord customerFraudInstanceRecord = null;

  private Object customerFraudExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Fraud instance 
   * @return customerFraudInstanceReference
  **/

  public String getCustomerFraudInstanceReference() {
    return customerFraudInstanceReference;
  }

  public void setCustomerFraudInstanceReference(String customerFraudInstanceReference) {
    this.customerFraudInstanceReference = customerFraudInstanceReference;
  }


  /**
   * Get customerFraudInstanceRecord
   * @return customerFraudInstanceRecord
  **/

  public BQCustomerFraudExecuteInputModelCustomerFraudInstanceRecord getCustomerFraudInstanceRecord() {
    return customerFraudInstanceRecord;
  }

  public void setCustomerFraudInstanceRecord(BQCustomerFraudExecuteInputModelCustomerFraudInstanceRecord customerFraudInstanceRecord) {
    this.customerFraudInstanceRecord = customerFraudInstanceRecord;
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

