package jp.co.wap.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

import jp.co.wap.exam.lib.Interval;

/*
 * Author: Abhas Mittal
 * B.Tech. Pulp and Paper Engineering, 3rd Year
 * IIT Roorkee
 */


public class Problem1 {
	public int getMaxIntervalOverlapCount(List<Interval> intervals) {
		int numberOfIntervals = intervals.size(); //checks the number of intervals
		int localOverlaps = 0; //checks the number of overlaps that an end of interval has
		int maxOverlaps = 0; //contains the maximum number of overlaps
		intervalSort[] intervalsDesc = new intervalSort[2*numberOfIntervals];
		
		for (int i = 0; i<numberOfIntervals; i++) {
			int intervalBegin = intervals.get(i).getBeginMinuteUnit(); //number of minutes from 00:00
			int intervalEnd = intervals.get(i).getEndMinuteUnit(); //number of minutes from 00:00
			intervalsDesc[2*i] = new intervalSort(intervalBegin, "b");
			intervalsDesc[2*i + 1] = new intervalSort(intervalEnd, "e");
		}
		
		/*
		 *Sorting array in ascending order on the basis of their time in minutes from 00:00 
		 */
		
		Arrays.sort(intervalsDesc, new Comparator<intervalSort>(){

			@Override
			public int compare(intervalSort arg0, intervalSort arg1) {
				if(arg0.a > arg1.a) {
					return 1;
				}
				else
					return -1;
			}
		});
		
		for (int i = 0; i<2*numberOfIntervals; i++) { //runs for 2n times (n is the number of intervals)
			if(intervalsDesc[i].b == "b")
				localOverlaps++; // +1 for the beginning time
			else if(intervalsDesc[i].b == "e")
				localOverlaps--; // -1 for the ending time
			if(localOverlaps > maxOverlaps)
				maxOverlaps = localOverlaps;
		}
		/*System.out.println(maxOverlaps);
		return 0;*/
		return maxOverlaps;
	}
	

	public int compareTime(int inter1, int inter2) {
		if(inter1 > inter2)
			return 1;
		return 2;
	}
}

class intervalSort {
	public int a;
	public String b; // can be only b or e remarking begin or end
	
	public intervalSort(int a, String b){
		this.a = a;
		this.b = b;
	}
}