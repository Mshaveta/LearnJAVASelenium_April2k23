package oops_inhertiance.interfaces.scenario2;

import oops_inhertiance.interfaces.Scenario1.I1;

public class ClassDemo2 extends ClassDemo1 implements I1 {

    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        ClassDemo2 obj = new ClassDemo2();
        obj.m2();
        obj.cd1();
        System.out.println(I1.a);
    }



}
