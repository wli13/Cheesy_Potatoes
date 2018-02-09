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

We included the results from one run of the code in a Spreadsheet linked below. The first table lists (to be continued..)

https://docs.google.com/spreadsheets/d/1ikRJ-QTuYK6c-fMnRVm_rDXvm-QsNf78tHjwnC8kOT0/edit?usp=sharing

**Conclusion**
  * Points to talk about in the conclusion
      *  For a newly opened process in terminal, the SYSTEM has to allocate memory to its tasks, and that might slow it down at first. As shown in the trials data, the first few trials are way larger than the average, it also makes the run time of 1000 x 1000 array bigger
      *  Talk about the SOP here
      *  Talk about how the best case scenario did not show constant run time at first and why we decided to put the two cases in one graph
      * You can add more


