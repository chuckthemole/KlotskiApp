package com.cpt.klotski;

import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@FxmlView("main-scene.fxml")
@RestController
public class KlotskiController {
    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }
}
