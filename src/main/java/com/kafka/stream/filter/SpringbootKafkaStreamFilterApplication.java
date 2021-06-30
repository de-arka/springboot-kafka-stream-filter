package com.kafka.stream.filter;

import org.apache.kafka.streams.processor.Processor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Spring Boot Event Processor Application leveraging both Kafka Stream and Cloud Stream
 */
@SpringBootApplication
public class SpringbootKafkaStreamFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaStreamFilterApplication.class, args);
    }

}
