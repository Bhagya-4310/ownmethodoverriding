package interfacedemo;

public class HDFCBankloginservice implements BankLoginService{
    String accountNumber = "2222";
    String password = "1234";
    @Override
    public boolean login(String username,String password){
        if(username.equals(accountNumber) && this.password.equals(password)){
            return true;
        }
        return false;
    }
}
