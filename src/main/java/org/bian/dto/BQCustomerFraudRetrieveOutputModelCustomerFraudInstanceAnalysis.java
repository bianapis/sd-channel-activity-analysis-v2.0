package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceAnalysis
 */
public class BQCustomerFraudRetrieveOutputModelCustomerFraudInstanceAnalysis   {
  private Object customerFraudInstanceAnalysisRecord = null;

  private String customerFraudInstanceAnalysisReportType = null;

  private String customerFraudInstanceAnalysisParameters = null;

  private Object customerFraudInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerFraudInstanceAnalysisRecord
  **/

  public Object getCustomerFraudInstanceAnalysisRecord() {
    return customerFraudInstanceAnalysisRecord;
  }

  public void setCustomerFraudInstanceAnalysisRecord(Object customerFraudInstanceAnalysisRecord) {
    this.customerFraudInstanceAnalysisRecord = customerFraudInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerFraudInstanceAnalysisReportType
  **/

  public String getCustomerFraudInstanceAnalysisReportType() {
    return customerFraudInstanceAnalysisReportType;
  }

  public void setCustomerFraudInstanceAnalysisReportType(String customerFraudInstanceAnalysisReportType) {
    this.customerFraudInstanceAnalysisReportType = customerFraudInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerFraudInstanceAnalysisParameters
  **/

  public String getCustomerFraudInstanceAnalysisParameters() {
    return customerFraudInstanceAnalysisParameters;
  }

  public void setCustomerFraudInstanceAnalysisParameters(String customerFraudInstanceAnalysisParameters) {
    this.customerFraudInstanceAnalysisParameters = customerFraudInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerFraudInstanceAnalysisReport
  **/

  public Object getCustomerFraudInstanceAnalysisReport() {
    return customerFraudInstanceAnalysisReport;
  }

  public void setCustomerFraudInstanceAnalysisReport(Object customerFraudInstanceAnalysisReport) {
    this.customerFraudInstanceAnalysisReport = customerFraudInstanceAnalysisReport;
  }


}

