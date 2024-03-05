package exception;

public class CustomExceptionService{
    public String checkException3(){
    //one way of handling the checked exception
        try {
            throw new Exception("Throw CheckException");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("from checkexception method finally block");
        }
    }
        public String checkedException2 () throws Exception {
        throw new Exception("throw checkException");
    }
        public String UncheckedException () {
        throw new RuntimeException("Throw uncheckedexception");
    }
    }