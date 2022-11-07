package shopping.modelcopy.common;


import shopping.modelcopy.SupportingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportingApplication.class })
public class CucumberSpingConfiguration {
    
}
