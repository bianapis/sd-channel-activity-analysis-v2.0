package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceReport
 */
public class BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceReport   {
  private String merchantBehaviorInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return merchantBehaviorInstanceReportReference
  **/

  public String getMerchantBehaviorInstanceReportReference() {
    return merchantBehaviorInstanceReportReference;
  }

  public void setMerchantBehaviorInstanceReportReference(String merchantBehaviorInstanceReportReference) {
    this.merchantBehaviorInstanceReportReference = merchantBehaviorInstanceReportReference;
  }


}

