package ass;
public class InvalidAgeException extends Exception{
			InvalidAgeException(String str){
			super(str);
			}

	static void check(int age)throws InvalidAgeException{
		     if(age>15)  {
		    	 System.out.println("age is valid");  
		    	 }
		     else  
		    	 throw new InvalidAgeException("age is not valid");  
		     }
	 public static void main(String args[]){  
	    try{  
	    check(14);  
	    }catch(InvalidAgeException e){
	    	System.out.println(e);
	    	}  

	    System.out.println("VALID AGE");  
	}  
	}


