file_path_ham = 'enron1/ham/0007.1999-12-14.farmer.ham.txt'

with open(file_path_ham, 'r') as infile:
    ham_sample = infile.read()
infile.close()
print(ham_sample)


file_path_spam = 'enron1/spam/0058.2003-12-21.GP.spam.txt'

with open(file_path_spam, 'r') as infile1:
    spam_sample = infile1.read()
infile1.close()
print(spam_sample)
