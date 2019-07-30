package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories.TicketRepository;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TicketServiceImp implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTicket() {

        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(long id) {

        return ticketRepository.findById(id).get();
    }

    @Override
    public void saveTicket(Ticket ticket) {

        ticketRepository.save(ticket);

    }
    @Override
    public void updateTicket(Long id, Ticket ticket) {

        ticketRepository.save(ticket);

    }

    @Override
    public void deleteTicket(long id) {

        ticketRepository.deleteById(id);

    }
}
