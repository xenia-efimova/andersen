package Homework_6.exception;

public class MyArrayDataException extends Throwable {
    private final String message;

    public MyArrayDataException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}