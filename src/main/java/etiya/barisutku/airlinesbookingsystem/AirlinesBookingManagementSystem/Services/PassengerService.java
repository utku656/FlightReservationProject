package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;


import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Passenger;

import java.util.List;

public interface PassengerService {

    public List<Passenger> getAllPassenger();

    public Passenger getPassengerById(long id);

    public void savePassenger(Passenger passenger);

    public void updatePassenger(Long id, Passenger passenger);

    public void deletePassenger(long id);
}
