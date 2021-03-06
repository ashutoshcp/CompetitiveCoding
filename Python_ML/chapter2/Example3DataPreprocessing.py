from sklearn.feature_extraction.text import CountVectorizer
from sklearn.datasets import fetch_20newsgroups
from nltk.corpus import names
from nltk.stem import WordNetLemmatizer

from sklearn.cluster import KMeans
import matplotlib.pyplot as plot

from sklearn.decomposition import NMF

import Python_ML.StringUtils as StringUtils

cv = CountVectorizer(stop_words="english", max_features=500)
groups = fetch_20newsgroups()
cleaned = []
all_names = set(names.words())
lemmatizer = WordNetLemmatizer()

for post in groups.data:
    cleaned.append(' '.join([
        lemmatizer.lemmatize(word.lower())
        for word in post.split()
        if StringUtils.letters_only(word) and word not in all_names
    ]))

transformed = cv.fit_transform(cleaned)
print(cv.get_feature_names())

# Kmeans
km = KMeans(n_clusters=20)
km.fit(transformed)
labels = groups.target
plot.scatter(labels, km.labels_)
plot.xlabel('NewsGroup')
plot.ylabel('Cluster')
plot.show()

# NMF (Non negative matrix factorization)
nmf = NMF(n_components=100, random_state=43).fit(transformed)
for topic_idx, topic in enumerate(nmf.components_):
    label = '{}: '.format(topic_idx)
    print(label, " ".join([cv.get_feature_names()[i]
                           for i in topic.argsort()[:-9:-1]]))
