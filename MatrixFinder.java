//Team Cheesy Potatoes -- Alexia Leong, Bing Li, Wenting Li
//APCS2 pd01
//L#00 -- But What Does the Data Say?
//2018-02-07

/*
 *Consider an n x n 2D array of ints, wherein numbers increase across any row (L->R) and down any column...
 *
 *e.g.,
 *
 *| 1  3  5 |
 *
 *| 3  7  8 |
 *
 *| 5 12 15 |
 *... Given a target number returns the coordinates of the first occurence of the 
 *    target number if found
 *    If not found, (-1, -1) is returned
 *
 *Algorithm: 
 *    1. Start with the top right corner
 *    2. Compare element with target
 *        a. if element == target, return coordinate
 *        b. if element < target, increase row by 1
 *        c  if element > target, decrease column by 1
 *    3. Repeat step 2 until coordinates are returned or element is out of bound
 *       in which case we return (-1, -1)
 */

public class MatrixFinder {
    public static String search(int[][] matrix, int target){
	int col = matrix.length - 1; //starting at upper right corner
	int row = 0;
	while(col >= 0 && row < matrix.length){  //as long as it's in the bounds of the matrix
	    if (matrix[row][col] == target){  //once that target is found, if it's there
		return "(" + row + "," + col + ")";
	    }
	    else if(matrix[row][col] < target){  //either it's less than target so go to greater #s
		row++;
	    }
	    else{  //or less than target so go to lower #s
		col--;
	    }
	}
	return "(-1,-1)";  //if not found, return (-1,-1])
    }

    public static void populate(int[][] arr){ //populates array
	int ctr = 1;
	for (int x = 0; x < arr.length;x++){
	    for (int y = 0;y < arr.length;y++){
		arr[x][y] = ctr;
		ctr += 1;
	    }
	}
    }
    
    public static void main(String[] args){
	int arrs = 1;
	
	//testing arrs starting at 2000x2000 and then increasing the length by 2000
	while(arrs <= 10){
	    int[][] bigtest = new int[arrs*1000][arrs*1000];
	    populate(bigtest);
	    int trial = 1;
	    int ave = 0;       
	    System.out.println("\n------------------For a " + arrs + "000x" + arrs + "000 array-----------------------");  //deleted for CSV
	    //testing out runtime
	    System.out.println("\nRuntime for worst case:  (only shown the first 10 trials) \n");
	    while(trial <= 1000){
		long startTime = System.nanoTime();
		search(bigtest, bigtest[bigtest.length-1][0]); //code being tested 
		long estimatedTime = System.nanoTime() - startTime;
		if(trial <= 15){
		    System.out.println("trial " + trial + "," + estimatedTime + " nanoseconds.");
		}
		trial++;
		ave += estimatedTime;
	    }
	    System.out.println("Average,"+ (ave/1000) + " nanoseconds.");

	    trial = 1;
	    ave = 0;
	    System.out.println("\nRuntime for best case:  (only shown the first 10 trials) \n");
	    while(trial <= 1000){
		long startTime = System.nanoTime();
		search(bigtest, bigtest[0][bigtest.length-1]); //code being tested 
		long estimatedTime = System.nanoTime() - startTime;
		if(trial <= 15){
		    System.out.println("trial " + trial + "," + estimatedTime +" nanoseconds.");
		}
		trial++;
		ave += estimatedTime;
	    }
	    System.out.println("Average,"+ (ave/1000) + " nanoseconds.");
	    arrs += 1;
	}	    				     	
    }//end of main	    
}


