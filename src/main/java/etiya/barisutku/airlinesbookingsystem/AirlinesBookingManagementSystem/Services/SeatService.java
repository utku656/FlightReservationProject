package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Seat;

import java.util.List;

public interface SeatService  {

    public List<Seat> getAllSeat();

    public Seat getSeatById(long id);

    public void saveSeat(Seat seat);

    public void updateSeat(Long id, Seat seat);

    public void deleteSeat(long id);
}
