package com.hcl.uob.poc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.uob.poc.consumer.AvroConsumer;
import com.hcl.uob.poc.model.CustomerDetails;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.nio.charset.Charset;

@ComponentScan(value = "com.hcl.uob.poc.*")
@EnableSwagger2
@SpringBootApplication
public class ApplicationConfiguration implements CommandLineRunner {

	@Value("${rest.user.name}")
	String restUser;
	@Value("${rest.password}")
	String restPassword;

	@Autowired
	private AvroConsumer avroConsumer;

	private CustomerDetails customerDetails;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	MultiValueMap createHeaders(){
		String auth = restUser + ":" + restPassword;
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes());
		String authHeader = "Basic " + new String( encodedAuth );
		MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.set("Accept", "application/json");
		multiValueMap.set("Content-type", "application/json");
		multiValueMap.set("Authorization", authHeader);
		return multiValueMap;
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Process Started Initiating !!!");
		avroConsumer.receive(customerDetails);
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.hcl.uob.poc.controller")).build();
	}
}