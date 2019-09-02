package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceReport
 */
public class BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceReport   {
  private Object customerFraudInstanceReportRecord = null;

  private String customerFraudInstanceReportType = null;

  private String customerFraudInstanceReportParameters = null;

  private Object customerFraudInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerFraudInstanceReportRecord
  **/

  public Object getCustomerFraudInstanceReportRecord() {
    return customerFraudInstanceReportRecord;
  }

  public void setCustomerFraudInstanceReportRecord(Object customerFraudInstanceReportRecord) {
    this.customerFraudInstanceReportRecord = customerFraudInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerFraudInstanceReportType
  **/

  public String getCustomerFraudInstanceReportType() {
    return customerFraudInstanceReportType;
  }

  public void setCustomerFraudInstanceReportType(String customerFraudInstanceReportType) {
    this.customerFraudInstanceReportType = customerFraudInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerFraudInstanceReportParameters
  **/

  public String getCustomerFraudInstanceReportParameters() {
    return customerFraudInstanceReportParameters;
  }

  public void setCustomerFraudInstanceReportParameters(String customerFraudInstanceReportParameters) {
    this.customerFraudInstanceReportParameters = customerFraudInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerFraudInstanceReport
  **/

  public Object getCustomerFraudInstanceReport() {
    return customerFraudInstanceReport;
  }

  public void setCustomerFraudInstanceReport(Object customerFraudInstanceReport) {
    this.customerFraudInstanceReport = customerFraudInstanceReport;
  }


}

