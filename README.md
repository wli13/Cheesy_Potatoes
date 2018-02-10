##### Cheesy_Potatoes
##### Alexia Leong, Wenting Li, Bing Li
##### L#00 - But What Does the Data Say?
##### 2018-02-08

                                       Matrix Execution Algorithm Efficiency Lab
**Hypothesis**

Our matrix search algorithm should be able to find the target element in O(n) runtime at its worst, and be able to find the target element in O(1) run time if it is the best case scenario. The worst case scenario occurs when the user intends to search for an element at the bottom left corner, while the best case occurs if the user intends to search for an element at the top right corner.

**Background**

We know that O(1) is constant run time, which means that no matter the size of our input, the time it takes our code to search for the target should remain approximately the same. We also know that O(n) scales linearly with the amount of output. Theoretically, twice the amount of data will roughly take about twice the time to execute. In addition to the run time, the amount of space used to store all data processed by the algorithm can affect the efficiency as well, because allocating space for a really large array generally takes the PC longer time to process. 


**Experiment with Methodology Explained**

We began by creating a 2D array with size 1000, because we believe that a larger array will show clearer difference in run time as we expand the array. The array does **not** use randomly generated elements and it is use over and over again to maintain consistency. We did not implement randomness because in a randomly generated array, the elements can be repeated, so the worst case scenario might appear in the array somewhere else before the algorithm actually reach the bottom left corner. Instead, we numbered our array sequentially, so the target in search is consistent for all compilations. For each of the fixed array we created, we execute the matrix search algorithm 2000 times (1000 times for the best case and 1000 times for the worst case) to minimize the effect of outliers. After all the passes are done for both cases, the average is calculated and the first 15 trials are printed to show sample performances for debugging purposes. This process is repeated for size 1000 array to size 10,000 array (size is incremented by 1000 each run). We are confident that we are accurately timing my search function, not extraneous task because we calculate the search time by taking the total runtime of the code before and after each search, so we are only timing the runtime of our search function

**Results**

We included the results from one run of the code in a Spreadsheet linked below. 

![image of graph](https://github.com/wli13/Cheesy_Potatoes/blob/master/graph.png)

CSV File Data (this is only the data from one run, but usually after each run, the CSV file will be overwritten):

https://docs.google.com/spreadsheets/d/1ikRJ-QTuYK6c-fMnRVm_rDXvm-QsNf78tHjwnC8kOT0/edit?usp=sharing

**Conclusion**

After analyzing our data from multiple runs, we noticed that the average runtimes for both the best and worst cases for a 1000x1000 array tends to be longer than the 2000x2000 array. After that, the runtimes increase for the worst cases in a linear fashion. This is because when opening a new session in the terminal, the SYSTEM has to allocate memory to its tasks, and that might slow it down at first. The worst cases' average runtime starting from 2000x2000 shows linear correlation. For example, the average runtime for the worst case of a 2000x2000 array is 14785 nanoseconds and for an array that is 4000x4000, the average runtime for the worst case doubles, its time is 27533 nanoseconds. Also, when we calculate the correlation factor of the line of best fit, the result is 0.96 (1 being the strongest). As for the best case scenario, the graph we generated at first did not show constant runtime, but when we calculated the equation of the line of best fit, the slope of the equation is very close to zero, which means that the size of the array had little to no effect on the runtime. When we placed the best case and the worst case runtime in the same graph, the best case has a flat slope.

We also tested how the System.out.print affects the run time of our algorithm. At first we thought that removing the System.out.print will increase efficiency of the algorithm, but the result turns out to be the exact opposite. For example, the run time without any SOP for a 1000 x 1000 array (worst case) is 64725 nanoseconds, but the run time with SOP for the array of a same size is 21298 nanoseconds.

Other than the SOP issue, our results matches with our hypothesis!

 

