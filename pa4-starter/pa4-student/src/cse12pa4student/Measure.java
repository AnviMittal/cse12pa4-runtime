package cse12pa4student;
import java.util.ArrayList;
import java.util.List;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {

		List<Measurement> list_of_measurements = new ArrayList<>(); 
		for(int i = 0; i < toRun.length; i++){
			String func = toRun[i]; 

			for(int j = startN; j<= stopN; j++){


				long startTime = System.nanoTime();

				switch (func) {
					case "A":
						mysteryA(j);
						break;
					case "B":  
						mysteryB(j);
						break;
					case "C":
						mysteryC(j);
						break;
					case "D":
						mysteryD(j);
						break;
					case "E":
						mysteryE(j);
						break;
					case "F":
						mysteryF(j);
						break;
				}
					
				long estimatedTime = System.nanoTime() - startTime;

				Measurement newMeasurement = new Measurement(func, j, estimatedTime); 
				list_of_measurements.add(newMeasurement); 
	
			}

		}
		return list_of_measurements; 
		
	}
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		
		String s = ""; 

		System.out.println("name,n,nanoseconds"); 

		for(Measurement m: toConvert) {

			String toAdd = m.name + "," + 
			String.valueOf(m.valueOfN) + "," + String.valueOf(m.nanosecondsToRun); 
			System.out.println(toAdd); 
			s = s + toAdd + '\n'; 
		}

		return s; 

		
	
	}
	
		
}
