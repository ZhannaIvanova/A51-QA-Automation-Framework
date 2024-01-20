import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework24 extends BaseTest{
    @Test
    public void addSongtoPlaylist(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        String expectedSongAddedMessage = "Added 1 song into\"Love.\"";
        loginPage .provideEmailToLogin("zhanna.ivanova@testpro.io")
                .providePasswordToLogin("12345678")
                .clickSubmitBtnToLogin();
        homePage .searchField()
                .provideViewAll()
                .choiceSong()
                .addToList()
                .choiceList();
        Assert.assertEquals(homePage.notificationMessage(), expectedSongAddedMessage);
    }
}