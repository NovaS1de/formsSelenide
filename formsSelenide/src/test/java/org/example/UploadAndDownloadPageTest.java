package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static constants.Constants.PATH_TO_RESOURCES;
public class UploadAndDownloadPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void kek(){
        uploadAndDownloadPage.open().
                downloadAFile(".src\\main\\resources", "sampleFile.jpeg");
    }
    @Test
    public void keke(){
        String fileName = "123.txt";
        System.out.println(uploadAndDownloadPage.open().
                uploadAFile(PATH_TO_RESOURCES+fileName).
                getUploadButton().
                getOwnText());
        Assert.assertTrue(uploadAndDownloadPage.getFilePathP().
                getOwnText().
                matches("^.*"+fileName+"$"));
    }
}