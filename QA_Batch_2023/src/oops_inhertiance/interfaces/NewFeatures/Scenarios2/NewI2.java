package oops_inhertiance.interfaces.NewFeatures.Scenarios2;

public interface NewI2 {

    public static void staticMethod(){
        System.out.println("staticMethod in I2");
    }

    default void defaultMethod2(){
        System.out.println("defaultMethod2 in I2s");
    }

    default void defaultMethodWithSameName(){
        System.out.println("defaultMethodWithSameName in I2");
    }


}
