package net.alpinia.mymovielist.exceptions;

import net.alpinia.mymovielist.models.api.entities.ApiErrorType;

public class APIException extends Exception {
    private final ApiErrorType apiError;

    public APIException(ApiErrorType apiError) {
        super();
        this.apiError = apiError;
    }

    public ApiErrorType getCode() {
        return this.apiError;
    }
}
