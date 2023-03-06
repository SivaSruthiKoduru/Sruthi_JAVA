package SingleTonPatternPackage;

class ATM
{
	public void MoneyTransfer(String crid,String deid,int amount)
	{
		Transaction t = Transaction.createCloneInstance();
		t.credit(crid,amount);
		t.debit(deid,amount);
		t.updateAmount();
	}
}