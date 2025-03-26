package com.kafka.producer.controller;

import com.kafka.producer.dto.MessageDto;
import com.kafka.producer.stream.MessageProducerStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/msg/")
public class ProducerController {

    @Autowired
    MessageProducerStream messageProducerStream;

    @PostMapping("postMessage")
    public ResponseEntity<String> produceMessage(@RequestBody MessageDto messageDto){
        messageProducerStream.produceMessage(messageDto);
        return new ResponseEntity<>("Good to go !! .Message Received", HttpStatus.ACCEPTED);
    }

}
