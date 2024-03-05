package interfacedemo;

public interface BankOTPValidationService extends BankLoginService {
    String generateOTP(String accountNumber);
    boolean validationOTP(String otp) throws Exception;

}
