class Solution:
    # @param A : list of integers
    # @param B : integer
    # @return a list of integers
    def maxone(self, A, B):
        l, r = 0, 0
        nZero = 0
        width = -1
        start = None
        end = None
        while r < len(A):
            if nZero <= B:
                if A[r] == 0:
                    nZero += 1
                r += 1

            if nZero > B:
                if A[l] == 0:
                    nZero -= 1
                l += 1
            if nZero <= B:
                if r - l + 1 > width:
                    width = r - l + 1
                    start = l
                    end = r

            if r - l + 1 > width:
                width = r - l + 1
                start = l
                end = r
        res = []
        for i in range(start, end):
            res.append(i)
        return res
