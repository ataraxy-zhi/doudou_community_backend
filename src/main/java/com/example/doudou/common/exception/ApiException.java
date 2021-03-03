package com.example.doudou.common.exception;

import com.example.doudou.common.api.IErrorCode;

/**
 * 异常
 */
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }


    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
