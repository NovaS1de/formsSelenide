package org.example;
import com.codeborne.selenide.*;
import java.io.File;
import static com.codeborne.selenide.DownloadOptions.using;
import static com.codeborne.selenide.FileDownloadMode.FOLDER;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.files.FileFilters.withName;
public class UploadAndDownloadPage extends MainPage{
    private final SelenideElement downloadButton = $("#downloadButton");
    private final SelenideElement uploadButton = $("#uploadFile");
    private final SelenideElement filePathP = $("#uploadedFilePath");
    public SelenideElement getUploadButton() {
        return uploadButton;
    }
    public SelenideElement getFilePathP() {
        return filePathP;
    }
    public UploadAndDownloadPage open(){
        Selenide.open("https://demoqa.com/upload-download");
        return this;
    }
    public UploadAndDownloadPage downloadAFile(){
        File file = downloadButton.download(using(FOLDER));
        return this;
    }
    public UploadAndDownloadPage downloadAFile(String pathToFile){
        Configuration.downloadsFolder = pathToFile;
        File file = downloadButton.download(using(FOLDER));
        return this;
    }
    public UploadAndDownloadPage downloadAFile(String pathToFile, String expectedFileName){
        Configuration.downloadsFolder = pathToFile;
        Configuration.fileDownload = FOLDER;
        File file = downloadButton.download(withName(expectedFileName));
        return this;
    }
    public UploadAndDownloadPage uploadAFile(){
        uploadButton.uploadFile(new File("src\\main\\resources\\kek.txt"));
        return this;
    }
    public UploadAndDownloadPage uploadAFile(String filePath){
        uploadButton.uploadFile(new File(filePath));
        return this;
    }
}