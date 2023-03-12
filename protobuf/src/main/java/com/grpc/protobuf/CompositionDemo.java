package com.grpc.protobuf;

import com.grpc.models.Address;
import com.grpc.models.Car;
import com.grpc.models.Person;

public class CompositionDemo {

    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setPostBox(123)
                .setStreet("main street")
                .setCity("Atlanta")
                .build();

        Car car = Car.newBuilder()
                .setCompany("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();

        Person person = Person.newBuilder()
                .setName("Sam")
                .setAge(25)
                .setCar(car)
                .setAddress(address)
                .build();

        System.out.println(person);

    }

}
