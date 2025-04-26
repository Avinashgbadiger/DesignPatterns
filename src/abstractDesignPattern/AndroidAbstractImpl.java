package abstractDesignPattern;

public class AndroidAbstractImpl extends EmployeeAbstractFactory{

    @Override
    public Employee createEmp() {
        return new AndroidDev();
    }
}
