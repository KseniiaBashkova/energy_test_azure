package cz.mpsv.energy.energydatastorage.service.exceptions;


import org.slf4j.helpers.MessageFormatter;

public class EnergyDataStorageException extends RuntimeException {

    public EnergyDataStorageException(String message, Object... parameters) {
        this(message, null, parameters);
    }

    public EnergyDataStorageException(String message, Throwable cause, Object... parameters) {
        super(formatMessage(message, parameters), cause);
    }

    private static String formatMessage(String message, Object... parameters) {
        return MessageFormatter.arrayFormat(message, parameters).getMessage();
    }
}
