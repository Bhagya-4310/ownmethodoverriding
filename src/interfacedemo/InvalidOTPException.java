package interfacedemo;
public class InvalidOTPException extends Exception{
 private String code;
    public String getCode(){
        return code;
    }
    public InvalidOTPException(String errorcode, String message){
     super(message);
     this.code=errorcode;
 }
}
