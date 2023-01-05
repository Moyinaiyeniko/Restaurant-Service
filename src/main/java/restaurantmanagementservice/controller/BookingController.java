package restaurantmanagementservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @GetMapping("/")
    public String health() {
        return "Hello & Welcome to CloudKatha !!!";
    }
}
