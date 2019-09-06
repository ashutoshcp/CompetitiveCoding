#!/bin/bash
# Incase you have to take input, please take it from file named 'input' (without quotes) [e.g. cat input]
# Print your final output to console. Do not redirect to another file.
# E.g. Suppose the question is to print the content of a file.
#      Your solution should be 'cat input'(without quotes) instead of 'cat input > output'. That's it!
# Your code starts from here...
#!/bin/bash
l=$(cat input | head -n 1 | cut -d' ' -f1)
r=$(cat input | head -n 1 | cut -d' ' -f2)
cat input | head -n $r | tail -n $((r-l+1))


#Write a bash script to print all the lines of the input which are in the given range.
#
#The first line of the input contains two integers l and r separated by space.
#
#You have to print all the lines of the file input which are in the range of [l, r].
#
#Example:
#
#Assume that the input has the following content.
#
#10 15
#Line 2
#Line 3
#Line 4
#Line 5
#Line 6
#Line 7
#Line 8
#Line 9
#Line 10
#Line 11
#Line 12
#Line 13
#Line 14
#Line 15
#Line 16
#Line 17
#Line 18
#Line 19
#Line 20
#Your bash script should output the following
#
#Line 10
#Line 11
#Line 12
#Line 13
#Line 14
#Line 15