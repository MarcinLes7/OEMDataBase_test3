package pl.wszib.oemdatabase_test3.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.oemdatabase_test3.services.FactorService;
import pl.wszib.oemdatabase_test3.services.MeasurementService;
import pl.wszib.oemdatabase_test3.web.models.FactorModel;
import pl.wszib.oemdatabase_test3.web.models.WorkplaceModel;

@Controller
public class InputController {

    private final FactorService factorService;
    private final MeasurementService measurementService;

    public InputController(FactorService factorService, MeasurementService measurementService) {
        this.factorService = factorService;
        this.measurementService = measurementService;
    }

    @GetMapping("input/{factor-id}")
    public String inputForm(@PathVariable("factor-id") Long factorId, Model model) {
        FactorModel factor = factorService.getById(factorId);

        model.addAttribute("workplaceMeasurement", new WorkplaceModel());
        model.addAttribute("factor", factor);
        return "inputPage";

    }

    @PostMapping("input/{factor-id}")
    public String input(@PathVariable("factor-id") Long factorId,
                        @ModelAttribute("workplaceMeasurement") WorkplaceModel workplaceModel) {
        measurementService.saveMeasurement(factorId, workplaceModel);

        return "measurementConfirmationPage";
    }


}
