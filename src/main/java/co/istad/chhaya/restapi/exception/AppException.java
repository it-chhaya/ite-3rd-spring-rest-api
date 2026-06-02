package co.istad.chhaya.restapi.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class AppException {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse<?> handleValidationException(
            MethodArgumentNotValidException e
    ) {
        log.error("Validation Exception happened");

        List<FieldErrorResponse> fields = new ArrayList<>();

        e.getFieldErrors()
                .forEach(fieldError -> {
                    FieldErrorResponse field = FieldErrorResponse.builder()
                            .field(fieldError.getField())
                            .message(fieldError.getDefaultMessage())
                            .build();
                    fields.add(field);
                });

        return ErrorResponse.builder()
                .status(false)
                .code(HttpStatus.BAD_REQUEST.value())
                .message("Validation is errored")
                .errors(fields)
                .build();
    }

}
