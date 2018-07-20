package RandomNameLogic.UnitTests;

import RandomNameLogic.Person;
import RandomNameLogic.PersonCreator;
import junit.framework.TestCase;

import java.io.IOException;

public class PersonCreatorTest extends TestCase {

    private PersonCreator personCreator;
    private Person person;

    public void setUp() throws Exception {
        super.setUp();
        personCreator = new PersonCreator();
        person = personCreator.RandomizedPerson();
    }

    public void tearDown() throws Exception
    {
        personCreator = null;
        person = null;
    }

    public void testRandomizedPerson() throws IOException
    {
        person = personCreator.RandomizedPerson();
        assertTrue(!person.getFirstName().equals(""));
        assertTrue(!person.getLastName().equals(""));
        assertTrue(!person.getNickName().equals(""));
    }
}