# fileinputoutput
Write a program that uses a Class that sorts data into an Array of doubles and then can average every 5th double in that exists in the array

The Runner for this Class should be able to read in a txt file (“Lab3Binput.txt”) and then output to a file (Lab3BOutput.txt) the number of elements that were averaged, the value of each element and the average value of those elements in the format shown below:

Line 1:  	<number of elements averaged - should be an integer>

Line 2+:  	<each element listed on its own line - these should be doubles>

Last Line: 	Average: <the average rounded to 2 decimal places> 
The class should be called SortNAvg.  The runner file (containing the main) should be called SortNAvgRunner.

You program should run for any data size - I will be testing it on a file containing 1000+ doubles.

# Sample Data
11
2.12
11.7
16.8
8.19
7.31
11.56
12.11
13.5
14.2
11.6
18.6


# Sorted Data
2.12
7.31
8.19
11.56
11.6
11.7
12.11
13.5
14.2
16.8
18.6 

In the above sample the two 5th numbers would be averaged and the return file would contain: 

2
11.6
16.8
Average: 14.20
