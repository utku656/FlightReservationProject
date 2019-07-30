package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Ticket;

import java.util.List;

public interface TicketService {

    public List<Ticket> getAllTicket();

    public Ticket getTicketById(long id);

    public void saveTicket(Ticket ticket);

    public void updateTicket(Long id, Ticket ticket);

    public void deleteTicket(long id);
}
