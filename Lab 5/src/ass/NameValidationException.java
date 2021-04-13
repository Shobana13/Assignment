package ass;

public class NameValidationException extends Exception{
	NameValidationException(String str){
		super(str);
	}
	static void validate(String firstName, String lastName) throws NameValidationException{
		if(firstName==null || lastName==null){
			throw new NameValidationException("Name is blank");
		}
		else
			System.out.println("Name is valid");
		}
	public static void main(String args[]){  
	    try{  
	    validate("hhhhhh",null);  
	    }catch(NameValidationException e){
	    	System.out.println(e);
	    	}  

	    System.out.println("VALIDATION NAME");  
	}  

}
