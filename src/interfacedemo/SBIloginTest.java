package interfacedemo;

public class SBIloginTest {
    public static void main(String[] args){
        BankLoginService loginService=new SBIBankloginService();
        try{
            boolean loginStatus=loginService.login("1111","1234");
            if(loginStatus){
                System.out.println("loginsuccessful");
            }
            else{
                System.out.println("login failed");
            }
        }catch(InvalidRunTimeException ex){
            System.out.println(ex);
        }
    }
}
