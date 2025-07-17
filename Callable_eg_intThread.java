package hi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_eg_intThread implements Callable<Integer> {
	
	private int number;
	public Callable_eg_intThread(int number) {
		this.number = number;
	}
	
	public Integer call() throws Exception {
		return number * number;
	}
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Callable_eg_intThread task = new Callable_eg_intThread(5);
		Future<Integer> future = executor.submit(task);
		try {
			Integer result = future.get();
			System.out.println("Square of 5 is :- "+ result);
		}catch(InterruptedException | ExecutionException  e){
			e.printStackTrace();
		}
		
	}

}
