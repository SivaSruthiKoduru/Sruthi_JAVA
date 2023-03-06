package SingleTonPatternPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTonPattern {
	public static void main(String[] args) {
		ATM a = new ATM();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->
		{
			a.MoneyTransfer("acredit", "adebit", 10000);
		});
		es.execute(()->
		{
			a.MoneyTransfer("bcredit", "bdebit", 52550);
		});
	}
	

}

