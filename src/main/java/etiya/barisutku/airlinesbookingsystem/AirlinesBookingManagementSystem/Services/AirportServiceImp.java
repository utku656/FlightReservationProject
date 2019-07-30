package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories.AirportRepository;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AirportServiceImp implements AirportService{

    @Autowired
    AirportRepository airportRepository;

    @Override
    public List<Airport> getAllAirport() {

        return airportRepository.findAll();
    }

    @Override
    public Airport getAirportById(long id) {

        return airportRepository.findById(id).get();
    }

    @Override
    public void saveAirport(Airport airport) {

        airportRepository.save(airport);

    }
    @Override
    public void updateAirport(Long id, Airport airport) {

        airportRepository.save(airport);

    }

    @Override
    public void deleteAirport(long id) {

        airportRepository.deleteById(id);

    }
}
