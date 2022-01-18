package day4.Q6;

public class InputException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InputException(int num){
		super("Number can’t be greater than "+num);
	}
}