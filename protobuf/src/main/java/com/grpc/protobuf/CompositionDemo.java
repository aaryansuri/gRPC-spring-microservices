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

        Car car1 = Car.newBuilder()
                .setCompany("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();

        Car car2 = Car.newBuilder()
                .setCompany("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();

        Person person = Person.newBuilder()
                .setName("Sam")
                .setAge(25)
                .addCar(car1)
                .addCar(car2)
                .setAddress(address)
                .build();

        System.out.println(person);

    }

}
