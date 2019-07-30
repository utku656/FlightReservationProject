package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {
}
