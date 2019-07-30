package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Plane;

import java.util.List;

public interface PlaneService {
    public List<Plane> getAllPlane();

    public Plane getPlaneById(long id);

    public void savePlane(Plane plane);

    public void updatePlane(Long id, Plane plane);

    public void deletePlane(long id);
}
