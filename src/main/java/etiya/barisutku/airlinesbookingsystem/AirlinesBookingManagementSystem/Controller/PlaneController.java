package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;

import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Services.PlaneService;
import etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/plane")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @GetMapping(value = "/planelist")
    public ResponseEntity<List<Plane>> planeList(Model model) {

        model.addAttribute("planes", planeService.getAllPlane());

        return ResponseEntity.ok(planeService.getAllPlane());
    }
    @GetMapping("/{planeid}")
    public @ResponseBody
    Plane getPlaneById(@PathVariable("planeid") Long planeId) {

        return planeService.getPlaneById(planeId);

    }

    @PostMapping
    public void savePlanes(@Valid @RequestBody Plane plane){

        planeService.savePlane(plane);
    }
    @DeleteMapping("/{id}")
    public void deletePlanes(@PathVariable(value = "id", required = true) Long id) {

        planeService.deletePlane(id);
    }

    @PutMapping ("/{id}")
    public void updatePlanes(@PathVariable(value = "id", required = true)Long id, @Valid @RequestBody Plane plane){

        planeService.updatePlane(id,plane);
    }
}
