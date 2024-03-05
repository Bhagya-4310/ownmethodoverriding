package interfacedemo;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
public class SBIBankloginService implements BankOTPValidationService{
    String accountNumber="1111";
    String password="1234";
    String otp;
    Date otpExpireTime;
    public SBIBankloginService(){
    }
    @Override
        public boolean login(String userName, String password)  {
            if(userName.equals(accountNumber) && this.password.equals(password)){
                return true;
            }
            return false;
        }
    @Override
    public String generateOTP(String accountNumber) {
        if(this.accountNumber.equals(accountNumber)) {
            otp = UUID.randomUUID().toString();
            Calendar otpExpiryCalender = Calendar.getInstance();
            otpExpiryCalender.add(Calendar.SECOND, 40);
            System.out.println("otp expirecalender" + otpExpiryCalender.getTime());
            otpExpireTime = otpExpiryCalender.getTime();
            return otp;
        }
        return null;
    }
    @Override
    public boolean validationOTP(String otp) throws InvalidOTPException {
        if(this.otp.equals(otp)){
            return true;
        }else {
            System.out.println("invalidotp");
            throw new InvalidOTPException(ErrorCode.NEOTERIC_INVALID_OTP_1000.getCode(),
              ErrorCode.NEOTERIC_INVALID_OTP_1000.getMessage());
        }
    }
}
