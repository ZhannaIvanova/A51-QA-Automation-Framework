import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {
        String expectedSongAddedMessege = "Added 1 song into \ "Test Pro Playlist.\" ";
        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("te$tStudent");
        clickSubmit();
        Thread Tread;
        Tread.sleep(2000);
        searchSong("Ketsa");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddToBtn();
        choosePlayList();
        Assert.assertEquals(getAddToPlaylistSuccessMsg(), expectedSongAddedMessege);
    }

    private Object getAddToPlaylistSuccessMsg() {
    }

    private void choosePlayList() {
    }

    private void clickViewAllBtn() {
    }

    private void clickAddToBtn() {
    }

    private void selectFirstSongResult() {
    }


    public void searchSong(String name) throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input[type='seach"));
        searchField.sendKeys(name);
        Thread Tread;
        Tread.sleep(2000);

        public void clickViewAllBtn () throws InterruptedException {
            WebElement viewAll = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
            viewAll.click();
            Tread.sleep(2000);
        }
        public void selectFirstSongResult () throws InterruptedException {
            WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
            firstSong.click();
            Tread.sleep(2000);
        }
        public void clickAddToBtn () throws InterruptedException {
            WebElement addToButton = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
            addToButton.click();
            Thread.sleep(2000);
        }
        public void choosePlaylist() throws InterruptedException {
            WebElement playlist  = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Test Pro Playlist')]"));
            playlist.click();
            Tread.sleep(2000);
        }
        public String getAddToPlaylistSuccessMsg();
        WebElement notification = driver.findElement((By.cssSelector("div.success.show")));
        return notification.getText();
    }
}