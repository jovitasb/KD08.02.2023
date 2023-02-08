import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScheduleTask extends AbstractObjectPage {
    @FindBy(name = "search")
    private WebElement clickSearch;

    @FindBy(name = "search")
    private WebElement inputSearch;

    @FindBy (xpath = "//button[@class='btn btn-default btn-lg']")
    private WebElement clickFind;

    @FindBy(xpath = "//a[normalize-space()='Samsung SyncMaster 941BW']")
    private WebElement getTagNameOfFirstItem;

    @FindBy(xpath = "//a[normalize-space()='Samsung Galaxy Tab 10.1']")
    private WebElement getTagNameOfSecondItem;

    @FindBy(xpath = "//i[@class='fa fa-th-list']")
    private WebElement setToList;

    @FindBy(id ="content")
    private WebElement countItems;

    @FindBy(xpath = "//input[@id='input-search']")
    private WebElement clickSearchCriteria;

    @FindBy(xpath = "//input[@id='input-search']")
    private WebElement sendX;

    @FindBy(id = "button-search")
    private WebElement clickOtherSearch;

    @FindBy(xpath = "//p[contains(text(),'There is no product that matches the search criter')]")
    private WebElement messageIsDisplayed;

    public void clickSearch(){
        clickSearch.click();
    }

    public void inputSearch(String input){
        inputSearch.sendKeys(input);
    }

    public void clickFind(){
        clickFind.click();
    }

    public void getTagNameOfFirstItem(){
       getTagNameOfFirstItem.getTagName();
    }

    public void getTagNameOfSecondItem(){
        getTagNameOfSecondItem.getTagName();
    }

    public boolean isFirstNameTagEqualToInput(){
        return getTagNameOfFirstItem.equals(inputSearch);
    }

    public boolean isSecondNameTagEqualToInput(){
        return getTagNameOfSecondItem.equals(inputSearch);
    }

    public void setToList(){
        setToList.click();
    }

    public void countItems(){

    int countItems = driver.findElements(By.id("content")).size();
    }

    public void clickSearchCriteria(){
        clickSearchCriteria.click();
    }

    public void sendX(String input){
        sendX.sendKeys(input);
    }

    public void clickOtherSearch(){
        clickOtherSearch.click();
    }

    public boolean isMessageDisplayed(){
        return  messageIsDisplayed.isDisplayed();
    }

    public ScheduleTask(WebDriver driver) {
        super(driver);
    }
}
