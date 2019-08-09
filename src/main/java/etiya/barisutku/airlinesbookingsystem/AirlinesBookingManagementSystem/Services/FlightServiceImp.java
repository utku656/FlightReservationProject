package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;


import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories.FlightRepository;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Airport;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class FlightServiceImp implements FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Override
    public List<Flight> getAllFlight() {

        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(long id) {

        return flightRepository.findById(id).get();
    }

    @Override
    public void saveFlight(Flight flight) {

        flightRepository.save(flight);

    }
    @Override
    public void updateFlight(Long id, Flight flight) {

        flightRepository.save(flight);

    }

    @Override
    public void deleteFlight(long id) {

        flightRepository.deleteById(id);

    }

    @Override
    public Flight getFlightByDateandDeparture(LocalDate flightDate,Long id , Long id2) {
        return flightRepository.getByFlightDateAndFlightDepartureIDAndFlightArrivalID(flightDate,id,id2);
    }


}
