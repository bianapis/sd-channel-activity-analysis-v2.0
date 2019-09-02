package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceAnalysis;
import org.bian.dto.BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceRecord;
import org.bian.dto.BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceReport;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorRetrieveOutputModel
 */
public class BQCustomerBehaviorRetrieveOutputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceRecord customerBehaviorInstanceRecord = null;

  private String customerBehaviorRetrieveActionTaskReference = null;

  private Object customerBehaviorRetrieveActionTaskRecord = null;

  private String customerBehaviorRetrieveActionResponse = null;

  private BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceReport customerBehaviorInstanceReport = null;

  private BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceAnalysis customerBehaviorInstanceAnalysis = null;


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
   * Get customerBehaviorInstanceRecord
   * @return customerBehaviorInstanceRecord
  **/

  public BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceRecord getCustomerBehaviorInstanceRecord() {
    return customerBehaviorInstanceRecord;
  }

  public void setCustomerBehaviorInstanceRecord(BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceRecord customerBehaviorInstanceRecord) {
    this.customerBehaviorInstanceRecord = customerBehaviorInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior instance retrieve service call 
   * @return customerBehaviorRetrieveActionTaskReference
  **/

  public String getCustomerBehaviorRetrieveActionTaskReference() {
    return customerBehaviorRetrieveActionTaskReference;
  }

  public void setCustomerBehaviorRetrieveActionTaskReference(String customerBehaviorRetrieveActionTaskReference) {
    this.customerBehaviorRetrieveActionTaskReference = customerBehaviorRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerBehaviorRetrieveActionTaskRecord
  **/

  public Object getCustomerBehaviorRetrieveActionTaskRecord() {
    return customerBehaviorRetrieveActionTaskRecord;
  }

  public void setCustomerBehaviorRetrieveActionTaskRecord(Object customerBehaviorRetrieveActionTaskRecord) {
    this.customerBehaviorRetrieveActionTaskRecord = customerBehaviorRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerBehaviorRetrieveActionResponse
  **/

  public String getCustomerBehaviorRetrieveActionResponse() {
    return customerBehaviorRetrieveActionResponse;
  }

  public void setCustomerBehaviorRetrieveActionResponse(String customerBehaviorRetrieveActionResponse) {
    this.customerBehaviorRetrieveActionResponse = customerBehaviorRetrieveActionResponse;
  }


  /**
   * Get customerBehaviorInstanceReport
   * @return customerBehaviorInstanceReport
  **/

  public BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceReport getCustomerBehaviorInstanceReport() {
    return customerBehaviorInstanceReport;
  }

  public void setCustomerBehaviorInstanceReport(BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceReport customerBehaviorInstanceReport) {
    this.customerBehaviorInstanceReport = customerBehaviorInstanceReport;
  }


  /**
   * Get customerBehaviorInstanceAnalysis
   * @return customerBehaviorInstanceAnalysis
  **/

  public BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceAnalysis getCustomerBehaviorInstanceAnalysis() {
    return customerBehaviorInstanceAnalysis;
  }

  public void setCustomerBehaviorInstanceAnalysis(BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceAnalysis customerBehaviorInstanceAnalysis) {
    this.customerBehaviorInstanceAnalysis = customerBehaviorInstanceAnalysis;
  }


}

