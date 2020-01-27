
public class SelectionSort implements SortStrategy{
	long startTime = 0;
	long endTime   = 0;
	long totalTime = 0;
	
	public long[] sort(long[] numbers) {
		startTime = System.currentTimeMillis();
		   for (int i = 0; i < numbers.length-1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j < numbers.length; j++)
		            if (numbers[j] < numbers[min]) min = j;
		      long temp = numbers[i];
		      numbers[i] = numbers[min];
		      numbers[min] = temp;
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
		return "SelectionSort";
	}
}
