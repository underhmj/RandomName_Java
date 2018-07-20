package RandomNameLogic;

public class Person
{
    private String firstName;
    private String lastName;
    private String nickName;

    public Person(String firstName, String lastName, String nickName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getNickName()
    {
        return this.nickName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }
}
