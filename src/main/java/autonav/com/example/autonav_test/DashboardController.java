package autonav.com.example.autonav_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    
    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }
    
    @GetMapping("/dashboard")
    public String dashboardPath() {
        return "dashboard";
    }
}
