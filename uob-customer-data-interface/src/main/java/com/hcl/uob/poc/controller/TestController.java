package com.hcl.uob.poc.controller;

import com.hcl.uob.poc.model.CustomerModel;
import com.hcl.uob.poc.producer.AvroPublisher;
import com.hcl.uob.poc.producer.AvroPublisherConfig;
import com.hcl.uob.poc.transformer.CustomerTransformer;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    AvroPublisher avroPublisher;

    @Autowired
    AvroPublisherConfig avroPublisherConfig;

    @Autowired
    CustomerTransformer customerTransformer;

    @ApiOperation(value = "Publishing Test Data", notes = "", response = String.class)
    @ApiResponses({ @ApiResponse(code = 200, message = "Successfully searched for Results", response = String.class),
            @ApiResponse(code = 400, message = "Invalid Request", response = String.class) })
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> rmbProducer(@RequestBody CustomerModel customerModel) {
        avroPublisher.senddata(customerTransformer.transform(customerModel));
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }
}
