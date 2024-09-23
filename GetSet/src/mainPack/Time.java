package mainPack;

public class Time {

	private int hour, minute, second;
	private String date;

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setDate(String date) {
		
		this.date=date;
	}

	public int getHour() {
		
		return hour;
	}

	public int getMinute() {
		
		return minute;
	}

	public int getSecond() {
		
		return second;
	}
	
	public String getDate() {
		
		return date;
	}
	
	public String getTime() {
		String time;
		if(hour<10) time = "0"+Integer.toString(hour); else time = Integer.toString(hour) ;
		time+=":";
		if(minute<10) time += "0"+Integer.toString(minute); else time += Integer.toString(minute) ;
		time+=":";
		if(second<10) time += "0"+Integer.toString(second); else time += Integer.toString(second) ;
		
		return time;
	}

}
