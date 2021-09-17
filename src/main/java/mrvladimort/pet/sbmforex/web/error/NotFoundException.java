package mrvladimort.pet.sbmforex.web.error;

public class NotFoundException extends HttpError {

    public final static Integer CODE = 404;
    public final static String MESSAGE = "Not Found";

    public NotFoundException() {
        super(CODE, MESSAGE);
    }

    public NotFoundException(String message) {
        super(CODE, message);
    }
}
