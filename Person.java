/**
 * This abstract class models the people in a city
 * @author Madi Binyon
 * @version 1.00
 */
public class Person {
    protected String name;
    protected int age;
    protected String phoneNum;
    public Person()
    {
        name = "Madi";
        age = 20;
        phoneNum = "(509)555-5555";
    }

    /**
     * Initialize the qualites of the Person being created
     * @param na specifies the persons's name
     * @param ag specifies their age
     * @param pn specifies their phone number
     */
    public Person(String na, int ag, String pn)
    {
        name = na;
        age = ag;
        phoneNum = pn;
    }

    /**
     * Sets person's name
     * @param nam Desired name
     */
    public void setName(String nam) { name = nam; }

    /**
     * Sets person's age
     * @param ag Desired age
     */
    //PT -- make sure you're getting a valid age, phonenumber. -2
    public void setAge(int ag) { age = ag; }

    /**
     * Sets person's phone number
     * @param pn Desired phone number
     */
    public void setphoneNum(String pn) { phoneNum = pn; }

    /**
     * Return the person's name
     * @return Person's name
     */
    public String getName() { return name; }

    /**
     * Return the person's age
     * @return Person's age
     */
    public int getAge() { return age; }

    /**
     * Return the person's phone number
     * @return Person's phone number
     */
    public String getPhoneNum() { return phoneNum; }
}
