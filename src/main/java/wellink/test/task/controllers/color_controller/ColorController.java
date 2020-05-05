package wellink.test.task.controllers.color_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wellink.test.task.entities.Color;
import wellink.test.task.services.ColorService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ColorController {

    @Autowired
    private ColorService colorService;

    @GetMapping
    public Color get() {

        return colorService.save(new Color("Red", "#33 33 33", "12 23 34"));
    }
}
