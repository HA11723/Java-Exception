public class IllegalWithdrawAmountException extends RuntimeException{
    public IllegalWithdrawAmountException(){
        super("Error: widthdrawal amount must be positive");
    }
    //constructor with a custom message for invalid withdrawal amount
    public IllegalWithdrawAmountException(String message){
        super(message);
    }
}
