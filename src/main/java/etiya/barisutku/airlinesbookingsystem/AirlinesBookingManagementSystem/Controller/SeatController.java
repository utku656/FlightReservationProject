package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;


import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services.SeatService;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/seat")

public class SeatController {

    @Autowired
    SeatService seatService;

    @GetMapping(value = "/seatlist")
    public ResponseEntity<List<Seat>> seatList(Model model) {

        model.addAttribute("seats", seatService.getAllSeat());

        return ResponseEntity.ok(seatService.getAllSeat());
    }
    @GetMapping("/{seatid}")
    public @ResponseBody
    Seat getSeatById(@PathVariable("seatid") Long seatId) {

        return seatService.getSeatById(seatId);

    }

    @PostMapping
    public void saveSeats(@Valid @RequestBody Seat seat){
        seatService.saveSeat(seat);
    }
    @DeleteMapping("/{id}")
    public void deleteSeats(@PathVariable(value = "id", required = true) Long id){
        seatService.deleteSeat(id);
    }

    @PutMapping ("/{id}")
    public void updateSeats(@PathVariable(value = "id", required = true)Long id, @Valid @RequestBody Seat seat){
        seatService.updateSeat(id,seat);
    }
}
