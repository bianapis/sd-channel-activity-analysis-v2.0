package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceAnalysis;
import org.bian.dto.BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceRecord;
import org.bian.dto.BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceReport;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorRetrieveOutputModel
 */
public class BQDeviceErrorRetrieveOutputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceRecord deviceErrorInstanceRecord = null;

  private String deviceErrorRetrieveActionTaskReference = null;

  private Object deviceErrorRetrieveActionTaskRecord = null;

  private String deviceErrorRetrieveActionResponse = null;

  private BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceReport deviceErrorInstanceReport = null;

  private BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceAnalysis deviceErrorInstanceAnalysis = null;


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
   * Get deviceErrorInstanceRecord
   * @return deviceErrorInstanceRecord
  **/

  public BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceRecord getDeviceErrorInstanceRecord() {
    return deviceErrorInstanceRecord;
  }

  public void setDeviceErrorInstanceRecord(BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceRecord deviceErrorInstanceRecord) {
    this.deviceErrorInstanceRecord = deviceErrorInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Device Error instance retrieve service call 
   * @return deviceErrorRetrieveActionTaskReference
  **/

  public String getDeviceErrorRetrieveActionTaskReference() {
    return deviceErrorRetrieveActionTaskReference;
  }

  public void setDeviceErrorRetrieveActionTaskReference(String deviceErrorRetrieveActionTaskReference) {
    this.deviceErrorRetrieveActionTaskReference = deviceErrorRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return deviceErrorRetrieveActionResponse
  **/

  public String getDeviceErrorRetrieveActionResponse() {
    return deviceErrorRetrieveActionResponse;
  }

  public void setDeviceErrorRetrieveActionResponse(String deviceErrorRetrieveActionResponse) {
    this.deviceErrorRetrieveActionResponse = deviceErrorRetrieveActionResponse;
  }


  /**
   * Get deviceErrorInstanceReport
   * @return deviceErrorInstanceReport
  **/

  public BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceReport getDeviceErrorInstanceReport() {
    return deviceErrorInstanceReport;
  }

  public void setDeviceErrorInstanceReport(BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceReport deviceErrorInstanceReport) {
    this.deviceErrorInstanceReport = deviceErrorInstanceReport;
  }


  /**
   * Get deviceErrorInstanceAnalysis
   * @return deviceErrorInstanceAnalysis
  **/

  public BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceAnalysis getDeviceErrorInstanceAnalysis() {
    return deviceErrorInstanceAnalysis;
  }

  public void setDeviceErrorInstanceAnalysis(BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceAnalysis deviceErrorInstanceAnalysis) {
    this.deviceErrorInstanceAnalysis = deviceErrorInstanceAnalysis;
  }


}

