package oops_inhertiance.interfaces.NewFeatures.Scenarios2;

public interface NewI1 {

    public static void staticMethod(){
        System.out.println("staticMethod in I1");
    }

    default void defaultMethod(){
        System.out.println("defaultMethod in I1");
    }

    default void defaultMethodWithSameName(){
        System.out.println("defaultMethodWithSameName in I1");
    }

}
