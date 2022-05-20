
public class Demo1 {
	
	public String revString(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
public static void main(String[] args) {
	
	Demo1 d=new Demo1();
	String rev=d.revString("anusruthi");
	System.out.println(rev);
	
}
}
