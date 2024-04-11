package com.user.info.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Resouce Not Found");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
