package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
}
