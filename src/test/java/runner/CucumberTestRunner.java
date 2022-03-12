package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.springtest.CommonFunctions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features",
		glue = {"stepdefinitions","hooks"},
		tags = "@functionaltest",
		plugin = {
				"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:src/test/resources/Failedfeature/rerun.txt",
				"reports.Reporting"
		})
        
public class CucumberTestRunner extends CommonFunctions{
	private TestNGCucumberRunner testNGCucumberRunner;
	FeatureWrapper cucumberFeatures;
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
	
	@Test(dataProvider = "features")
    public void feature(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
    	testNGCucumberRunner.runScenario(pickle.getPickle());
    }
 
    @DataProvider
    public Object[][] features() {
    	return testNGCucumberRunner.provideScenarios();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
    	testNGCucumberRunner.finish();
    }
    
}
