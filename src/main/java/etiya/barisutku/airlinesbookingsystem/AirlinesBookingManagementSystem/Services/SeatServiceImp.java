package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories.SeatRepository;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SeatServiceImp implements SeatService {

    @Autowired
    SeatRepository seatRepository;

    @Override
    public List<Seat> getAllSeat() {

        return seatRepository.findAll();
    }

    @Override
    public Seat getSeatById(long id) {

        return seatRepository.findById(id).get();
    }

    @Override
    public void saveSeat(Seat seat) {

        seatRepository.save(seat);

    }
    @Override
    public void updateSeat(Long id, Seat seat) {

        seatRepository.save(seat);

    }

    @Override
    public void deleteSeat(long id) {

        seatRepository.deleteById(id);

    }
}
