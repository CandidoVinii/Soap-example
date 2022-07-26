package com.apresentation.springbootsoapexample.endpoint;

import com.apresentation.spring_boot_soap_example.GetUserRequest;
import com.apresentation.spring_boot_soap_example.GetUserResponse;
import com.apresentation.springbootsoapexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    private static final String NAMESPACE_URI = "http://apresentation.com/spring-boot-soap-example";
    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = NAMESPACE_URI,
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
