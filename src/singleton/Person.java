package singleton;
/*
* EAGER WAY OF CREATING THE OBJECT
*
 */
public class Person {
    private static final Person person = new Person();

    public static Person getPerson() {
        return person;
    }
}
