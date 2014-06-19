package com.notio.example.fse;

public class NoSuchObjectException extends FseException {
    private static final long serialVersionUID = 6418295796173126560L;

    public NoSuchObjectException() {
    }

    public NoSuchObjectException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NoSuchObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchObjectException(String message) {
        super(message);
    }

    public NoSuchObjectException(Throwable cause) {
        super(cause);
    }
}
