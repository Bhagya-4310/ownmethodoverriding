package interfacedemo;

public interface BankLoginService {
    boolean login(String username,String password) throws InvalidRunTimeException;

}
