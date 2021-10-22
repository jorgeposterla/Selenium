package pages;

public class testSandboxPage extends BasePage{

    private String categoryDropdown = "//div[contains(text(),'Prof.')]";

    public testSandboxPage() {
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://www.demoqa.com/select-menu");
    }

    public void clickDropdown(){
        clickElement(categoryDropdown);
    }

    public void selectCategory(String value){
        selectFromDropdownByValue(categoryDropdown, value);
    }    
}