package com.grpc.protobuf;

import com.grpc.models.Car;
import com.grpc.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {

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

        Dealer dealer = Dealer.newBuilder()
                .putModel(2005, car1)
                .putModel(2020, car2)
                .build();

        System.out.println(dealer.getModelOrDefault(2005, car2));

    }
}
