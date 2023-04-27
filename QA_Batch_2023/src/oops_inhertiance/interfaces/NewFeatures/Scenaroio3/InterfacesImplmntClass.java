package oops_inhertiance.interfaces.NewFeatures.Scenaroio3;

public class InterfacesImplmntClass implements NewInterface2 {
    @Override
    public void abstractMethodInterface1() {
        System.out.println("abstractMethodInterface1 in class");
    }

    @Override
    public void abstractMethodInterface2() {
        System.out.println("abstractMethodInterface2 in class");
        NewInterface2.staticMethodInterface2();
    }

    public static void main(String[] args) {
        InterfacesImplmntClass obj = new InterfacesImplmntClass();
        obj.abstractMethodInterface1();
        obj.abstractMethodInterface2();
        NewInterface1.staticMethodInterface1();
        obj.defaultMethodI1();
    }
}
