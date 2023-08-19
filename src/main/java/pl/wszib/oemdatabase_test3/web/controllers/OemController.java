package pl.wszib.oemdatabase_test3.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.wszib.oemdatabase_test3.services.FactorService;
import pl.wszib.oemdatabase_test3.web.models.FactorModel;

@Controller
@RequestMapping("oem-panel")
public class OemController {

    private final FactorService factorService;

    public OemController(FactorService factorService) {
        this.factorService = factorService;
    }

    @GetMapping
    public String oemPanelPage(Model model) {
        final var factors = factorService.findAll();
        model.addAttribute("factors", factors);
        return "oemPanelPage";
    }

    @PostMapping("factor/delete{factor-id}")
    public String deleteFactor(@PathVariable("factor-id") Long factorId) {
        factorService.deleteById(factorId);
        return "redirect:/oem-panel";
    }

    @GetMapping("factor/create")
    public String createFactorForm(Model model) {
        model.addAttribute("factor", new FactorModel());
        return "factorPage";
    }

    @PostMapping("factor/create")
    public String createFactor(@ModelAttribute("factor") FactorModel factorModel) {
        factorService.createFactor(factorModel);
        return "redirect:/oem-panel";
    }

    @GetMapping("factor/edit/{factor-id}")
    public String editFactorForm(@PathVariable("factor-id") Long factorId, Model model) {
        final var factor = factorService.getById(factorId);
        model.addAttribute("factor", factor);
        return "factorPage";
    }

    @PostMapping("factor/edit/{factor-id}")
    public String editFactor(@PathVariable("factor-id") Long factorId,
                             @ModelAttribute("factor") FactorModel factorModel) {
        factorService.editFactor(factorId, factorModel);
        return "redirect:/oem-panel";
    }
}


























