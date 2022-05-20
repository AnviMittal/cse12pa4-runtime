package cse12pa4student;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {

		List<Measurement> test1 = Measure.measure(new String[]{"A", "B"}, 40, 100);
		Measure.measurementsToCSV(test1); 
		
	}
}
