#!/bin/bash
# Incase you have to take input, please take it from file named 'input' (without quotes) [e.g. cat input]
# Print your final output to console. Do not redirect to another file.
# E.g. Suppose the question is to print the content of a file.
#      Your solution should be 'cat input'(without quotes) instead of 'cat input > output'. That's it!
# Your code starts from here...
grep -P '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$' input

#Given a text file input that contains list of phone numbers (one per line).
#
#Write a bash script to print all valid phone numbers.You may assume that a valid phone number must appear in one of the following two formats:
#
#(xxx) xxx-xxxx
#xxx-xxx-xxxx
#You may also assume each line in the text file must not contain leading or trailing white spaces.
#
#Sample Input
#
#987-123-4567
#123 456 7890
#(123) 456-7890
#Sample output
#
#987-123-4567
#(123) 456-7890