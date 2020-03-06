package aramtestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrTest {


    @DataProvider(name = "Провайдер")
    public Object[][] dataProveder(){
        return new Object[][] {
                {"Ivan", 35},
                {"Vova", 44},
        };
    }
    @Test(dataProvider = "Провайдер")
    public void paramsTest1(String name, int age) {
        String print = String.format("Имя: %s | Вззраст: %d", name, age);
        System.out.println(print);
    }
}
