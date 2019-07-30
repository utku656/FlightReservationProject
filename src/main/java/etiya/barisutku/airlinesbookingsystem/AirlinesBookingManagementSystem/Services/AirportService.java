package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Airport;

import java.util.List;

public interface AirportService {

    public List<Airport> getAllAirport();

    public Airport getAirportById(long id);

    public void saveAirport(Airport airport);

    public void updateAirport(Long id, Airport airport);

    public void deleteAirport(long id);
}
