# AutoNav Fleet Management System

A Spring Boot-based fleet management application for managing vehicle operations, maintenance tracking, and fleet analytics.

## Features

✅ **Dashboard** - Comprehensive fleet overview with real-time statistics  
✅ **Vehicle Management** - CRUD operations for vehicles  
✅ **Status Tracking** - Track vehicle status (Active, Inactive, Maintenance)  
✅ **REST API** - Full REST API endpoints for programmatic access  
✅ **Responsive UI** - Works on desktop, tablet, and mobile devices  
✅ **Security** - Session-based authentication and authorization  
✅ **Database Persistence** - JPA/Hibernate with H2 (Development) and PostgreSQL ready  

## Technology Stack

- **Framework**: Spring Boot 2.7.18
- **Java**: Java 11
- **Database**: H2 (Development), PostgreSQL (Production)
- **ORM**: JPA/Hibernate
- **Frontend**: Thymeleaf + HTML5 + CSS3
- **Build Tool**: Maven
- **Version Control**: Git

## Project Structure

```
autonav_test1/
├── src/
│   ├── main/java/autonav/com/example/autonav_test/
│   │   ├── api/                 # API responses & DTOs
│   │   ├── config/              # Configuration classes
│   │   ├── controller/          # REST & View controllers
│   │   ├── entity/              # JPA entities
│   │   ├── exception/           # Exception handling
│   │   ├── filter/              # Servlet filters
│   │   ├── mapper/              # DTO mappers
│   │   ├── repository/          # Data access layer
│   │   ├── security/            # Security utilities
│   │   ├── service/             # Business logic
│   │   └── util/                # Utility classes
│   ├── resources/
│   │   ├── templates/           # Thymeleaf templates
│   │   ├── static/              # CSS, JS, images
│   │   ├── db/migration/        # Database migrations
│   │   └── application.properties
│   └── test/
├── docker/                       # Docker configuration
├── scripts/                      # Setup & deployment scripts
├── docs/                         # Documentation
└── pom.xml                       # Maven configuration

```

## Quick Start

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- Git

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/samdruster10/autonav_test1.git
cd autonav_test1
```

2. **Setup the project**
```bash
chmod +x scripts/setup.sh
./scripts/setup.sh
```

3. **Build the project**
```bash
./mvnw clean package -DskipTests
```

4. **Run the application**
```bash
java -jar target/autonav_test-0.0.1-SNAPSHOT.jar
```

5. **Access the application**
- Dashboard: http://localhost:8080/dashboard
- API: http://localhost:8080/api/vehicles

### Login Credentials (Development)
```
Admin User:
  Username: admin
  Password: admin123

Regular User:
  Username: user
  Password: user123
```

## Docker Deployment

```bash
# Build and run with Docker Compose
docker-compose -f docker/docker-compose.yml up -d
```

## API Endpoints

### Vehicle Management
- `GET /api/vehicles` - Get all vehicles
- `GET /api/vehicles/{id}` - Get vehicle by ID
- `GET /api/vehicles/status/{status}` - Filter by status
- `GET /api/vehicles/search?model={model}` - Search vehicles
- `GET /api/vehicles/stats` - Get statistics
- `POST /api/vehicles` - Create vehicle
- `PUT /api/vehicles/{id}` - Update vehicle
- `DELETE /api/vehicles/{id}` - Delete vehicle

### Authentication
- `POST /login` - Login
- `POST /logout` - Logout
- `GET /dashboard` - Dashboard (Protected)

## Configuration

### Application Properties
Edit `src/main/resources/application.properties` for configuration:

```properties
# Server
server.port=8080
server.servlet.context-path=/

# Database
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create-drop

# Session
server.servlet.session.timeout=30m

# Logging
logging.level.root=INFO
logging.level.autonav.com.example.autonav_test=DEBUG
```

## Development

### Running Tests
```bash
./mvnw test
```

### Running with Hot Reload
```bash
./mvnw spring-boot:run
```

### Building for Production
```bash
./mvnw clean package -DskipTests
```

## Documentation

- [Architecture](docs/ARCHITECTURE.md) - System architecture overview
- [API Documentation](docs/API.md) - REST API endpoints and examples

## Future Enhancements

- 🔐 JWT-based authentication
- 📊 Advanced analytics and reporting
- 🔄 Real-time vehicle tracking
- 📱 Mobile app integration
- 🛠️ Automated maintenance scheduling
- 📦 Bulk operations and imports
- 🔗 Third-party integrations

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For support, email support@autonav.dev or open an issue on GitHub.

## Roadmap

- [ ] User management system
- [ ] Role-based access control (RBAC)
- [ ] Maintenance tracking module
- [ ] Mobile app
- [ ] Payment integration
- [ ] Multi-tenant support
- [ ] Microservices architecture

---

**Happy Fleet Managing! 🚗**
