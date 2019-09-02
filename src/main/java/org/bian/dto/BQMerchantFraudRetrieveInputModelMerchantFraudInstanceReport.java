package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudRetrieveInputModelMerchantFraudInstanceReport
 */
public class BQMerchantFraudRetrieveInputModelMerchantFraudInstanceReport   {
  private String merchantFraudInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return merchantFraudInstanceReportReference
  **/

  public String getMerchantFraudInstanceReportReference() {
    return merchantFraudInstanceReportReference;
  }

  public void setMerchantFraudInstanceReportReference(String merchantFraudInstanceReportReference) {
    this.merchantFraudInstanceReportReference = merchantFraudInstanceReportReference;
  }


}

