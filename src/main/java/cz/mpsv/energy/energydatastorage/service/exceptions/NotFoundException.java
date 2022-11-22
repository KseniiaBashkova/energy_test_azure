package cz.mpsv.energy.energydatastorage.service.exceptions;

public class NotFoundException extends EnergyDataStorageException {

    public NotFoundException(String message, Object... parameters) {
        super(message, parameters);
    }

    public NotFoundException(String message, Throwable cause, Object... parameters) {
        super(message, cause, parameters);
    }
}
