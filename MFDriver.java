//Team Cheesy Potatoes -- Alexia Leong, Bing Li, Wenting Li
//APCS2 pd01
//L#00 -- But What Does the Data Say?
//2018-02-07

//Driver class
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MFDriver{
    public static void main(String[] args){
        PrintWriter pw = null;
	try {
	    pw = new PrintWriter(new File("data.csv"));
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}

	StringBuilder sb = new StringBuilder();
	
	//column label of csv files --  so we don't have to append different spreadsheet files later
	sb.append("size ");
	sb.append(", ");
	sb.append("type ");
	sb.append(", ");
	sb.append("Trial 1");
	sb.append(", ");
	sb.append("Trial 2");
	sb.append(", ");
	sb.append("Trial 3");
	sb.append(", ");
	sb.append("Trial 4");
	sb.append(", ");
	sb.append("Trial 5");
	sb.append(", ");
      	sb.append("Trial 6");
	sb.append(", ");
	sb.append("Trial 7");
	sb.append(", ");
	sb.append("Trial 8");
	sb.append(", ");
	sb.append("Trial 9");
	sb.append(", ");
	sb.append("Trial 10");
	sb.append(", ");
	sb.append("Trial 11");
	sb.append(", ");
	sb.append("Trial 12");
	sb.append(", ");
	sb.append("Trial 13");
	sb.append(", ");
	sb.append("Trial 14");
	sb.append(", ");
	sb.append("Trial 15");
	sb.append(", ");
	sb.append("average of 1000 trials");
	sb.append(", ");
	sb.append("\n");


	int arrs = 1;
	
	//testing arrs starting at 1000x1000 and then increasing the length by 1000
	while(arrs <= 10){
	    int[][] bigtest = new int[arrs*1000][arrs*1000];
	    MatrixFinder.populate(bigtest);
	    int trial = 1;
		int ave = 0;       
		
	    System.out.println("\n------------------For a " + arrs + "000x" + arrs + "000 array-----------------------");  //deleted for CSV
	    //testing out runtime
	    System.out.println("\nRuntime for worst case:  (only shown the first 15 trials) \n");
	    //for the csv
	    sb.append( arrs + "000" + ", ");
	    sb.append("worst, ");

	    while(trial <= 1000){
		long startTime = System.nanoTime();
		MatrixFinder.search(bigtest, bigtest[bigtest.length-1][0]); //code being tested 
		long estimatedTime = System.nanoTime() - startTime;
		if(trial <= 15){
		    System.out.println("trial " + trial + ", " + estimatedTime + " nanoseconds.");
		    sb.append(estimatedTime);
		    sb.append(", ");
		}
		trial++;
		ave += estimatedTime;
	    }
	    sb.append(ave/1000);
	    sb.append('\n');
	    System.out.println("Average of 1000 trials: "+ (ave/1000) + " nanoseconds.");

	    trial = 1;
	    ave = 0;
	    System.out.println("\nRuntime for best case:  (only shown the first 15 trials) \n");
	    //for csv
	    sb.append( arrs + "000" + ", ");
	    sb.append("best, ");
	    
	    while(trial <= 1000){
		long startTime = System.nanoTime();
		MatrixFinder.search(bigtest, bigtest[0][bigtest.length-1]); //code being tested 
		long estimatedTime = System.nanoTime() - startTime;
		if(trial <= 15){
		    System.out.println("trial " + trial + ", " + estimatedTime +" nanoseconds.");
		    sb.append(estimatedTime);
		    sb.append(", ");
		}
		trial++;
		ave += estimatedTime;
	    }
	    System.out.println("Average of 1000 trials: "+ (ave/1000) + " nanoseconds.");
	    sb.append(ave/1000);
	    sb.append('\n');
	    arrs += 1;
	}
	pw.write(sb.toString());
	pw.close();
    }//end of main

}
