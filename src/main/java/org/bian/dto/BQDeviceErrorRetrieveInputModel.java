package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceErrorRetrieveInputModelDeviceErrorInstanceAnalysis;
import org.bian.dto.BQDeviceErrorRetrieveInputModelDeviceErrorInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorRetrieveInputModel
 */
public class BQDeviceErrorRetrieveInputModel   {
  private Object deviceErrorRetrieveActionTaskRecord = null;

  private String deviceErrorRetrieveActionRequest = null;

  private BQDeviceErrorRetrieveInputModelDeviceErrorInstanceReport deviceErrorInstanceReport = null;

  private BQDeviceErrorRetrieveInputModelDeviceErrorInstanceAnalysis deviceErrorInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return deviceErrorRetrieveActionTaskRecord
  **/

  public Object getDeviceErrorRetrieveActionTaskRecord() {
    return deviceErrorRetrieveActionTaskRecord;
  }

  public void setDeviceErrorRetrieveActionTaskRecord(Object deviceErrorRetrieveActionTaskRecord) {
    this.deviceErrorRetrieveActionTaskRecord = deviceErrorRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return deviceErrorRetrieveActionRequest
  **/

  public String getDeviceErrorRetrieveActionRequest() {
    return deviceErrorRetrieveActionRequest;
  }

  public void setDeviceErrorRetrieveActionRequest(String deviceErrorRetrieveActionRequest) {
    this.deviceErrorRetrieveActionRequest = deviceErrorRetrieveActionRequest;
  }


  /**
   * Get deviceErrorInstanceReport
   * @return deviceErrorInstanceReport
  **/

  public BQDeviceErrorRetrieveInputModelDeviceErrorInstanceReport getDeviceErrorInstanceReport() {
    return deviceErrorInstanceReport;
  }

  public void setDeviceErrorInstanceReport(BQDeviceErrorRetrieveInputModelDeviceErrorInstanceReport deviceErrorInstanceReport) {
    this.deviceErrorInstanceReport = deviceErrorInstanceReport;
  }


  /**
   * Get deviceErrorInstanceAnalysis
   * @return deviceErrorInstanceAnalysis
  **/

  public BQDeviceErrorRetrieveInputModelDeviceErrorInstanceAnalysis getDeviceErrorInstanceAnalysis() {
    return deviceErrorInstanceAnalysis;
  }

  public void setDeviceErrorInstanceAnalysis(BQDeviceErrorRetrieveInputModelDeviceErrorInstanceAnalysis deviceErrorInstanceAnalysis) {
    this.deviceErrorInstanceAnalysis = deviceErrorInstanceAnalysis;
  }


}

