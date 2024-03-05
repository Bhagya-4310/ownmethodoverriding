package interfacedemo;

public class SBIBankloginProcess implements BankLoginService{
    SBIBankloginService sbiBankloginService;
    public SBIBankloginProcess(){
         this.sbiBankloginService=new SBIBankloginService();
    }
    @Override
    public boolean login(String username,String password) throws InvalidRunTimeException {
        if (sbiBankloginService.login(username, password)) {
            String otp = sbiBankloginService.generateOTP(username);
            boolean validationOTP = false;
            try {
                validationOTP = sbiBankloginService.validationOTP(otp);
            } catch (InvalidOTPException exp) {
                System.out.println("ERROR Occured" + exp);
                throw new InvalidRunTimeException(exp.getCode(),exp.getMessage());
            } catch (Exception e) {
            }

            if (validationOTP) {
                System.out.println("valid otp & login is successful");
            } else {
                System.out.println("invalid otp & login failed");
            }
            return validationOTP;
        } else {
                System.out.println("invalid credentials");
                return false;
            }
        }
    }
