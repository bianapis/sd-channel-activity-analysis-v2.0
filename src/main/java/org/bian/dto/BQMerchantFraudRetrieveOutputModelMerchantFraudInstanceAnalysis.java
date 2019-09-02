package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceAnalysis
 */
public class BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceAnalysis   {
  private Object merchantFraudInstanceAnalysisRecord = null;

  private String merchantFraudInstanceAnalysisReportType = null;

  private String merchantFraudInstanceAnalysisParameters = null;

  private Object merchantFraudInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return merchantFraudInstanceAnalysisRecord
  **/

  public Object getMerchantFraudInstanceAnalysisRecord() {
    return merchantFraudInstanceAnalysisRecord;
  }

  public void setMerchantFraudInstanceAnalysisRecord(Object merchantFraudInstanceAnalysisRecord) {
    this.merchantFraudInstanceAnalysisRecord = merchantFraudInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return merchantFraudInstanceAnalysisReportType
  **/

  public String getMerchantFraudInstanceAnalysisReportType() {
    return merchantFraudInstanceAnalysisReportType;
  }

  public void setMerchantFraudInstanceAnalysisReportType(String merchantFraudInstanceAnalysisReportType) {
    this.merchantFraudInstanceAnalysisReportType = merchantFraudInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return merchantFraudInstanceAnalysisParameters
  **/

  public String getMerchantFraudInstanceAnalysisParameters() {
    return merchantFraudInstanceAnalysisParameters;
  }

  public void setMerchantFraudInstanceAnalysisParameters(String merchantFraudInstanceAnalysisParameters) {
    this.merchantFraudInstanceAnalysisParameters = merchantFraudInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return merchantFraudInstanceAnalysisReport
  **/

  public Object getMerchantFraudInstanceAnalysisReport() {
    return merchantFraudInstanceAnalysisReport;
  }

  public void setMerchantFraudInstanceAnalysisReport(Object merchantFraudInstanceAnalysisReport) {
    this.merchantFraudInstanceAnalysisReport = merchantFraudInstanceAnalysisReport;
  }


}

