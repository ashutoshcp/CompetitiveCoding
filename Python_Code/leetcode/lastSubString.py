class Solution:
    def lastSubstring(self, s: str) -> str:
        mx = ""
        for i in range(len(s)):
            mx = max(mx, s[i:])

        return mx
