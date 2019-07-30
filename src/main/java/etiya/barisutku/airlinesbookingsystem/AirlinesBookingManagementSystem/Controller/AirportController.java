package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services.AirportService;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/airport")

public class AirportController {

    @Autowired
    AirportService airportService;

    @GetMapping(value = "/airportlist")
    public ResponseEntity<List<Airport>> airportList(Model model) {

        model.addAttribute("airports", airportService.getAllAirport());

        return ResponseEntity.ok(airportService.getAllAirport());
    }
    @GetMapping("/{airportid}")
    public @ResponseBody Airport getAirportById(@PathVariable("airportid") Long airportId) {

        return airportService.getAirportById(airportId);

    }

    @PostMapping
    public void saveAirports(@Valid @RequestBody Airport airport){
        airportService.saveAirport(airport);
    }

    @DeleteMapping("/{id}")
    public void deleteAirports(@PathVariable(value = "id", required = true) Long id){
        airportService.deleteAirport(id);
    }

    @PutMapping ("/{id}")
    public void updateAirports(@PathVariable(value = "id", required = true)Long id, @Valid @RequestBody Airport airport){
        airportService.updateAirport(id,airport);
    }
}
