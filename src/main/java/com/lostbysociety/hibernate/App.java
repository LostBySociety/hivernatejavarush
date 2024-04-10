package com.lostbysociety.hibernate;

import models.Auto;
import models.User;
import services.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserService userService = new UserService();
       User user = new User("Masha",26);
        userService.save(user);

        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);

        userService.update(user);

        userService.;
       // userService.delete(user);
    }
}
