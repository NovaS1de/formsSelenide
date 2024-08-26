package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ActionsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 70000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void test1(){
        System.out.println(actionsPage.open()
                .hoverOver()
                .clickLink1()
                .getLink1Text());
    }
    @Test
    public void test2(){
        actionsPage.open()
                .hoverOver()
                .clickLink1();
        Assert.assertEquals(actionsPage.getLink1Text(),
                "Well done you clicked on the link!");
    }
    @Test
    public void test3(){
        System.out.println(actionsPage.open()
                .backgroundColor());
    }
    @Test
    public void test4(){
        
    }
}