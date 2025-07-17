package hi;

import java.util.concurrent.CompletableFuture;

public class completable_Future {

	public static void main(String[] args) throws Exception{
		CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> "hello from Asynco:");
		String result = future.get();
		System.out.println(result);

	}

}
