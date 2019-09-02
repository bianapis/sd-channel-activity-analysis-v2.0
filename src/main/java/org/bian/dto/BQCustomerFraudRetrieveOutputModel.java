package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceAnalysis;
import org.bian.dto.BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceRecord;
import org.bian.dto.BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceReport;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudRetrieveOutputModel
 */
public class BQCustomerFraudRetrieveOutputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceRecord customerFraudInstanceRecord = null;

  private String customerFraudRetrieveActionTaskReference = null;

  private Object customerFraudRetrieveActionTaskRecord = null;

  private String customerFraudRetrieveActionResponse = null;

  private BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceReport customerFraudInstanceReport = null;

  private BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceAnalysis customerFraudInstanceAnalysis = null;


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
   * Get customerFraudInstanceRecord
   * @return customerFraudInstanceRecord
  **/

  public BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceRecord getCustomerFraudInstanceRecord() {
    return customerFraudInstanceRecord;
  }

  public void setCustomerFraudInstanceRecord(BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceRecord customerFraudInstanceRecord) {
    this.customerFraudInstanceRecord = customerFraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Fraud instance retrieve service call 
   * @return customerFraudRetrieveActionTaskReference
  **/

  public String getCustomerFraudRetrieveActionTaskReference() {
    return customerFraudRetrieveActionTaskReference;
  }

  public void setCustomerFraudRetrieveActionTaskReference(String customerFraudRetrieveActionTaskReference) {
    this.customerFraudRetrieveActionTaskReference = customerFraudRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerFraudRetrieveActionTaskRecord
  **/

  public Object getCustomerFraudRetrieveActionTaskRecord() {
    return customerFraudRetrieveActionTaskRecord;
  }

  public void setCustomerFraudRetrieveActionTaskRecord(Object customerFraudRetrieveActionTaskRecord) {
    this.customerFraudRetrieveActionTaskRecord = customerFraudRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerFraudRetrieveActionResponse
  **/

  public String getCustomerFraudRetrieveActionResponse() {
    return customerFraudRetrieveActionResponse;
  }

  public void setCustomerFraudRetrieveActionResponse(String customerFraudRetrieveActionResponse) {
    this.customerFraudRetrieveActionResponse = customerFraudRetrieveActionResponse;
  }


  /**
   * Get customerFraudInstanceReport
   * @return customerFraudInstanceReport
  **/

  public BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceReport getCustomerFraudInstanceReport() {
    return customerFraudInstanceReport;
  }

  public void setCustomerFraudInstanceReport(BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceReport customerFraudInstanceReport) {
    this.customerFraudInstanceReport = customerFraudInstanceReport;
  }


  /**
   * Get customerFraudInstanceAnalysis
   * @return customerFraudInstanceAnalysis
  **/

  public BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceAnalysis getCustomerFraudInstanceAnalysis() {
    return customerFraudInstanceAnalysis;
  }

  public void setCustomerFraudInstanceAnalysis(BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceAnalysis customerFraudInstanceAnalysis) {
    this.customerFraudInstanceAnalysis = customerFraudInstanceAnalysis;
  }


}

