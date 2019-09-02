package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceReport
 */
public class BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceReport   {
  private Object merchantFraudInstanceReportRecord = null;

  private String merchantFraudInstanceReportType = null;

  private String merchantFraudInstanceReportParameters = null;

  private Object merchantFraudInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return merchantFraudInstanceReportRecord
  **/

  public Object getMerchantFraudInstanceReportRecord() {
    return merchantFraudInstanceReportRecord;
  }

  public void setMerchantFraudInstanceReportRecord(Object merchantFraudInstanceReportRecord) {
    this.merchantFraudInstanceReportRecord = merchantFraudInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return merchantFraudInstanceReportType
  **/

  public String getMerchantFraudInstanceReportType() {
    return merchantFraudInstanceReportType;
  }

  public void setMerchantFraudInstanceReportType(String merchantFraudInstanceReportType) {
    this.merchantFraudInstanceReportType = merchantFraudInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return merchantFraudInstanceReportParameters
  **/

  public String getMerchantFraudInstanceReportParameters() {
    return merchantFraudInstanceReportParameters;
  }

  public void setMerchantFraudInstanceReportParameters(String merchantFraudInstanceReportParameters) {
    this.merchantFraudInstanceReportParameters = merchantFraudInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return merchantFraudInstanceReport
  **/

  public Object getMerchantFraudInstanceReport() {
    return merchantFraudInstanceReport;
  }

  public void setMerchantFraudInstanceReport(Object merchantFraudInstanceReport) {
    this.merchantFraudInstanceReport = merchantFraudInstanceReport;
  }


}

