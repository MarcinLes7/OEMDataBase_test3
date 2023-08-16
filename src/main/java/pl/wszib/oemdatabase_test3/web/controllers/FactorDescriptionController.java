package pl.wszib.oemdatabase_test3.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FactorDescriptionController {
    @GetMapping("factorDescription")
    public String factorDescriptionPage () {
        return "factorsDescriptionPage";
    }
}
