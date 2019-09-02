/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyse;

@BianRestController
public class ChannelActivityAnalysisApiController {

	@Autowired
	ChannelActivityAnalysisApiService service;
	
	@Analyse.Activate
	public BianResponse<SDChannelActivityAnalysisActivateOutputModel> activate(@RequestBody BianRequest<SDChannelActivityAnalysisActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Analyse.Configure
	public BianResponse<SDChannelActivityAnalysisConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDChannelActivityAnalysisConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Evaluate
	public BianResponse<CRChannelActivityAnalysisEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRChannelActivityAnalysisEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("bot")
	@Analyse.Execute
	public BianResponse<BQBotExecuteOutputModel> executeBot(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBotExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeBot(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("customerbehavior")
	@Analyse.Execute
	public BianResponse<BQCustomerBehaviorExecuteOutputModel> executeCustomerbehavior(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCustomerBehaviorExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeCustomerbehavior(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("customerfraud")
	@Analyse.Execute
	public BianResponse<BQCustomerFraudExecuteOutputModel> executeCustomerfraud(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCustomerFraudExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeCustomerfraud(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("deviceerror")
	@Analyse.Execute
	public BianResponse<BQDeviceErrorExecuteOutputModel> executeDeviceerror(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceErrorExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDeviceerror(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("merchantbehavior")
	@Analyse.Execute
	public BianResponse<BQMerchantBehaviorExecuteOutputModel> executeMerchantbehavior(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMerchantBehaviorExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeMerchantbehavior(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("merchantfraud")
	@Analyse.Execute
	public BianResponse<BQMerchantFraudExecuteOutputModel> executeMerchantfraud(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMerchantFraudExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeMerchantfraud(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Execute
	public BianResponse<CRChannelActivityAnalysisExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRChannelActivityAnalysisExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Feedback
	public BianResponse<SDChannelActivityAnalysisFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDChannelActivityAnalysisFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Request
	public BianResponse<CRChannelActivityAnalysisRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRChannelActivityAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Retrieve
	public BianResponse<CRChannelActivityAnalysisRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Analyse.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Analyse.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("bot")
	@Analyse.Retrieve
	public BianResponse<BQBotRetrieveOutputModel> retrieveBot(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBot(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("customerbehavior")
	@Analyse.Retrieve
	public BianResponse<BQCustomerBehaviorRetrieveOutputModel> retrieveCustomerbehavior(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomerbehavior(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("customerfraud")
	@Analyse.Retrieve
	public BianResponse<BQCustomerFraudRetrieveOutputModel> retrieveCustomerfraud(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomerfraud(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("deviceerror")
	@Analyse.Retrieve
	public BianResponse<BQDeviceErrorRetrieveOutputModel> retrieveDeviceerror(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeviceerror(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("merchantbehavior")
	@Analyse.Retrieve
	public BianResponse<BQMerchantBehaviorRetrieveOutputModel> retrieveMerchantbehavior(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMerchantbehavior(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("merchantfraud")
	@Analyse.Retrieve
	public BianResponse<BQMerchantFraudRetrieveOutputModel> retrieveMerchantfraud(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMerchantfraud(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Analyse.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Analyse.RetrieveSD
	public BianResponse<SDChannelActivityAnalysisRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
}
