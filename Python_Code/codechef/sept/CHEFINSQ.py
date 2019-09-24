from itertools import combinations


def k_sub_seq(arr, r):
    return list(combinations(arr, r))


T = int(input())
for t in range(T):
    line = list(map(int, input().split(" ")))
    n = line[0]
    k = line[1]
    arr1 = list(map(int, input().split(" ")))
    arr1.sort()
    index = 0
    target = 0
    while index < k:
        target = target + arr1[index]
        index = index + 1
    temp = arr1
    newIndex = len(arr1) - 1
    while temp[newIndex] > target:
        arr1.remove(temp[newIndex])
        newIndex = newIndex - 1

    output = k_sub_seq(arr1, k)
    res = 0
    for list1 in output:
        k1 = 0
        for i in list1:
            k1 = k1 + i
        if k1 == target:
            res = res + 1
    print(res)
