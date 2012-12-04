import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 * @author Klaus Bayrhammer
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = "src/test/resources/test.feature")
public class RunTests
{
}
