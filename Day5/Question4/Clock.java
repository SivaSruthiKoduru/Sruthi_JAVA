package Question4;

import java.time.LocalTime;

class Clock
{
	int hrs;
	int min;
	int sec;
	Clock(){
		LocalTime localtime = LocalTime.now();
		hrs = localtime.getHour();
		min = localtime.getMinute();
		sec = localtime.getSecond();
	}
	synchronized void  displaySeconds()
	{   
		
		sec+=1;
		if(sec==60) 
		{
			min+=1;
			sec=0;
		}
		if(min==60)
		{
			notify();
		}
		System.out.printf("%02d:%02d:%02d\n",hrs,min,sec);
	}
	synchronized void displayMinutes()
	{
		
		try
		{
			wait();
		}
		catch(Exception e)
		{
	         e.printStackTrace();
		}
		if(min==60) {
			hrs+=1;
			min=0;
		}
		if(hrs==23&&min==60)
		{
			notify();
		}
		System.out.printf("%02d:%02d:%02d\n",hrs,min,sec);
	}
	synchronized void displayHours()
	{
		
		try
		{
			wait();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(hrs==23&&min==60) {
			hrs=0;
			min=0;
			sec=0;
		}
		System.out.printf("%02d:%02d:%02d\n",hrs,min,sec);
	}
	
	
			
}