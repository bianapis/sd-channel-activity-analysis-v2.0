package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisEvaluateInputModel
 */
public class CRChannelActivityAnalysisEvaluateInputModel   {
  private String channelActivityAnalysisServicingSessionReference = null;

  private Object channelActivityAnalysisEvaluateActionRecord = null;

  private String channelActivityAnalysisInstanceStatus = null;

  private CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return channelActivityAnalysisServicingSessionReference
  **/

  public String getChannelActivityAnalysisServicingSessionReference() {
    return channelActivityAnalysisServicingSessionReference;
  }

  public void setChannelActivityAnalysisServicingSessionReference(String channelActivityAnalysisServicingSessionReference) {
    this.channelActivityAnalysisServicingSessionReference = channelActivityAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return channelActivityAnalysisEvaluateActionRecord
  **/

  public Object getChannelActivityAnalysisEvaluateActionRecord() {
    return channelActivityAnalysisEvaluateActionRecord;
  }

  public void setChannelActivityAnalysisEvaluateActionRecord(Object channelActivityAnalysisEvaluateActionRecord) {
    this.channelActivityAnalysisEvaluateActionRecord = channelActivityAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Channel Activity Analysis instance (e.g. initialised, pending, active) 
   * @return channelActivityAnalysisInstanceStatus
  **/

  public String getChannelActivityAnalysisInstanceStatus() {
    return channelActivityAnalysisInstanceStatus;
  }

  public void setChannelActivityAnalysisInstanceStatus(String channelActivityAnalysisInstanceStatus) {
    this.channelActivityAnalysisInstanceStatus = channelActivityAnalysisInstanceStatus;
  }


  /**
   * Get channelActivityAnalysisInstanceRecord
   * @return channelActivityAnalysisInstanceRecord
  **/

  public CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(CRChannelActivityAnalysisEvaluateInputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


}

