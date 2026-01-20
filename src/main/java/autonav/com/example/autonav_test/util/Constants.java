package autonav.com.example.autonav_test.util;

public class Constants {
    // Vehicle Status Constants
    public static final String VEHICLE_STATUS_ACTIVE = "ACTIVE";
    public static final String VEHICLE_STATUS_INACTIVE = "INACTIVE";
    public static final String VEHICLE_STATUS_MAINTENANCE = "MAINTENANCE";

    // User Roles
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_USER = "USER";
    public static final String ROLE_DRIVER = "DRIVER";

    // API Response Codes
    public static final String CODE_SUCCESS = "SUCCESS";
    public static final String CODE_RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";
    public static final String CODE_VALIDATION_FAILED = "VALIDATION_FAILED";
    public static final String CODE_UNAUTHORIZED = "UNAUTHORIZED";
    public static final String CODE_FORBIDDEN = "FORBIDDEN";
    public static final String CODE_INTERNAL_ERROR = "INTERNAL_SERVER_ERROR";

    // Pagination Defaults
    public static final int DEFAULT_PAGE_SIZE = 10;
    public static final int DEFAULT_PAGE_NUMBER = 0;
    public static final int MAX_PAGE_SIZE = 100;

    // Session Constants
    public static final String SESSION_USER = "user";
    public static final int SESSION_TIMEOUT_MINUTES = 30;

    private Constants() {
        // Prevent instantiation
    }
}
