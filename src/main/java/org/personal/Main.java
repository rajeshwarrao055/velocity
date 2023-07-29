package org.personal;

import org.personal.local.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.testPersonCreation();
        System.out.println("Hello world!");
    }
}