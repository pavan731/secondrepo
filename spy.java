public class spy {
	
	public static boolean spyy( int a){
		
		
		int n=a;
		int rem =0;
		int mul=1, sum=0;
		
		while(n!=0) {
			rem = n%10;
			n= n/10;
			sum=sum+rem;
			mul=mul*rem;
			
		}
		if(sum==mul) {
			return true;
		}
		else
			return false;
	}

}