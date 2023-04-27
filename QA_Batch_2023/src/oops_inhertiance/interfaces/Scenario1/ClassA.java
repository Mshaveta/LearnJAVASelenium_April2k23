package oops_inhertiance.interfaces.Scenario1;

public class ClassA implements I1,I2 {




    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m2() {

    }


    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.m2();
        System.out.println(I1.a);
        obj.m4();
    }




}
