package timer;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			int counter = 10;
			@Override
			public void run() {
				if(counter> 0) {
				System.out.println(counter + "seconds");
			}
				else {
					System.out.println("Happy New Year");
					timer.cancel();
				}
				
			
			
			}};
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2023);
		date.set(Calendar.MONTH, Calendar.MAY);
		date.set(Calendar.DAY_OF_MONTH, 29);
		date.set(Calendar.HOUR_OF_DAY, 21);
		date.set(Calendar.MINUTE,52);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		//timer.schedule(task,0)
		//timer.schedule(task,date.getTime());
		timer.scheduleAtFixedRate(task, date.getTime(), 100);
	}}


