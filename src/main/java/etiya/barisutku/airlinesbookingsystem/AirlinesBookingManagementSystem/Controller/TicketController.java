package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;


import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services.TicketService;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ticket")

public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping(value = "/ticketlist")
    public ResponseEntity<List<Ticket>> ticketList(Model model) {

        model.addAttribute("tickets", ticketService.getAllTicket());

        return ResponseEntity.ok(ticketService.getAllTicket());
    }
    @GetMapping("/{ticketid}")
    public @ResponseBody
    Ticket getTicketById(@PathVariable("ticketid") Long ticketId) {

        return ticketService.getTicketById(ticketId);

    }

    @PostMapping
    public void saveTickets(@Valid @RequestBody Ticket ticket){

        ticketService.saveTicket(ticket);
    }
    @DeleteMapping("/{id}")
    public void deleteTickets(@PathVariable(value = "id", required = true) Long id){

        ticketService.deleteTicket(id);
    }

    @PutMapping ("/{id}")
    public void updateTickets(@PathVariable(value = "id", required = true)Long id, @Valid @RequestBody Ticket ticket){

        ticketService.updateTicket(id,ticket);
    }
}
