package Exercise6;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LorryReachTime {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed of the Lorry in kilometer per hour");
		int speed = scan.nextInt();
		System.out.println("Enter the distance in kilometers");
		int distance = scan.nextInt();
		int time = distance / speed;
		System.out.println("Enter date of starting in DD/MM/YYYY/hh/mm/ss Format");
		Date startingDate = new Date();
		String dateString = scan.next();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy/HH/mm/ss");
		startingDate = simpleDateFormat.parse(dateString);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startingDate);
		Date tempDate = new Date();
		tempDate = startingDate;
		int extraHours = time % 24;
		int daysWorking = time / 8;
		int daysRequired = 0;
		System.out.println(extraHours);

		for (int i = daysWorking; i > 0; i--) {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {

				daysRequired++;
				i++;
				calendar.add(Calendar.DATE, 1);
				continue;
			} else if ((calendar.get(Calendar.WEEK_OF_MONTH) == 2)
					&& (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)) {

				daysRequired++;
				i++;
				calendar.add(Calendar.DATE, 1);
				continue;
			} else if ((calendar.get(Calendar.MONTH) == Calendar.JANUARY) && (calendar.get(Calendar.DATE) == 26)) {

				daysRequired++;
				i++;
				calendar.add(Calendar.DATE, 1);
				continue;
			} else if ((calendar.get(Calendar.MONTH) == Calendar.AUGUST) && (calendar.get(Calendar.DATE) == 15)) {
				;
				daysRequired++;
				i++;
				calendar.add(Calendar.DATE, 1);
				continue;
			} else if ((calendar.get(Calendar.MONTH) == Calendar.JANUARY) && (calendar.get(Calendar.DATE) == 1)) {

				daysRequired++;
				i++;
				calendar.add(Calendar.DATE, 1);
				continue;
			} else {
				daysRequired++;
				calendar.add(Calendar.DATE, 1);

			}
		}
		calendar.setTime(tempDate);
		calendar.add(Calendar.DATE, daysRequired);
		calendar.add(Calendar.HOUR_OF_DAY, extraHours);
		System.out.println("TIME OF REACHING:" + calendar.getTime());

		scan.close();

	}

}
