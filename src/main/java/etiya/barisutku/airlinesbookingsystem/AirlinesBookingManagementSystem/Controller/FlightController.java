package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services.FlightService;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Flight;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/flight")

public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping(value = "/flightlist")
    public ResponseEntity<List<Flight>> flightList(Model model) {

        model.addAttribute("flights", flightService.getAllFlight());

        return ResponseEntity.ok(flightService.getAllFlight());
    }
    @GetMapping("/{flightid}")
    public @ResponseBody
    Flight getFlightById(@PathVariable("flightid") Long flightId) {

        return flightService.getFlightById(flightId);

    }
    @PostMapping
    public void saveFlights(@Valid @RequestBody Flight flight){

        flightService.saveFlight(flight);
    }
    @DeleteMapping("/{id}")
    public void deleteFlights(@PathVariable(value = "id", required = true) Long id){

        flightService.deleteFlight(id);
    }

    @PutMapping ("/{id}")
    public void updateFlights(@PathVariable(value = "id", required = true)Long id, @Valid @RequestBody Flight flight){

        flightService.updateFlight(id,flight);
    }
}