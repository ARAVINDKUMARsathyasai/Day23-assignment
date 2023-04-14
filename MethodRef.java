package minimal;

@FunctionalInterface
interface ShowAble{
	public void message();
}
class WhtasUp implements ShowAble{
	@Override
	public void message() {
		System.out.println("hy from whatsup");
	}	
}
class SMS{
	public static void showSMS(){
		System.out.println("hy from SMS");	
	}
}
class Mail{
  public void showMail(){
	  System.out.println("hy from mail");  
  }
}

class Letter
{
	Letter(){
		System.out.println("hy from latter");	
	}
}

public class MethodRef {
	public static void main(String[] args) {
		
		//Static method reference 
		ShowAble sms=SMS:: showSMS;
		sms.message();
		
		//INSTANCE METHOD REFERENCE 
		Mail mail=new Mail();
		ShowAble showMail=mail::showMail;
		showMail.message();
		
		//CONSTRUCTOR METHOD REFERENCE
		ShowAble letter=Letter::new;
		letter.message();
	}
}