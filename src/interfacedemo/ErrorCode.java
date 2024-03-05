package interfacedemo;

public enum ErrorCode{
    NEOTERIC_INVALID_OTP_1000("NEO_ERR_1000","InvalidOTP"),
    NEOTERIC_EXPIRY_OTP_1001("NEO_ERR_1000","InvalidOTP");
    String code;
    String message;
    ErrorCode(String errorcode,String message) {
        this.code = errorcode;
        this.message=message;
    }
    public String getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
