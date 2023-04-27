package oops_inhertiance.abstraction;

public class AbstractChildClass extends AbstractClassDemo {
    @Override
    public void abstractMethod() {
        System.out.println("Override Method");
    }

    public static void main(String[] args) {
        AbstractChildClass obj = new AbstractChildClass();
        obj.nonAbstractMethod();
    }

}
