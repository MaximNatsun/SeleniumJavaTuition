import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"ru.aplana.autotest"},
        plugin = {"ru.aplana.autotest.util.AllureReporter"})

public class CucumberRunner {
}
