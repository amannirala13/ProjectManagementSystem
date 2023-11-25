package com.amannirala13.projectmanagement.helper;

public class Helper {
    public static String generateUUID(){
        return String.format("%s", (int) Math.ceil(Math.random() * 999999));
    }
}
