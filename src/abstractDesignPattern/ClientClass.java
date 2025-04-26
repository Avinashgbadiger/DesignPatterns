package abstractDesignPattern;

public interface ClientClass {

     static void main(String[] args) {

         // Android Dev
         Employee e1=EmployeeFactory.getEmp(new AndroidAbstractImpl());
         System.out.println(e1.name());

    }
}
