public class MainRunnerClass {
    public static void main(String[] args) {
        SeleniumManagerTest smtObj = new SeleniumManagerTest();
        smtObj.launchBrowser();
        smtObj.navigationMethods();
        smtObj.closeBrowser();
    }
}
