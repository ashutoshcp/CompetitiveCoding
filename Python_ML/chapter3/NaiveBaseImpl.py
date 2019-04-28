import os
import glob
import Python_ML.StringUtils as StringUtils
from nltk.corpus import names
from nltk.stem import WordNetLemmatizer

e_mails, labels = [], []

file_path = 'enron1/spam'
for fileName in glob.glob(os.path.join(file_path, '*.txt')):
    with open(fileName, 'r', encoding="ISO-8859-1") as infile:
        e_mails.append(infile.read())
        labels.append(1)

file_path = 'enron1/ham'
for fileName in glob.glob(os.path.join(file_path, '*.txt')):
    with open(fileName, 'r', encoding="ISO-8859-1") as infile:
        e_mails.append(infile.read())
        labels.append(0)

print("e_mails: ", len(e_mails))
print("labels: ", len(labels))

all_names = set(names.words())
lemmatizer = WordNetLemmatizer()


def clean_text(docs):
    cleaned_docs = []
    for doc in docs:
        cleaned_docs.append(
            ' '.join([lemmatizer.lemmatize(word.lower())
                      for word in doc.split()
                      if StringUtils.letters_only(word)
                      and word not in all_names
                      ]))
    return cleaned_docs


cleaned_emails = clean_text(e_mails)
print(cleaned_emails[0])
