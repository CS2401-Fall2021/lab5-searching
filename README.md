# lab5-searching (100 pts)
## Background

You are a developer, working in a large company named Froogle. There are thousands of developers who are all writing code very quickly!
But alas! someone broke your code sometime last night, and you need to figure out when it happened (so you can know what to fix). Froogle's codebase uses git, so you have a 
List of changes that have been made between now and the last time you checked that the code worked.  Furthermore,
you have a set of tests you can run that tells you if the code worked or not, but they take a long time to run, so you want to be strategic about which ones you test.

## Our inputs
We have a list of n Changes,with ids ranging from 0 to n-1.

Since this is an emulation, to create this list we need to know how many changes we are modeling, and the index of the first failure. 


Our emulateCodeSubmissions method therefore takes in a number of changes to look at, a target index where the change goes bad, and will create an output array of booleans
that determine if that chage passes or not. This is already done for you and should be called in both findViaLinearSearch and findViaBinarySearch methods.


### Input assumptions
In an ideal world, we would have both our inputs be positive numbers and have the index of the error always be between 0 and n-1. But our method takes in integers, which can be negative. 


> If we get into an input where there is an invalid number of changes, or index of the bad change:
> YOUR CODE SHOULD RETURN -1


## Our output
We want to return how many times we need to run our (hypothetical) tests to determine our bad change-essentially we need to count how many times we access values in the array we get from the emulateCodeSubmissions method. This is a number, so our output (or return type) is an integer.


## Approach 1: Linear search (30pts)


Implement findViaLinearSearch(int numberOfChanges, int indexOfFailure), which returns the number of steps it takes to find the bad change. (5 pts)
* What should be returned if indexOfFailure>=numberOfChanges? (5 pts)
* Write a one-line description of your approach (5 pts)
* What is the big-O notation for how long this algorithm takes to run asssuming the worst case scenario? (2.5pts)
* What about the best-case scenario? Justify (2.5pts)
* Write 3 test cases in Main.java to ensure that your method works as intended. What are you testing in each case? (10pts)

## Approach 2: Binary search (35 pts)
Implement findViaBinarySearch(int numberOfChanges, int indexOfFailure), which returns the number of steps it takes to find the bad change. (10pts)
* What should be returned if indexOfFailure is negative? (5pts)
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
