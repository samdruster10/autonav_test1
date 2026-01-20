package autonav.com.example.autonav_test.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MongoDBConnectionTest implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MongoDBConnectionTest.class);
    private final MongoTemplate mongoTemplate;

    public MongoDBConnectionTest(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            mongoTemplate.getDb().getName();
            logger.info("MongoDB connection successful!");
        } catch (Exception e) {
            logger.error("MongoDB connection failed: {}", e.getMessage());
        }
    }
}
