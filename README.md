# lab5-searching (100 pts)
## Background

You are a developer, working in a large company named Froogle. There are thousands of developers who are all writing code very quickly!
But alas! someone broke your code sometime last night, and you need to figure out when it happened (so you can know what to fix). Froogle's codebase uses git, so you have a 
List of changes that have been made between now and the last time you checked that the code worked.  Furthermore,
you have a set of tests you can run that tells you if the code worked or not, but they take a long time to run, so you want to be strategic about which ones you test.

## Our inputs
We have a list of n changes, with ids ranging from 0 to n-1.

Since this is an emulation, to create this list we need to know how many changes we are modeling, and the index of the first failure. 

Our emulateCodeSubmissions method therefore takes in a number of changes to look at, a target index where the change goes bad, and will create an output array of booleans
that determine if that chage passes or not. This is already done for you and should be called in both findViaLinearSearch and findViaBinarySearch methods.


### Input assumptions
In an ideal world, we would always have at least one value of False somewhere in our array. But that might not be the case.  

> IF THE ARRAY IS ENTIRELY TRUE RETURN -1 


## Our output
We want to return how many times we need to run our (hypothetical) tests to determine when our bad change occurred. In the simulation, this is equivalent to finding the index of the  FIRST "false" in the boolean[]. 
The output will how many times we access different indices 

### Even Length Example: 
If we have the input boolean[] be [true,true,true, true, false, false]


For linear, we will check the values in index 0,1,2,3 and 4.  
4 is the first time it is false, so we return 5.


For binary we will return the number of times we check the value at the MIDPOINT only.

1) check the midpoint between index 0 and 5 (index 2) see that it is true so we want tocompare it to the next value (index 3) to see if it is different (it is not).
2) We know our first false is now between 3 and 5 to be 4. 
3) Check the midpoint value between 3 and 5 (4) to find it is false. Check the previous to see if it is different (it is! We found the first false)
4) Since we've only calculated 2 midpoints, we will return 2 for the full function call.

### ODD Length Example: 
If we have the input boolean[] be [true,true,false, false, false,false,false]
For linear, we will check the values in index 0,1,2. So return 3. 


For binary we will return the number of times we check the value at the MIDPOINT only.

1) check the midpoint between index 0 and 6 (index 3) see that it is false, so we compare it to the previous (index 2) and see it is false as well. 
2) Now we are looking between 0 and 2. We calculate the midpoint (index 1). We check the value and see that it is true, so we compare it to the next value (2).
3) We've found our answer! and calculated 2 midpoints so we return 2.


## Approach 1: Linear search (30pts)


Implement findViaLinearSearch(int startIndex, boolean[] changes), which returns the number of steps it takes to find the bad change. (5 pts)
* What should be returned if our input is [true,true,true]? (5 pts) 
* Write a one-line description of your approach (5 pts)
* What is the big-O notation for how long this algorithm takes to run asssuming the worst case scenario? (2.5pts)
* What about the best-case scenario? Justify (2.5pts)
* Write 3 test cases in Main.java to ensure that your method works as intended. What are you testing in each case? (10pts)

## Approach 2: Binary search (35 pts)
Implement findViaBinarySearch(int startIndex, int endIndex, boolean[] changes), which returns the number of steps it takes to find the bad change. (10pts)
* What should be returned from findViaBinarySearch(0,2,[false,false,false])? (5 pts) 
* Write a one-line description of your approach (5 pts)
* What is the big-O notation for how long this algorithm takes to run asssuming the worst case scenario? (2.5pts)
* What about the best-case scenario? (2.5pts)
* Write 3 test cases in Main.java to ensure that your method works as intended. What are you testing in each case? (10pts)


## Compare (15 pts)
* Implement isBinaryBetter(int numberOfChanges, int indexOfFailure), which returns true if binary search is faster than linear search. (5pts)
* Write a one-line description of your approach (5pts)
* Write 1 test case in Main.java to ensure that your method works as intended. What are you testing in each case? (5pts)

## Additional Reflections (20 pts)
1) Which method is better? Binary or Linear? Why? (5pts)
2) Is the above method ALWAYS better? If not, give an example. (5pts)
3) Assume you are Bad Luck Brain and have the worst luck in the world and always get the worst-case scenario. 
There are 1000 changes to check. 
How many will you need to check for linear? (5pts)
For binary? (5pts)
