package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceReport
 */
public class BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceReport   {
  private Object deviceErrorInstanceReportRecord = null;

  private String deviceErrorInstanceReportType = null;

  private String deviceErrorInstanceReportParameters = null;

  private Object deviceErrorInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return deviceErrorInstanceReportRecord
  **/

  public Object getDeviceErrorInstanceReportRecord() {
    return deviceErrorInstanceReportRecord;
  }

  public void setDeviceErrorInstanceReportRecord(Object deviceErrorInstanceReportRecord) {
    this.deviceErrorInstanceReportRecord = deviceErrorInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return deviceErrorInstanceReportType
  **/

  public String getDeviceErrorInstanceReportType() {
    return deviceErrorInstanceReportType;
  }

  public void setDeviceErrorInstanceReportType(String deviceErrorInstanceReportType) {
    this.deviceErrorInstanceReportType = deviceErrorInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return deviceErrorInstanceReportParameters
  **/

  public String getDeviceErrorInstanceReportParameters() {
    return deviceErrorInstanceReportParameters;
  }

  public void setDeviceErrorInstanceReportParameters(String deviceErrorInstanceReportParameters) {
    this.deviceErrorInstanceReportParameters = deviceErrorInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return deviceErrorInstanceReport
  **/

  public Object getDeviceErrorInstanceReport() {
    return deviceErrorInstanceReport;
  }

  public void setDeviceErrorInstanceReport(Object deviceErrorInstanceReport) {
    this.deviceErrorInstanceReport = deviceErrorInstanceReport;
  }


}

