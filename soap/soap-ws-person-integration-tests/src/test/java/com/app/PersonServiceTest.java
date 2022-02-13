package com.app;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class PersonServiceTest {

    @Test
    public void test(){
        PersonServiceService personServiceService = new PersonServiceService();
        PersonService personService = personServiceService.getPersonServicePort();

        personService.removeAll();

        int count=personService.count();
        assertTrue(count==0);

        personService.create("Piter", 35);
        count = personService.count();
        assertTrue(count==1);

        Person person = personService.get(0);
        assertTrue(35==person.getAge());
        assertTrue("Piter".equals(person.getName()));


        personService.create("Jack", 50);
        count = personService.count();
        assertTrue(count==2);

        person = personService.get(1);
        assertTrue(50==person.getAge());
        assertTrue("Jack".equals(person.getName()));


        List<Person> personList =  personService.getAll();
        assertTrue(personList.size()==2);

        person = personList.get(0);
        assertTrue(35==person.getAge());
        assertTrue("Piter".equals(person.getName()));

        person = personList.get(1);
        assertTrue(50==person.getAge());
        assertTrue("Jack".equals(person.getName()));

        personService.remove(0);
        count = personService.count();
        assertTrue(count==1);
    }


}
