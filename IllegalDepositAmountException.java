public class IllegalDepositAmountException extends RuntimeException{
    public IllegalDepositAmountException(){
        super("Error: deposite muset be positive");
    }
    public IllegalDepositAmountException(String message){
        super(message);
    }
}
