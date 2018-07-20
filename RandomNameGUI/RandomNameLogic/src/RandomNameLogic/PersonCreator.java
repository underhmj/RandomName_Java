package RandomNameLogic;

import java.io.IOException;
import java.util.Random;

public class PersonCreator
{
    private Random random = new Random();
    FileLoader adjectiveLoader = new FileLoader();
    FileLoader nounLoader = new FileLoader();
    FileLoader firstNameLoader = new FileLoader();
    FileLoader lastNameLoader = new FileLoader();


    public Person RandomizedPerson() throws IOException
    {
        Person person = new Person("","","");
        String adjectivePath = "C:\\Users\\matthew.underhill\\IdeaProjects\\RandomNameGUI\\RandomNameLogic\\adjectives.txt";
        String nounPath = "C:\\Users\\matthew.underhill\\IdeaProjects\\RandomNameGUI\\RandomNameLogic\\nouns.txt";
        String firstNamePath = "C:\\Users\\matthew.underhill\\IdeaProjects\\RandomNameGUI\\RandomNameLogic\\firstNames.txt";
        String lastNamePath = "C:\\Users\\matthew.underhill\\IdeaProjects\\RandomNameGUI\\RandomNameLogic\\lastNames.txt";

        adjectiveLoader.LoadFile(adjectivePath);
        nounLoader.LoadFile(nounPath);
        firstNameLoader.LoadFile(firstNamePath);
        lastNameLoader.LoadFile(lastNamePath);

        randomFirstName(person);
        randomLastName(person);
        randomNickname(person);

        return person;
    }

    private void randomFirstName(Person person)
    {
        int firstInt;
        firstInt = random.nextInt(firstNameLoader.getLoadedFile().size());
        person.setFirstName(firstNameLoader.getLoadedFile().get(firstInt));
    }
    private void randomLastName(Person person)
    {
        int lastInt;
        lastInt = random.nextInt(lastNameLoader.getLoadedFile().size());
        person.setLastName(lastNameLoader.getLoadedFile().get(lastInt));
    }
    private void randomNickname(Person person)
    {
        int nickAdjInt, nickNounInt;
        String adjective, noun, nickName;
        nickAdjInt = random.nextInt(adjectiveLoader.getLoadedFile().size());
        adjective = adjectiveLoader.getLoadedFile().get(nickAdjInt);
        adjective = adjective.substring(0,1).toUpperCase() + adjective.substring(1,adjective.length());

        nickNounInt = random.nextInt(nounLoader.getLoadedFile().size());
        noun = nounLoader.getLoadedFile().get(nickNounInt);
        noun = noun.substring(0,1).toUpperCase() + noun.substring(1,noun.length());

        nickName = ("\""+adjective+" "+noun+"\"");
        person.setNickName(nickName);
    }
}
