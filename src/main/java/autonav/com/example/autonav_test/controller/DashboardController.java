package autonav.com.example.autonav_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;

@Controller
public class DashboardController {
    
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    private static final String USER_USERNAME = "user";
    private static final String USER_PASSWORD = "user123";
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, 
                              Model model, HttpSession session) {
        System.out.println("Login attempt - Username: " + username + ", Password: " + password);
        
        if ((username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) ||
            (username.equals(USER_USERNAME) && password.equals(USER_PASSWORD))) {
            System.out.println("Login successful for user: " + username);
            session.setAttribute("user", username);
            return "redirect:/dashboard";
        } else {
            System.out.println("Login failed for user: " + username);
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
    
    @GetMapping("/")
    public String dashboard(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        return "dashboard";
    }
    
    @GetMapping("/dashboard")
    public String dashboardPath(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        return "dashboard";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
