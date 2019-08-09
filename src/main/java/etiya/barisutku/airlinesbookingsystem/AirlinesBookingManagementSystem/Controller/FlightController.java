package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services.FlightService;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
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

    @GetMapping("/{flightDate}")
    public @ResponseBody
    Flight getFlightByDate(@PathVariable("flightDate") LocalDate flightDate,Long id , Long id2) {

        return flightService.getFlightByDateandDeparture(flightDate,id ,id2);

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