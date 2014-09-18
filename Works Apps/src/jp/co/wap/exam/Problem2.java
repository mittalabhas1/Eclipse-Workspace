package jp.co.wap.exam;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jp.co.wap.exam.lib.Interval;

/*
 * Author: Abhas Mittal
 * B.Tech. Pulp and Paper Engineering, 3rd Year
 * IIT Roorkee
 */

public class Problem2 {
	public int getMaxWorkingTime(List<Interval> intervals){
		int size = intervals.size();
		
		Collections.sort(intervals, comparator); //Sorts the array in ascending order of their ending time
		
		int[] sum = new int[size];
		
		sum[0] = intervals.get(0).getIntervalMinute();
		
		for(int i = 1; i<size; ++i){
			int j = previousOccurence(intervals.get(i).getBeginMinuteUnit(), i, intervals); //predicts the largest 'j' with ending time<begining time of 'i'
			if(j == -1)
				sum[i] = Math.max(intervals.get(i).getIntervalMinute(), sum[i-1]);
			else
				sum[i] = Math.max(sum[j] + intervals.get(i).getIntervalMinute(), sum[i-1]);
		}
		/*System.out.println(sum[size-1]);
		return 0;*/
		return sum[size-1];
	}
	
	private int previousOccurence(int predict, int occurence, List<Interval> finalInterval) {
		for(int x = occurence; x>=0; --x){
			if(finalInterval.get(x).getEndMinuteUnit()<=predict)
				return x;
		}
		return (-1);
	}

	Comparator<Interval> comparator = new Comparator<Interval>(){
		public int compare(Interval first, Interval second){
			if(first.getEndMinuteUnit() < second.getEndMinuteUnit())
				return (-1);
			if(first.getEndMinuteUnit() == second.getEndMinuteUnit())
				return 0;
			return 1;
		}
	};			

}