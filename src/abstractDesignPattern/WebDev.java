package abstractDesignPattern;

public class WebDev implements Employee{
    @Override
    public int sal() {
        return 45000;
    }

    @Override
    public String name() {
        return "Web Dev Avinash";
    }
}
