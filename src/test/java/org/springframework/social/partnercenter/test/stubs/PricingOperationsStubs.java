package org.springframework.social.partnercenter.test.stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.social.partnercenter.test.Resource.parseFile;

public class PricingOperationsStubs {
	public static void given_getAzurePricing_200_OK() {
		stubFor(get(urlEqualTo("/v1/ratecards/azure"))
				.willReturn(aResponse()
						.withStatus(200)
						.withHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
						.withBody(parseFile("data/pricing/ok.json").getAsString())));
	}
}
