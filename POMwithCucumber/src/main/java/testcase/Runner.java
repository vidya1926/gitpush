package testcase;

import org.testng.annotations.DataProvider;

import Base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/features/F01_Login.feature" ,glue="pages",monochrome=true)
public class Runner extends ProjectSpecificMethod{
@Override
//to provide data from the feature file for parallel Execution
@DataProvider(parallel=true)
public Object[][] scenarios() {
	// TODO Auto-generated method stub
	return super.scenarios();
}
}
