# AutoNav Fleet Management - API Documentation

## Base URL
`http://localhost:8080/api`

## Authentication
Current implementation uses session-based authentication. Login via `/login` to obtain session.

## Endpoints

### Vehicle Management

#### Get All Vehicles
```
GET /api/vehicles
Response: ApiResponse<List<VehicleDTO>>
Status: 200 OK
```

#### Get Vehicle by ID
```
GET /api/vehicles/{id}
Response: ApiResponse<VehicleDTO>
Status: 200 OK
Status: 404 NOT FOUND
```

#### Get Vehicles by Status
```
GET /api/vehicles/status/{status}
Path Parameters:
  - status: ACTIVE, INACTIVE, MAINTENANCE
Response: ApiResponse<List<VehicleDTO>>
Status: 200 OK
```

#### Search Vehicles
```
GET /api/vehicles/search?model={model}
Query Parameters:
  - model: Vehicle model search term
Response: ApiResponse<List<VehicleDTO>>
Status: 200 OK
```

#### Get Vehicle Statistics
```
GET /api/vehicles/stats
Response: ApiResponse<Map<String, Integer>>
Fields:
  - total: Total vehicles
  - active: Active vehicles
  - inactive: Inactive vehicles
  - maintenance: Under maintenance vehicles
Status: 200 OK
```

#### Get Available Vehicles
```
GET /api/vehicles/available
Response: ApiResponse<List<VehicleDTO>>
Status: 200 OK
```

#### Add New Vehicle
```
POST /api/vehicles
Content-Type: application/json

Request Body:
{
  "id": "V001",
  "model": "Toyota Camry",
  "status": "ACTIVE"
}

Response: ApiResponse<VehicleDTO>
Status: 201 CREATED
Status: 400 BAD REQUEST
```

#### Update Vehicle
```
PUT /api/vehicles/{id}
Content-Type: application/json

Request Body:
{
  "model": "Toyota Prius",
  "status": "MAINTENANCE"
}

Response: ApiResponse<VehicleDTO>
Status: 200 OK
Status: 404 NOT FOUND
Status: 400 BAD REQUEST
```

#### Delete Vehicle
```
DELETE /api/vehicles/{id}
Response: ApiResponse<Void>
Status: 204 NO CONTENT
Status: 404 NOT FOUND
```

### Authentication

#### Login
```
POST /login
Content-Type: application/x-www-form-urlencoded

Parameters:
  - username: admin (or user)
  - password: admin123 (or user123)

Response: Redirect to /dashboard
Status: 302 FOUND (Redirect)
Status: 401 UNAUTHORIZED
```

#### Logout
```
POST /logout
Response: Redirect to /login
Status: 302 FOUND
```

## Response Format

### Success Response
```json
{
  "success": true,
  "message": "Operation completed successfully",
  "data": {
    "id": "V001",
    "model": "Toyota Camry",
    "status": "ACTIVE"
  },
  "code": "SUCCESS"
}
```

### Error Response
```json
{
  "success": false,
  "message": "Vehicle not found with id : 'V999'",
  "data": null,
  "code": "RESOURCE_NOT_FOUND"
}
```

## HTTP Status Codes

| Status | Description |
|--------|-------------|
| 200 OK | Request successful |
| 201 Created | Resource created successfully |
| 204 No Content | Request successful, no content to return |
| 400 Bad Request | Invalid request parameters |
| 401 Unauthorized | Authentication required |
| 404 Not Found | Resource not found |
| 500 Internal Server Error | Server error |

## Vehicle Status Values
- `ACTIVE` - Vehicle is operational
- `INACTIVE` - Vehicle is not in use
- `MAINTENANCE` - Vehicle is under maintenance

## Validation Rules

### Vehicle Model
- Required, non-empty
- Minimum 2 characters

### Vehicle Status
- Must be one of: ACTIVE, INACTIVE, MAINTENANCE
- Case-sensitive

## Rate Limiting
Not currently implemented. To be added in future versions.

## Error Codes

| Code | Description |
|------|-------------|
| SUCCESS | Operation successful |
| RESOURCE_NOT_FOUND | Requested resource not found |
| VALIDATION_FAILED | Validation error |
| UNAUTHORIZED | Authentication required |
| FORBIDDEN | Access denied |
| INTERNAL_SERVER_ERROR | Server error |

## Examples

### Example 1: Get All Vehicles
```bash
curl -X GET http://localhost:8080/api/vehicles
```

### Example 2: Add New Vehicle
```bash
curl -X POST http://localhost:8080/api/vehicles \
  -H "Content-Type: application/json" \
  -d '{
    "id": "V001",
    "model": "Honda Civic",
    "status": "ACTIVE"
  }'
```

### Example 3: Update Vehicle Status
```bash
curl -X PUT http://localhost:8080/api/vehicles/V001 \
  -H "Content-Type: application/json" \
  -d '{
    "status": "MAINTENANCE"
  }'
```

---

For more details, please refer to the source code and Spring Boot documentation.
