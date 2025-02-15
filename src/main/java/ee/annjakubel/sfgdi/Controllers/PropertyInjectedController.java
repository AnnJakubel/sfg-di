package ee.annjakubel.sfgdi.Controllers;

import ee.annjakubel.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //least preferred controller strategy
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
