
public class InsertionSort implements SortStrategy {
	long startTime = 0;
	long endTime   = 0;
	long totalTime = 0;
	
	public long[] sort(long[] numbers) {
		startTime = System.currentTimeMillis();
		   for (int i=1; i < numbers.length; i++)
		   {
		      long index = numbers[i]; int j = i;
		      while (j > 0 && numbers[j-1] > index)
		      {
		    	  numbers[j] = numbers[j-1];
		           j--;
		      }
		      numbers[j] = index;
		   } 
		   endTime = System.currentTimeMillis();
		   totalTime = endTime- startTime;
		   return numbers;
	}
	public long getSortTime() {
		return totalTime;
	}
	public void resetTimer() {
		startTime = 0;
		endTime = 0;
	}
	public String strategyName() {
		return "InsertionSort";
	}
}
