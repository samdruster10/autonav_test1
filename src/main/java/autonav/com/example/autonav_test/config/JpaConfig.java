package autonav.com.example.autonav_test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "autonav.com.example.autonav_test.repository")
public class JpaConfig {
    // JPA configuration is handled by Spring Boot auto-configuration
    // This class is here for future custom JPA configurations if needed
}
