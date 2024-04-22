package org.harender;


import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{


    @BeforeSuite
    public void OpenWebPage (){
        open("https://ultimateqa.com/automation/");
    }
    
    @Test
    public void actOnBigPageWithManyElements() throws InterruptedException {
        ReUsableMethods.gotToPage("Big page with many elements");

    }
}
