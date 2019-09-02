package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisRequestOutputModel
 */
public class CRChannelActivityAnalysisRequestOutputModel   {
  private CRChannelActivityAnalysisEvaluateOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisRequestActionTaskReference = null;

  private Object channelActivityAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Channel Activity Analysis instance request service call 
   * @return channelActivityAnalysisRequestActionTaskReference
  **/

  public String getChannelActivityAnalysisRequestActionTaskReference() {
    return channelActivityAnalysisRequestActionTaskReference;
  }

  public void setChannelActivityAnalysisRequestActionTaskReference(String channelActivityAnalysisRequestActionTaskReference) {
    this.channelActivityAnalysisRequestActionTaskReference = channelActivityAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return channelActivityAnalysisRequestActionTaskRecord
  **/

  public Object getChannelActivityAnalysisRequestActionTaskRecord() {
    return channelActivityAnalysisRequestActionTaskRecord;
  }

  public void setChannelActivityAnalysisRequestActionTaskRecord(Object channelActivityAnalysisRequestActionTaskRecord) {
    this.channelActivityAnalysisRequestActionTaskRecord = channelActivityAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

