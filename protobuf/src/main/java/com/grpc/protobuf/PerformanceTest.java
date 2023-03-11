package com.grpc.protobuf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpc.json.JPerson;
import com.grpc.models.Person;

import java.io.IOException;

public class PerformanceTest {

    public static void main(String[] args) {

        JPerson person = new JPerson();
        person.setName("sam");
        person.setAge(10);

        ObjectMapper mapper = new ObjectMapper();

        Runnable jsonRun = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Person person2 = Person.newBuilder().setName("sam").setAge(10).build();

        Runnable protoRun = () -> {
            try {
                byte[] bytes = person2.toByteArray();
                Person person3 = Person.parseFrom(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        runTest(jsonRun, "JSON");
        runTest(protoRun, "PROTO");

    }

    private static void runTest(Runnable runnable, String method) {
        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            runnable.run();
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println(method + " : " + (timeEnd - timeStart) + " ms");
    }

}
