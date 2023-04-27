package oops_inhertiance.interfaces;

public class MainClass {

    public static void main(String[] args) {
        ChromeDriverClass cdc = new ChromeDriverClass();

        cdc.getUrl("http://www.facebook.com");
        cdc.getTitle();
        System.out.println(WebDriverInterface.a);
        cdc.getChildClassHeading();

        WebDriverInterface wi = new ChromeDriverClass();
        wi.getTitle();
        wi.getUrl("testing..");

    }
}
