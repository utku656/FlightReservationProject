package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services.PassengerService;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

   // private static final Logger logger = LoggerFactory.getLogger(PassengerController.class);


    @GetMapping(value = "/passengerlist")
    public ResponseEntity<List<Passenger>> passengerList(Model model) {

        model.addAttribute("passengers", passengerService.getAllPassenger());

        return ResponseEntity.ok(passengerService.getAllPassenger());
    }
    @GetMapping(value = "/{passengerid}")
    public @ResponseBody Passenger getPassengerById(@PathVariable("passengerid") Long passengerId) {
        return passengerService.getPassengerById(passengerId);
    }

    @PostMapping
    public void savePassengers(@Valid @RequestBody Passenger passenger){

        passengerService.savePassenger(passenger);
    }
    @DeleteMapping("/{id}")
    public void deletePassengers(@PathVariable(value = "id", required = true) Long id){

        passengerService.deletePassenger(id);
    }

    @PutMapping ("/{id}")
    public void updatePassengers(@PathVariable(value = "id", required = true)Long id, @Valid @RequestBody Passenger passenger){
        passengerService.updatePassenger(id,passenger);
    }


}