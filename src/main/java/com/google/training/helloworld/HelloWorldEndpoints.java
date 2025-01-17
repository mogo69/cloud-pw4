package com.google.training.helloworld;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;

/**
 * Defines endpoint functions APIs.
 */
@Api(name = "helloworldendpoints", version = "v1",
scopes = {Constants.EMAIL_SCOPE },
        clientIds = {Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID },
        description = "API for hello world endpoints.")

public class HelloWorldEndpoints {

   // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "sayHello", path = "sayHello",
            httpMethod = HttpMethod.GET)

    public HelloClass sayHello() {
        return new HelloClass();
    }

    // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "sayHelloByName", path = "sayHelloByName",
            httpMethod = HttpMethod.GET)

    public HelloClass sayHelloByName (@Named("name") String name) {
        return new HelloClass(name);
    }

	@ApiMethod(name = "greetByPeriod", path = "greetByPeriod", httpMethod = HttpMethod.GET)
	public HelloClass greetByPeriod(@Named("name") String name,
			@Named("period") String period) {
		return new HelloClass(name, period);
	}
	
	@ApiMethod(name = "getPrediction", path = "getPrediction", httpMethod = HttpMethod.GET)
	public HelloClass getPrediction(@Named("name") String name) {
		HelloClass hc = new HelloClass(name);
		hc.getPrediction();
		return hc;
	}

}
