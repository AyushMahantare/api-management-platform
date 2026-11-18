package com.apimanagement.user;

public class UserTest {

    public static void main(String[] args) {

        UserService service = new UserService();

        User user1 = new User(
                101, "Ayush", "ayush@gmail.com",
                "password123", "USER", "ACTIVE"
        );

        User user2 = new User(
                102, "Rahul", "rahul@gmail.com",
                "password456", "USER", "ACTIVE"
        );

        service.registerUser(user1);
        service.registerUser(user2);

        service.displayUsers();
    }
}