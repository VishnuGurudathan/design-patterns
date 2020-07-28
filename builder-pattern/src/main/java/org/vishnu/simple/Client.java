package org.vishnu.simple;

/**
 * @author vishnu.g
 * @project org.vishnu.simple : builder-pattern
 * @created 16/May/2020
 */
public class Client {
    public static void main(String[] args) {
        User user = new User.UserBuilder("ds", "sd").phone("+91 9876543210").age(20).build();
        System.out.println(user);

        System.out.println("========================================");

        User userData = new User.UserBuilder("vishnu", "G")
                .with(userBuilder -> {
                    userBuilder.phone("+91 9876543210");
                    userBuilder.age(30);
                }).build();

        User userData1 = new User.UserBuilder("vishnu", "G")
                .with(userBuilder -> {
                    userBuilder.phone("+91 9876543210");
                }).with(userBuilder -> userBuilder.age(29))
                .build();
        System.out.println(userData);
        System.out.println("========================================");
        System.out.println(userData1);
    }
}
