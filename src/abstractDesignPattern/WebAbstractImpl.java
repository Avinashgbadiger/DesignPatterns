package abstractDesignPattern;

public class WebAbstractImpl extends EmployeeAbstractFactory {
    @Override
    public Employee createEmp() {
        return new WebDev();
    }
}
