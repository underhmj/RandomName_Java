package RandomNameStart;

import RandomNameLogic.Person;
import RandomNameLogic.PersonCreator;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        PersonCreator personCreator = new PersonCreator();
        Person person = personCreator.RandomizedPerson();
        System.out.println(person.getFirstName()+" "+person.getNickName()+" "+person.getLastName());
    }
}
