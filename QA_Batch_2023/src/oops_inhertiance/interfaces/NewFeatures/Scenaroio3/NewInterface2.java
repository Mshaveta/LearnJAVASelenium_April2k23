package oops_inhertiance.interfaces.NewFeatures.Scenaroio3;

interface NewInterface2 extends NewInterface1 {
    public void abstractMethodInterface2();
    default  public void defaultMethodI1(){
        NewInterface1.super.defaultMethodI1();
        System.out.println("defaultMethodI2....");
    }
    public static  void staticMethodInterface2(){
        System.out.println("staticMethodInterface2....");
    }
}
