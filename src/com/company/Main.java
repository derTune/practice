package com.company;

public class Main {
    public static void main(String[] args) {
        DB database = new DB();
//        User user1 = new User("Beka", "qwerty1234");
//        database.registerUser(user1);
        AuthorizedUser user = new AuthorizedUser();
        user = database.authorize("Beka", "qwerty1234");
        if(user != null) {
            System.out.println("Access granted!");
        }
        else {
            System.out.println("Authorization failed!");
        }
        System.out.println(user.toString());
    }
}
