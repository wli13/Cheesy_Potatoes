##### Cheesy_Potatoes
##### Alexia Leong, Wenting Li, Bing Li
##### L#00 - But What Does the Data Say?
##### 2018-02-08

                                       Matrix Execution Algorithm Efficiency Lab
**Hypothesis**

Our matrix search algorithm should be able to find the target element in O(n) runtime at its worst, and be able to find the target element in O(1) run time if it is the best case scenario. The worst case scenario occurs when the user intends to search for an element at the bottom left corner, while the best case occurs if the user intends to search for an element at the top right corner.

**Background**

We know that O(1) is constant run time, which means that no matter the size of our input, the time it takes our code to search for the target should remain approximately the same. We also know that O(n) scales linearly with the amount of output. Theoretically, twice amoung of data will roughly takes about twice amount of time to execute. 

**Experiment with Methodology Explained**

We began by creating a 2D array with size 1000, because we believe that a larger array will show clearer difference in run time as we expand the array. The array does **not** use randomly generated elements and it is use over and over again to maintain consistency. We did not implement randomness because in a randomly generated array, the elements can be repeated, so the worst case scenario might appear in the array somewhere else before the algorithm actually reach the bottom left corner. Instead, we numbered our array sequentially. For each of the fixed array we created, we execute the matrix search algorithm 1000 times to minimize the effect of outliers. After the 1000th passes of the 1000 x 1000 array, the average is calculated and the first 15 trials are printed to show sample performances for debugging purposes. We 
