# AutoNav Fleet Management System

A Spring Boot fleet management application for vehicle tracking and operations.

## Features

✅ Dashboard with real-time statistics  
✅ Vehicle management (CRUD)  
✅ REST API endpoints  
✅ Responsive UI  
✅ Authentication & security  
✅ JPA/Hibernate persistence  

## Tech Stack

Spring Boot 2.7.18 | Java 11 | H2/PostgreSQL | Thymeleaf | Maven

## Quick Start

### Prerequisites
- Java 11+
- Maven 3.6+

### Setup & Run

```bash
git clone https://github.com/samdruster10/autonav_test1.git
cd autonav_test1
./mvnw clean package -DskipTests
java -jar target/autonav_test-0.0.1-SNAPSHOT.jar
```

Access: **http://localhost:8080/dashboard**

## Docker

```bash
docker-compose -f docker/docker-compose.yml up -d
```

## Documentation

- [Architecture](docs/ARCHITECTURE.md)
- [API Reference](docs/API.md)

## License

MIT License
