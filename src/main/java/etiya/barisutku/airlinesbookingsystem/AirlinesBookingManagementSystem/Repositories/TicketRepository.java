package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Passenger;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    Passenger findByPassengerId (Long id);
}

