package com.kafka.producer.stream;

import com.kafka.producer.dto.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageProducerStream {

    @Autowired
    private StreamBridge streamBridge;

    public void produceMessage(MessageDto messageDto){
        streamBridge.send("msg-out-0",messageDto);
    }
}
