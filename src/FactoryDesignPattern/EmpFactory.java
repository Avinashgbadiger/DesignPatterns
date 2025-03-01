package FactoryDesignPattern;

public class EmpFactory {

    public static Employee getEmp(String emp)
    {
        if(emp.trim().equalsIgnoreCase("BackEnd"))
        {
            return new BackEndDeveloper();
        } else if (emp.trim().equalsIgnoreCase("Web")) {
            return new WebDeveloper();
        }
        else {
            throw new RuntimeException("There is no Object With That name");
        }
    }
}
