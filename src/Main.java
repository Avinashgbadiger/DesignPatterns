import singleton.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa1=Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        System.out.println("----------------");

//        System.out.println(Person.getPerson().hashCode());
//        System.out.println(Person.getPerson().hashCode());
        /*
        * 1.Breaking the Singleton by Reflection API
        *    By changing the Access Modifier
        * 2. By Adding Condition , if someone trying to create and object
        *    Throw an ERROR.
        * 3. By making class as a ENUM
        *
         */


        Constructor<?>[] declaredConstructors = Samosa.class.getDeclaredConstructors();
            declaredConstructors[0].setAccessible(true);
        Constructor[] clone = declaredConstructors.clone();

        Samosa samosa2 = (Samosa) declaredConstructors[0].newInstance();
        System.out.println("New Object : "+samosa2);


        /*
         * Factory Design Pattern
         */

//        Employee employee= EmpFactory.getEmp("BackEnd");
//        int sal=employee.salary();
//        System.out.println("BackEnd Developer :"+sal);
//        employee=EmpFactory.getEmp("Web");
//       int webSal= employee.salary();
//        System.out.println("Web Developer :"+webSal);




    }
}