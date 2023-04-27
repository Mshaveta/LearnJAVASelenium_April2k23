package oops_inhertiance.abstraction;

public abstract  class AbstractClassDemo {

   abstract public void abstractMethod(); //abstract Method

    public void nonAbstractMethod(){
        System.out.println("nonAbstractMethod..."); //NOn-abstract Method
    }

    public static void main(String[] args) {
        AbstractClassDemo acd = new AbstractClassDemo(){
            @Override
            public void abstractMethod() {
                System.out.println("method def.");
            }
        };

        acd.abstractMethod();
        acd.nonAbstractMethod();
    }

}
