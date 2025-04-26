package abstractDesignPattern;

import abstractDesignPattern.Employee;

public class AndroidDev implements Employee {
    @Override
    public int sal() {
        return 30000;
    }

    @Override
    public String name() {
        return "Avinash Back-End";
    }
}
