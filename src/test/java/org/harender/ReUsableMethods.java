package org.harender;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ReUsableMethods {

    public static void gotToPage(String pageName){
        $(By.xpath("//a[text()='"+pageName+"']")).click();
    }

}
