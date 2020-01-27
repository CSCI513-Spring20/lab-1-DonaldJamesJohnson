import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {

	SortStrategy sortStrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation()
	{
		sortStrategy = new SelectionSort(); // Set the default strategy here.	
	}
	
	public void readInputFile()
	{
		population = readPopulationFile("src\\WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy)
	{
		sortStrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName)
	{
		try 
		{
			FileReader inputFile = new FileReader("/home/donaldjohnson/eclipse-workspace/CSCI_513_Lab_1/Lab1/WorldPopulation.csv");
			BufferedReader reader = new BufferedReader(inputFile);
			String line;
			int i = 0;
			while ((line = reader.readLine()) != null)
			{
				String[] token = line.split(",");
				population[i] = Long.parseLong(token[2]);
				//System.out.println(population[i]);
				i++;
			}
			reader.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the strategy object
	public void sortPopulation()
	{	
		System.out.println(sortStrategy.strategyName());
		sortStrategy.sort(population);
		System.out.println(sortStrategy.getSortTime() + "ms");
	}
	
	public void computeTotalPopulation()
	{
		System.out.println("dd");
	}
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
	public static void main(String[] args) 
	{
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new InsertionSort()); 
		worldPopulation.sortPopulation();
		worldPopulation.setStrategy(new SelectionSort());
		worldPopulation.sortPopulation();
		worldPopulation.setStrategy(new BubbleSort());
		worldPopulation.sortPopulation();
	}

}
