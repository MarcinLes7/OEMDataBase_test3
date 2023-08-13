package pl.wszib.oemdatabase_test3.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.wszib.oemdatabase_test3.services.FactorService;
import pl.wszib.oemdatabase_test3.web.models.FactorModel;

import java.util.List;

@Controller
public class RegisterController {
    private final FactorService factorService;

    public RegisterController(FactorService factorService) {
        this.factorService = factorService;
    }

    @GetMapping("register")
    public String registerPage(Model model) {
        List<FactorModel> factors = factorService.findAll();
        model.addAttribute("factors", factors);
        return "registerPage";

    }
}
