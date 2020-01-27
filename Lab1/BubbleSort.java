
public class BubbleSort implements SortStrategy{
	long startTime = 0;
	long endTime   = 0;
	long totalTime = 0;
	
	public long[] sort(long[] numbers) {
		startTime = System.currentTimeMillis();
		   for (int i = (numbers.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (numbers[j-1] > numbers[j])
		         {
		              long temp = numbers[j-1];
		              numbers[j-1] = numbers[j];
		              numbers[j] = temp;
		         } 
		       } 
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
		return "BubbleSort";
	}
}
