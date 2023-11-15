package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

     static By firstPlaylist = By.cssSelector(".playlist:nth-child(3)");
     static By playlistNameField  = By.cssSelector("[name='name']");
    By renamePlaylistSuccessMsg = By.cssSelector("div.success.show");


    public static void doubleClickPlaylist() {
        doubleClick(firstPlaylist);
    }
    public static void enterNewPlaylistName(String playlistName) {
        findElement(playlistNameField).sendKeys(Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE));
        findElement(playlistNameField).sendKeys(playlistName);
        findElement(playlistNameField).sendKeys(Keys.ENTER);
    }
    public String getRenamePlaylistSuccessMsg() {
        return findElement(renamePlaylistSuccessMsg).getText();
    }
}
