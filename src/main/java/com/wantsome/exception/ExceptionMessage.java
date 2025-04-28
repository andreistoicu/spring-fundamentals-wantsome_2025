package com.wantsome.exception;

public class ExceptionMessage {
    private Integer errorCode;
    private String exceptionMessage;
    private String exceptionDescription;

    public ExceptionMessage(Integer errorCode, String exceptionMessage, String exceptionDescription) {
        this.errorCode = errorCode;
        this.exceptionMessage = exceptionMessage;
        this.exceptionDescription = exceptionDescription;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionDescription() {
        return exceptionDescription;
    }

    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }

    @Override
    public String toString() {
        return "NoEmployeeExceptionMessage{" + "errorCode=" + errorCode + ", exceptionMessage=" + exceptionMessage + ", exceptionDescription=" + exceptionDescription + '}';
    }
}
