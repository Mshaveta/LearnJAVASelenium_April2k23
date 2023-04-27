package oops_inhertiance.interfacesScenario2.NewFeatures;

public interface NewI1 {
    public void abstractMethod();

    default public void defaultNonStaticMethod(){
        System.out.println("defaultNonStaticMethod in an interface");
    }

    public static void staticMethod(){
        System.out.println("staticMethod");
    }


}
