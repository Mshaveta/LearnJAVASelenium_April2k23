package oops_inhertiance.interfaces.NewFeatures.Scenaroio3;

interface NewInterface1 {
    public void abstractMethodInterface1();
    default  public void defaultMethodI1(){
        System.out.println("defaultMethodI1....");
    }
    public static  void staticMethodInterface1(){
        System.out.println("staticMethodInterface1....");
    }
}
