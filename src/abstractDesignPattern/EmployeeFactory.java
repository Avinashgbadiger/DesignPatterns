package abstractDesignPattern;

public class EmployeeFactory {

    public static Employee getEmp(EmployeeAbstractFactory factory)
    {
        return factory.createEmp();
    }
}
