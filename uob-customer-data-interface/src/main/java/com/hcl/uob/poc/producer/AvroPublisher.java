package com.hcl.uob.poc.producer;

import com.hcl.uob.poc.model.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.kafka.core.KafkaTemplate;

public class AvroPublisher {

    @Value("${kafka.topic.name}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, CustomerDetails> kafkaTemplate;

    public void senddata(CustomerDetails customerDetails) {
        kafkaTemplate.send(topic, customerDetails);
    }
}