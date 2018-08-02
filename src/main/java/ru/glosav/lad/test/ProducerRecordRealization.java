package ru.glosav.lad.test;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerRecordRealization {
    ProducerRecord<String, String> record=null;
    ProducerRecordRealization() {
        record = new ProducerRecord<String, String>("test", "nest");
    }

    public ProducerRecord<String, String> getRecord() {
        return record;
    }
}
