package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;


import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories.PassengerRepository;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PassengerServiceImp implements PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public List<Passenger> getAllPassenger() {

        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(long id) {

        return passengerRepository.findById(id).get();
    }

    @Override
    public void savePassenger(Passenger passenger) {

        passengerRepository.save(passenger);

    }
    @Override
    public void updatePassenger(Long id, Passenger passenger) {

        passengerRepository.save(passenger);

    }

    @Override
    public void deletePassenger(long id) {

        passengerRepository.deleteById(id);

    }
}
