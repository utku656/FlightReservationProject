package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Flight;

import java.util.List;

public interface FlightService {

    public List<Flight> getAllFlight();

    public Flight getFlightById(long id);

    public void saveFlight(Flight flight);

    public void updateFlight(Long id, Flight flight);

    public void deleteFlight(long id);
}
