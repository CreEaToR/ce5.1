
public class Ce51v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

	public static int pow10(int base){
	
		int value = 1;
		int power = 10;
		
		while(power>0){
		value*=base;
		power = power - 1;
		}
		return value;
	}
	public static void add(int x, int y){
		
		System.out.println(x + y);
		
	}
	public static double sqrt(int num) {
		double t = 0;
	 
		double Sqrt = num / 2;
	 
		do {
			t = Sqrt;
			Sqrt = (t + (num / t)) / 2;
		} while ((t - Sqrt) != 0);
	 
		return Sqrt;
	}
	public static int pow(int base,int p){
		
		int value = 1;
		int power = p;
		
		while(power>0){
		value*=base;
		power = power - 1;
		}
		return value;
	}
	public static int abs(int num){
		
		if(num<1){
			
			num*=-1;
		}
		return num;
		
		}
	public static double addall(int x,int y, int z){
		
		double total = sqrt(x) + abs(y) + pow(z,y);
		
		
		return total;
		
		
		
		
		
	}
	
}
