package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {


    @RequestMapping("index.html")
    public String homePage() {

        return"index";
    }
}