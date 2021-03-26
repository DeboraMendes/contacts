package br.com.contacts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ContactsTest {

    @Test
    public void test1() {

        Node node = new Node();

        Contacts.add("hack", node);
        Contacts.add("hackerrank", node);

        assertEquals(2, Contacts.findPartical("hac", node));

    }

    @Test
    public void test2() {

        Node node = new Node();

        Contacts.add("hack", node);
        Contacts.add("hackerrank", node);

        assertEquals(0, Contacts.findPartical("hak", node));

    }

}
