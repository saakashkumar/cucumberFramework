package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before("@Regression")
    public void netBankingSetup(){
        System.out.println("net banking setup");
    }
    @After
    public void usersingup(){

    }
    @Before("@SmokeTest")
    public void mortageSetup(){
        System.out.println("Mortage setup");
    }
}
