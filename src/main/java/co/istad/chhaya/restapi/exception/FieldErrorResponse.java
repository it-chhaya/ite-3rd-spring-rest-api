package co.istad.chhaya.restapi.exception;

import lombok.Builder;

@Builder
public record FieldErrorResponse(
        String field,
        String message
) {
}
