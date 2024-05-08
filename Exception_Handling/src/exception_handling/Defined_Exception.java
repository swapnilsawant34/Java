package exception_handling;

class VoterException extends ArithmeticException
{
	public String getVoterError()
	{
		return "invalid voter you are not eligible";
	}
}

class ValidateVoter
{
	void verifyVoter(String adhar,int birthyear) {
		int age=2023-birthyear;
		if(age<18)
		{
			VoterException v=new VoterException();
			throw v;
		}
		else
		{
			System.out.println("Welcome");
		}
		
	}
}



public class Defined_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	ValidateVoter vv=new ValidateVoter();
        	vv.verifyVoter("11122222AAAA",2014);
        }
        catch(VoterException ex)
        {
        	System.out.println(ex.getVoterError());
        }
	}

}
