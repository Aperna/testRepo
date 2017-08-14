import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    /**@RunWith(Cucumber.class)
    @CucumberOptions(features  = ".",dryRun = false,tags="@sc1",format={"json:target/cucumber.json","html:target/cucumber"})**/

    @RunWith(Cucumber.class)
    @CucumberOptions(features=".")
    public class CucumberRunTest {

}







/**@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/feature",
        glue = "com.sara"
)**/