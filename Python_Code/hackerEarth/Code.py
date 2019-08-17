from functools import reduce


def writer():
    title = 'HackerEarth'
    name = (lambda x: title + ' ' + x)
    return name


who = writer()
print(who('Fremont'))

L = [lambda y: y ** 1,
     lambda y: y ** 2,
     lambda y: y ** 3]

for f in L:
    print(f(3))

hck = [5, 8, 10, 20, 50, 100]
t = reduce((lambda a, b: a + b), hck)
print(t)

