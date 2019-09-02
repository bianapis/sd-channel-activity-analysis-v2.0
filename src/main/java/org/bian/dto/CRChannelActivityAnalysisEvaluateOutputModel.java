package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisEvaluateOutputModel
 */
public class CRChannelActivityAnalysisEvaluateOutputModel   {
  private String channelActivityAnalysisInstanceReference = null;

  private String channelActivityAnalysisEvaluateActionReference = null;

  private Object channelActivityAnalysisEvaluateActionRecord = null;

  private String channelActivityAnalysisInstanceStatus = null;

  private CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Channel Activity Analysis instance 
   * @return channelActivityAnalysisInstanceReference
  **/

  public String getChannelActivityAnalysisInstanceReference() {
    return channelActivityAnalysisInstanceReference;
  }

  public void setChannelActivityAnalysisInstanceReference(String channelActivityAnalysisInstanceReference) {
    this.channelActivityAnalysisInstanceReference = channelActivityAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return channelActivityAnalysisEvaluateActionReference
  **/

  public String getChannelActivityAnalysisEvaluateActionReference() {
    return channelActivityAnalysisEvaluateActionReference;
  }

  public void setChannelActivityAnalysisEvaluateActionReference(String channelActivityAnalysisEvaluateActionReference) {
    this.channelActivityAnalysisEvaluateActionReference = channelActivityAnalysisEvaluateActionReference;
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

  public CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


}

