package interfacedemo;

public class InvalidRunTimeException extends Exception{
    private String code;

    public String getCode() {
        return code;
    }
    public InvalidRunTimeException(String errorcode, String message) {
        super(message);
        this.code = errorcode;
    }
}
