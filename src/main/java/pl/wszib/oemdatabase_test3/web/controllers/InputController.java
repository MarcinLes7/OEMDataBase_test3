package pl.wszib.oemdatabase_test3.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.wszib.oemdatabase_test3.services.FactorService;
import pl.wszib.oemdatabase_test3.web.models.FactorModel;

@Controller
public class InputController {

    private final FactorService factorService;

    public InputController(FactorService factorService) {
        this.factorService = factorService;
    }

    @GetMapping("input/{factor-id}")
    public String inputForm(@PathVariable("factor-id") Long factorId, Model model) {
        FactorModel factor = factorService.getById(factorId);

        model.addAttribute("factor", factor);
        return "inputPage";

    }
}
