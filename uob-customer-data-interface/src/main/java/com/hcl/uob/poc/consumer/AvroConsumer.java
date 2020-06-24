package com.hcl.uob.poc.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.uob.poc.model.AdobeModel;
import com.hcl.uob.poc.model.CustomerDetails;
import com.hcl.uob.poc.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class AvroConsumer {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    MultiValueMap createHeaders;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    CustomerTransformer customerTransformer;

    @Value("${adobe.rest.endpoint}")
    String restendPoint;

    @KafkaListener(topics = "${kafka.topic.name}")
    public void receive(CustomerDetails customerDetails) {
        if(null != customerDetails){
            AdobeModel adobeModel = customerTransformer.transformToAdobeModel(customerDetails);
            try {
                String adobeModelAsString = objectMapper.writeValueAsString(adobeModel);
                System.out.println("Calling Adobe ENdpoint !!! --> "/*+adobeModelAsString*/);
                ResponseEntity<Object> response = restTemplate.exchange(new URI(restendPoint), HttpMethod.POST,
                        new HttpEntity<>(adobeModelAsString, createHeaders), Object.class);
            } catch (Exception exp) {
                System.out.println("Error while processing the Adobe End Point");
                //Supressing the exception, to maintain the transaction, better throw the exception
            }
        }
    }
}