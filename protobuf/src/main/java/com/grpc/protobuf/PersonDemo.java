package com.grpc.protobuf;

import com.grpc.models.Person;

public class PersonDemo {

    public static void main(String[] args) {

        Person test = Person.newBuilder()
                .setName("Aaryan")
                .setAge(23)
                .build();

        Person test2 = Person.newBuilder()
                .setName("Aaryan")
                .setAge(23)
                .build();

        System.out.println(test.equals(test2));

    }
}
