package aramtestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrTest {


    @DataProvider(name = "Дата провайдер")
    public Object[][] dataProveder(){
        return new Object[][] {
                {"Игорь", 35},
                {"Петя", 44},
        };
    }
    @Test(dataProvider = "Дата провайдер")
    public void paramsTest1(String name, int age) {
        String print = String.format("Имя: %s | Вззраст: %d", name, age);
        System.out.println(print);
    }
}
