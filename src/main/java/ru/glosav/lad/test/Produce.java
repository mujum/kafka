package ru.glosav.lad.test;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.*;

public class Produce {
    private Properties kafkaProperties = new Properties();
    private KafkaProducer producer = null;
    Produce() {
        kafkaProperties.put("bootstrap.servers","localhost:9092");
        kafkaProperties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProperties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer<String, String>(kafkaProperties);
    }
    public void SendMessage(ProducerRecord<String, String> producerRR) {
        try{
            producer.send(producerRR).get();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
