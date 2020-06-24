package com.hcl.uob.poc.consumer;

import com.hcl.uob.poc.model.CustomerDetails;
import com.hcl.uob.poc.serializer.AvroDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class ArvoConsumerConfig {
    @Value("${kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${kafka.consumer.id}")
    private String consumerId;

    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, AvroDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, consumerId);

        return props;
    }

    @Bean
    public ConsumerFactory<String, CustomerDetails> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
                new AvroDeserializer<>(CustomerDetails.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CustomerDetails> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CustomerDetails> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());

        return factory;
    }

    @Bean
    public AvroConsumer arvoConsumer() {
        return new AvroConsumer();
    }
}