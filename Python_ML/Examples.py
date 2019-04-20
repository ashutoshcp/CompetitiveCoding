from nltk.corpus import names

from nltk.stem.porter import PorterStemmer

from nltk.stem import WordNetLemmatizer

from sklearn.datasets import fetch_20newsgroups

import numpy as np

import seaborn as sns
import matplotlib.pyplot as plt

print(len(names.words()))

porter = PorterStemmer()
print(porter.stem('machines'))
print(porter.stem('learning'))

lemma = WordNetLemmatizer()
print(lemma.lemmatize('machines'))
print(lemma.lemmatize('learning'))

groups = fetch_20newsgroups()
print(groups.keys())
print(groups['target_names'])
print(groups.target)


print(np.unique(groups.target))
print(groups.data[0])
print(groups.target[0])
print(groups.target_names[groups.target[0]])
print(len(groups.data[0]))
print(len(groups.data[1]))

print(sns.distplot(groups.target))
plt.show()

