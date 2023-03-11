package com.grpc.protobuf;

import com.grpc.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {

        Person person = Person.newBuilder()
                .setName("Aaryan")
                .setAge(23)
                .build();


        Path path = Paths.get("sam.ser");
        Files.write(path, person.toByteArray());

    }
}
