package com.jap;

/**
 * Hello world!
 *
 */
public class StringManipulationDemo {
    public void checkPassword(String password) {
        if (password.length() < 15) {
            System.out.println("Password is less than 15 Characters");
        } else {
            System.out.println("Password is more than 15 Characters");
        }

    }

    public void checkEqualityforUserNameAndPassword(String username, String password) {
        if (username.equals("James") && password.equals("password@123")) {
            System.out.println("Username and Password are correct ");
        } else {
            System.out.println("Username and Password are incorrect");
        }

    }

    public String changeUserName(String username) {
        String newUserName = username.toUpperCase();
        return newUserName;
    }

    public static void main(String[] args) {
        StringManipulationDemo stringManipulation = new StringManipulationDemo();
        String password = "password@12345";
        stringManipulation.checkPassword(password);
        String username = "John";
        stringManipulation.checkEqualityforUserNameAndPassword(username, password);
        String newUserName = stringManipulation.changeUserName(username);
        System.out.println("Welcome " + newUserName);

    }
}
