package com.grpc.protobuf;

import com.grpc.models.Credentials;
import com.grpc.models.EmailCredentials;
import com.grpc.models.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {

        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("abc@gmail.com")
                .setPassword("admin123")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(123123123)
                .setCode(456)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(emailCredentials)
                .build();

        login(credentials);

    }

    private static void login(Credentials credentials) {

        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }

    }
}
