package org.personal.local;
import jaxb.Person;

public class PersonService {
    public void testPersonCreation() {
        Person person = new Person();
        person.setAge(27);
        person.setName("Rajeshwar");
        System.out.println(person.getName());
    }
}
