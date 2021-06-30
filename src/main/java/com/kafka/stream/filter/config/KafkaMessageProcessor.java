package com.kafka.stream.filter.config;

import com.kafka.stream.model.CustomMessage;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * Configuration Class defining the Bean Handling Event Processor Job
 */
@Configuration
public class KafkaMessageProcessor {

    /**
     * Bean Handling the Event Processor Job
     * @return
     */
    @Bean
    public Function<KStream<String, CustomMessage>, KStream<String, CustomMessage>> filterActiveMessages() {
        return kstream -> kstream.filter((key, customMessage) -> {
            if (customMessage.getIsMessageActive().equalsIgnoreCase("Y"))
                System.out.println(String.format("Active Message %s", customMessage.toString()));
            else
                System.out.println(String.format("Inactive Message %s", customMessage.toString()));
            return customMessage.getIsMessageActive().equalsIgnoreCase("Y");
        });
    }

}
