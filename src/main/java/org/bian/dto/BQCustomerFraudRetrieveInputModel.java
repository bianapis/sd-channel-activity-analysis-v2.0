package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerFraudRetrieveInputModelCustomerFraudInstanceAnalysis;
import org.bian.dto.BQCustomerFraudRetrieveInputModelCustomerFraudInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudRetrieveInputModel
 */
public class BQCustomerFraudRetrieveInputModel   {
  private Object customerFraudRetrieveActionTaskRecord = null;

  private String customerFraudRetrieveActionRequest = null;

  private BQCustomerFraudRetrieveInputModelCustomerFraudInstanceReport customerFraudInstanceReport = null;

  private BQCustomerFraudRetrieveInputModelCustomerFraudInstanceAnalysis customerFraudInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerFraudRetrieveActionRequest
  **/

  public String getCustomerFraudRetrieveActionRequest() {
    return customerFraudRetrieveActionRequest;
  }

  public void setCustomerFraudRetrieveActionRequest(String customerFraudRetrieveActionRequest) {
    this.customerFraudRetrieveActionRequest = customerFraudRetrieveActionRequest;
  }


  /**
   * Get customerFraudInstanceReport
   * @return customerFraudInstanceReport
  **/

  public BQCustomerFraudRetrieveInputModelCustomerFraudInstanceReport getCustomerFraudInstanceReport() {
    return customerFraudInstanceReport;
  }

  public void setCustomerFraudInstanceReport(BQCustomerFraudRetrieveInputModelCustomerFraudInstanceReport customerFraudInstanceReport) {
    this.customerFraudInstanceReport = customerFraudInstanceReport;
  }


  /**
   * Get customerFraudInstanceAnalysis
   * @return customerFraudInstanceAnalysis
  **/

  public BQCustomerFraudRetrieveInputModelCustomerFraudInstanceAnalysis getCustomerFraudInstanceAnalysis() {
    return customerFraudInstanceAnalysis;
  }

  public void setCustomerFraudInstanceAnalysis(BQCustomerFraudRetrieveInputModelCustomerFraudInstanceAnalysis customerFraudInstanceAnalysis) {
    this.customerFraudInstanceAnalysis = customerFraudInstanceAnalysis;
  }


}

