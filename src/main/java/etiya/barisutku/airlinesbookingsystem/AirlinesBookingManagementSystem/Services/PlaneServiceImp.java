package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Repositories.PlaneRepository;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlaneServiceImp implements PlaneService {

    @Autowired
    PlaneRepository planeRepository;

    @Override
    public List<Plane> getAllPlane() {

        return planeRepository.findAll();
    }

    @Override
    public Plane getPlaneById(long id) {

        return planeRepository.findById(id).get();
    }

    @Override
    public void savePlane(Plane plane) {

        planeRepository.save(plane);

    }
    @Override
    public void updatePlane(Long id, Plane plane) {

        planeRepository.save(plane);

    }

    @Override
    public void deletePlane(long id) {

        planeRepository.deleteById(id);

    }
}
