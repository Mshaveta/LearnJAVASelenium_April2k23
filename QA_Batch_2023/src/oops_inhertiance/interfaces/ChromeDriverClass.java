package oops_inhertiance.interfaces;

public class ChromeDriverClass implements WebDriverInterface {

    @Override
    public void getUrl(String urlName){
        System.out.println("Get App URL...");
    }

    @Override
    public void getTitle() {
        System.out.println("Get Page Title....");
    }

    public void getChildClassHeading(){
        System.out.println("getChildClassHeading");
    }

    public static void main(String[] args) {

        //way1: all the members of parent class or abstract class or intefaces+ Child class members
        ChromeDriverClass cdc = new ChromeDriverClass();

        cdc.getUrl("http://www.facebook.com");
        cdc.getTitle();
        cdc.getChildClassHeading();
        System.out.println(WebDriverInterface.a);


        //way2: allthe members of parent class or abstract class or intefaces + overriden methods of child class (if
        // have any)
        WebDriverInterface wi = new ChromeDriverClass();
        wi.getTitle();
        wi.getUrl("testing..");


    }

}
