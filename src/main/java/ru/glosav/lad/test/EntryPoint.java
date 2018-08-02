package ru.glosav.lad.test;

public class EntryPoint {
    public static void main(String[] args) {
        ProducerRecordRealization re = new ProducerRecordRealization();
        Produce prod = new Produce();
        prod.SendMessage(re.getRecord());
    }
}
