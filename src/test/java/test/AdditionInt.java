package test;

public class AdditionInt {

	public static void main(String[] args) {
		String str="aa3ddk5kc4sks1";
		
		char[] c=str.toCharArray();
		int sum=0;
		for (int i = 0; i < c.length; i++) {
			if(Character.isDigit(c[i]))
			{
				int a=Integer.parseInt(String.valueOf(c[i]));
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}

}
