package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan","Ivanov",(byte) 30);
        userService.saveUser("Petr","Petrov",(byte) 29);
        userService.saveUser("Vladimir","Ivanov2",(byte) 28);
        userService.saveUser("Igor","Petrov2",(byte) 27);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        System.out.println(userService.getAllUsers());
        userService.dropUsersTable();
        System.out.println(userService.getAllUsers());
    }
}
