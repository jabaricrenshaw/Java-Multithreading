public class Thrdng2{
	public static void main(String[]args){
		Thrdng2 k = new Thrdng2();
		k.run();
	}

	void run(){
		for(int i = 0; i < 6; i++){
			System.out.println(fact(30) + "\n");
			System.out.println(fib(30) + "\n");
		}
	}

	public static long fact(long n){
		if(n == 0 || n == 1){
			return 1;
		}else{
			return n * fact(n-1);
		}
	}

	public static long fib(long n){
		if(n <= 1){
			return n;
		}
		return fib(n-1) + fib(n-1);
	}
}