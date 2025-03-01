package FactoryDesignPattern;

import javax.lang.model.element.VariableElement;
import java.awt.*;

public class BackEndDeveloper implements Employee{

    @Override
    public int salary() {
        return 30000;
    }
}
