 #!/bin/bash
# Incase you have to take input, please take it from file named 'input' (without quotes) [e.g. cat input]
# Print your final output to console. Do not redirect to another file.
# E.g. Suppose the question is to print the content of a file.
#      Your solution should be 'cat input'(without quotes) instead of 'cat input > output'. That's it!
# Your code starts from here...
cat input | sed -e 's/\([[:punct:]]\)//g'

# Write a bash script that removes all the punctuations in the given file named input
#
# For this question, assume that all of the following symbols are punctuations:
#
# ! @ # $ % ^ & * ( ) _ - + = { } [ ] ; : ' " ` / > ? . , < ~ | \
#
# Example:
#
# Assume that input has the following content:
#
# This's the sunny day.
# It is the sunny day, we can go out.
# Your script should output the following:
#
# Thiss the sunny day
# It is the sunny day we can go out