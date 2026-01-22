package autonav.com.example.autonav_test.exception;

public class ValidationException extends RuntimeException {
    private String field;
    private Object rejectedValue;
    private String message;

    public ValidationException(String message) {
        super(message);
        this.message = message;
    }

    public ValidationException(String field, Object rejectedValue, String message) {
        super(String.format("Validation failed for field '%s' with value '%s': %s", field, rejectedValue, message));
        this.field = field;
        this.rejectedValue = rejectedValue;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public Object getRejectedValue() {
        return rejectedValue;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
