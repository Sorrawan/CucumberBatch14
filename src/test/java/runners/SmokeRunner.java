package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        glue = "steps",
     //When you set "dryRun=true" => it stops actual execution
     //it will quickly scan all the gherkin steps whether they are implemented or not
       // dryRun = true,

     //dryRun = false  : it starts execution again
        dryRun = false,
        tags = " @tc1103",

    //to remove irrelavant information from console, you need to set monochrome to true
        monochrome = true,
    //print the step in the console to increase readability
     //To generate the reports we need plugin of runner class
        //cucumber.html => name of the report
        //json => one kind of report
    plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
            //this failed.txt file holds all the scenarios which are failed during execution
            "rerun:target/failed.txt" }
)
public class SmokeRunner {
}