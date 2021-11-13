package runner;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\aman7\\eclipse-workspace\\x\\src\\test\\java\\features"
		
		,glue= {"stepDefinition"}
		)