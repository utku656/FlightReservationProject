package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}
