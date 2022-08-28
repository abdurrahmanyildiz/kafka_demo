package com.ayildiz.kafkademo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    public final String TOPIC_NAME="ayildiz";

    @KafkaListener(topics = TOPIC_NAME, groupId = "groupId")
    void listeners(String data) {
        System.out.println(TOPIC_NAME + " listener got data: " + data);
    }
}
