package org.personal;
import org.personal.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(23);
        System.out.println(person.getAge());
        System.out.println("Hello world!");
    }
}