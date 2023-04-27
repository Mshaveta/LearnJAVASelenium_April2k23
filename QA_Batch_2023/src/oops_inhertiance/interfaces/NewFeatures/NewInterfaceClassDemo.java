package oops_inhertiance.interfaces.NewFeatures;

public class NewInterfaceClassDemo  implements NewI1{
    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod of an Interface");
    }
//    public void defaultNonStaticMethod(){
//
//        System.out.println("defaultNonStaticMethod in child class");
//    }

    public static void staticMethod(){
        System.out.println("staticMethod in child class");
    }

    public static void main(String[] args) {
        NewInterfaceClassDemo obj = new NewInterfaceClassDemo();
        obj.defaultNonStaticMethod();
        NewI1.staticMethod();
        NewInterfaceClassDemo.staticMethod();
    }



}
