package com.apimanagement.user;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();

    // Register user
    public void registerUser(User user) {

        for (User existingUser : users) {

            if (existingUser.getEmail().equals(user.getEmail())) {
                System.out.println("Email already registered!");
                return;
            }
        }

        users.add(user);
        System.out.println("User registered successfully!");
    }

    // Display all users
    public void displayUsers() {

        for (User user : users) {

            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Role: " + user.getRole());
            System.out.println("-------------------");
        }
    }
}