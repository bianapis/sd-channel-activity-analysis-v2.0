package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord;
import org.bian.dto.BQMerchantFraudExecuteOutputModelMerchantFraudInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudExecuteOutputModel
 */
public class BQMerchantFraudExecuteOutputModel   {
  private BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQMerchantFraudExecuteOutputModelMerchantFraudInstanceRecord merchantFraudInstanceRecord = null;

  private String merchantFraudExecuteActionTaskReference = null;

  private Object merchantFraudExecuteActionTaskRecord = null;

  private String merchantFraudExecuteRecordReference = null;

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
   * Get merchantFraudInstanceRecord
   * @return merchantFraudInstanceRecord
  **/

  public BQMerchantFraudExecuteOutputModelMerchantFraudInstanceRecord getMerchantFraudInstanceRecord() {
    return merchantFraudInstanceRecord;
  }

  public void setMerchantFraudInstanceRecord(BQMerchantFraudExecuteOutputModelMerchantFraudInstanceRecord merchantFraudInstanceRecord) {
    this.merchantFraudInstanceRecord = merchantFraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchant Fraud instance execute service call 
   * @return merchantFraudExecuteActionTaskReference
  **/

  public String getMerchantFraudExecuteActionTaskReference() {
    return merchantFraudExecuteActionTaskReference;
  }

  public void setMerchantFraudExecuteActionTaskReference(String merchantFraudExecuteActionTaskReference) {
    this.merchantFraudExecuteActionTaskReference = merchantFraudExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return merchantFraudExecuteActionTaskRecord
  **/

  public Object getMerchantFraudExecuteActionTaskRecord() {
    return merchantFraudExecuteActionTaskRecord;
  }

  public void setMerchantFraudExecuteActionTaskRecord(Object merchantFraudExecuteActionTaskRecord) {
    this.merchantFraudExecuteActionTaskRecord = merchantFraudExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Merchant Fraud execute transaction/record 
   * @return merchantFraudExecuteRecordReference
  **/

  public String getMerchantFraudExecuteRecordReference() {
    return merchantFraudExecuteRecordReference;
  }

  public void setMerchantFraudExecuteRecordReference(String merchantFraudExecuteRecordReference) {
    this.merchantFraudExecuteRecordReference = merchantFraudExecuteRecordReference;
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

