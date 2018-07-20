package RandomNameLogic.UnitTests;

import RandomNameLogic.Person;
import junit.framework.TestCase;

public class PersonTest extends TestCase {

    Person person;

    public void setUp() throws Exception {
        super.setUp();
        person = new Person("Matthew","Underhill","Undie");
    }

    public void tearDown() throws Exception
    {
        person = null;
    }

    public void testGetFirstName()
    {
        assertNotNull(person.getFirstName());
        assertTrue(person.getFirstName().equals("Matthew"));
    }

    public void testGetLastName()
    {
        assertNotNull(person.getLastName());
        assertTrue(person.getLastName().equals("Underhill"));
    }

    public void testGetNickName()
    {
        assertNotNull(person.getNickName());
        assertTrue(person.getNickName().equals("Undie"));
    }

    public void testSetFirstName()
    {
        person.setFirstName("Jacob");
        assertTrue(person.getFirstName().equals("Jacob"));
    }

    public void testSetLastName()
    {
        person.setLastName("Weber");
        assertTrue(person.getLastName().equals("Weber"));
    }

    public void testSetNickName()
    {
        person.setNickName("Doc");
        assertTrue(person.getNickName().equals("Doc"));
    }
}