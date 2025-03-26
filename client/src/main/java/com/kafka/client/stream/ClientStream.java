package com.kafka.client.stream;


import com.kafka.producer.dto.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class ClientStream {

    @Bean
    public Consumer<MessageDto> msg(){
        return consumer -> {
            log.info("Message received and name is {}",consumer.getName());
            log.info("Received message details : {} ",consumer.toString());
        };
    }

}
