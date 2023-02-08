import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ScheduleTest extends BaseTest{

    @Test
    void scheduleTest(){

        ScheduleTask scheduleTask = new ScheduleTask(driver);

        scheduleTask.clickSearch();
        scheduleTask.inputSearch("Sony");
        scheduleTask.clickFind();
        scheduleTask.getTagNameOfFirstItem();
        scheduleTask.getTagNameOfSecondItem();
        scheduleTask.isFirstNameTagEqualToInput();
        scheduleTask.isSecondNameTagEqualToInput();
        scheduleTask.countItems();
        scheduleTask.setToList();
        scheduleTask.isFirstNameTagEqualToInput();
        scheduleTask.isSecondNameTagEqualToInput();
        scheduleTask.countItems();
        scheduleTask.clickSearchCriteria();
        scheduleTask.sendX("x");
        scheduleTask.clickOtherSearch();
        scheduleTask.isMessageDisplayed();
    }
}
