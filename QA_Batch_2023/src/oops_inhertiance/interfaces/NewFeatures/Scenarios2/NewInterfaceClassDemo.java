package oops_inhertiance.interfaces.NewFeatures.Scenarios2;

public class NewInterfaceClassDemo implements NewI1,NewI2 {

    @Override
    public void defaultMethodWithSameName() {
        NewI1.super.defaultMethodWithSameName();
        NewI2.super.defaultMethodWithSameName();
    }

    public static void main(String[] args) {
        NewI2.staticMethod();
        NewI1.staticMethod();

        NewInterfaceClassDemo obj = new NewInterfaceClassDemo();
        obj.defaultMethod();
        obj.defaultMethod2();
        obj.defaultMethodWithSameName();
    }
}



