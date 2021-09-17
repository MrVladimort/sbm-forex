package mrvladimort.pet.sbmforex.web.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class HttpError extends RuntimeException {

    private HttpStatus status;

    public HttpError(HttpStatus status) {
        this.status = status;
    }

    public HttpError(Integer statusCode) {
        this.status = HttpStatus.valueOf(statusCode);
    }

    public HttpError(Integer statusCode, String message) {
        super(message);
        this.status = HttpStatus.valueOf(statusCode);
    }
}
