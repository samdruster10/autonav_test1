package autonav.com.example.autonav_test.util;

import autonav.com.example.autonav_test.exception.ValidationException;

public class ValidationUtils {

    public static void validateNotNull(Object value, String fieldName) {
        if (value == null) {
            throw new ValidationException(fieldName, null, "Field cannot be null");
        }
    }

    public static void validateNotEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new ValidationException(fieldName, value, "Field cannot be empty");
        }
    }

    public static void validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!email.matches(emailRegex)) {
            throw new ValidationException("email", email, "Invalid email format");
        }
    }

    public static void validateVehicleModel(String model) {
        validateNotEmpty(model, "model");
        if (model.length() < 2) {
            throw new ValidationException("model", model, "Model must be at least 2 characters long");
        }
    }

    public static void validateVehicleStatus(String status) {
        validateNotEmpty(status, "status");
        if (!isValidStatus(status)) {
            throw new ValidationException("status", status, "Invalid vehicle status");
        }
    }

    public static boolean isValidStatus(String status) {
        return Constants.VEHICLE_STATUS_ACTIVE.equals(status) ||
                Constants.VEHICLE_STATUS_INACTIVE.equals(status) ||
                Constants.VEHICLE_STATUS_MAINTENANCE.equals(status);
    }

    public static void validateUsername(String username) {
        validateNotEmpty(username, "username");
        if (username.length() < 3) {
            throw new ValidationException("username", username, "Username must be at least 3 characters long");
        }
    }

    public static void validatePassword(String password) {
        validateNotEmpty(password, "password");
        if (password.length() < 6) {
            throw new ValidationException("password", password, "Password must be at least 6 characters long");
        }
    }

    private ValidationUtils() {
        // Prevent instantiation
    }
}
