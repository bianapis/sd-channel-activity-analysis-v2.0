package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBotRetrieveOutputModelBotInstanceReport
 */
public class BQBotRetrieveOutputModelBotInstanceReport   {
  private Object botInstanceReportRecord = null;

  private String botInstanceReportType = null;

  private String botInstanceReportParameters = null;

  private Object botInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return botInstanceReportRecord
  **/

  public Object getBotInstanceReportRecord() {
    return botInstanceReportRecord;
  }

  public void setBotInstanceReportRecord(Object botInstanceReportRecord) {
    this.botInstanceReportRecord = botInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return botInstanceReportType
  **/

  public String getBotInstanceReportType() {
    return botInstanceReportType;
  }

  public void setBotInstanceReportType(String botInstanceReportType) {
    this.botInstanceReportType = botInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return botInstanceReportParameters
  **/

  public String getBotInstanceReportParameters() {
    return botInstanceReportParameters;
  }

  public void setBotInstanceReportParameters(String botInstanceReportParameters) {
    this.botInstanceReportParameters = botInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return botInstanceReport
  **/

  public Object getBotInstanceReport() {
    return botInstanceReport;
  }

  public void setBotInstanceReport(Object botInstanceReport) {
    this.botInstanceReport = botInstanceReport;
  }


}

