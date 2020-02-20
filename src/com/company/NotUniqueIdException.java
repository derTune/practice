package com.company;

public class NotUniqueIdException extends Exception {
    public NotUniqueIdException(String msg) {
        System.out.println(msg);
    }
}
