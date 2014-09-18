package jp.co.wap.exam.lib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interval {
	private static class Time {
		final int hour;
		final int minute;

		public Time(int hour, int minute){
			this.hour = hour;
			this.minute = minute;
		}
		public String toString(){
			return String.format("%02d:%02d", hour, minute);
		}
		public int hashCode(){
			return toString().hashCode();
		}
		public boolean equals(Object obj){
			if(!(obj instanceof Time)){
				return false;
			}
			Time other = (Time) obj;
			return (this.hour == other.hour && this.minute == other.minute);
		}
	}

	private final Time begin;
	private final Time end;

	public Interval(String begin, String end){
		this.begin = toTime(begin);
		this.end = toTime(end);
	}

	private static Time toTime(String timeFormatString){
		Pattern p = Pattern.compile("(\\d?\\d):([0-5]\\d)");
		Matcher m = p.matcher(timeFormatString);
		if(!m.find()){
			throw new IllegalArgumentException("Invalid String Format");
		}
		int hour = Integer.parseInt(m.group(1));
		int minute = Integer.parseInt(m.group(2));

		return new Time(hour, minute);
	}
	public String getBegin(){
		return this.begin.toString();
	}
	public String getEnd(){
		return this.end.toString();
	}
	public int getBeginHour(){
		return this.begin.hour;
	}
	public int getBeginMinute(){
		return this.begin.minute;
	}
	public int getEndHour(){
		return this.end.hour;
	}
	public int getEndMinute(){
		return this.end.minute;
	}
	public int getBeginMinuteUnit(){
		return getBeginHour()*60 + getBeginMinute();
	}
	public int getEndMinuteUnit(){
		return getEndHour()*60 + getEndMinute();
	}
	public int getIntervalMinute(){
		return getEndMinuteUnit() - getBeginMinuteUnit();
	}
	public int hashCode(){
		return toString().hashCode();
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Interval)){
			return false;
		}
		Interval other = (Interval) obj;
		return (this.begin.equals(other.begin) && this.end.equals(other.end));
	}
	public String toString(){
		return String.format("[%s-%s]", begin, end);
	}
}