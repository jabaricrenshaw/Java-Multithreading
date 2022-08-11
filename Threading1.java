//An example of multithreading in Java

public class Threading1 extends Thread{

	public static final int threadCount = 6;
	private Thread t;
	private String threadName;
	Threading1(String name){
		threadName = name;
		System.out.println("Creating thread " + threadName);
	}
	Threading1(){ }
	

	public static void main(String[]args){
		Thread t[] = new Thread[threadCount];
		for(int i = 0; i < threadCount; i++){
			t[i] = new Thread(new Threading1(Integer.toString(i)));
			t[i].start();
		}
	}

	public void run(){
		System.out.println("Executing thread " + threadName);
		System.out.println(fact(30) + "\n");
		System.out.println(fib(30) + "\n");
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
