/*
Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:

int isMatch(const char *s, const char *p)
Some examples:

isMatch("aa","a") → 0
isMatch("aa","aa") → 1
isMatch("aaa","aa") → 0
isMatch("aa", "a*") → 1
isMatch("aa", ".*") → 1
isMatch("ab", ".*") → 1
isMatch("aab", "c*a*b") → 1
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
*/
#include<bits/stdc++.h>
using namespace std;
int isMatch(const string &s, const string &p) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int m = s.length();
    int n = p.length();
    bool match[m+1][n+1];
    memset(match,false,sizeof(match));
    match[0][0] = true;
    for(int i=0; i<=n; i++)
		if(i>1 && p[i-1]=='*')
    		match[0][i] = match[0][i-2];
    
    char cs, cp;
	for(int i=1; i<=m; i++){
    	cs = s[i-1];
    	for(int j=1; j<=n; j++){
    		cp =p[j-1];
    		if(cp=='*'){
    			cp = p[j-2];
    			if(cs==cp || cp=='.')
    				match[i][j] = match[i-1][j] || match[i-1][j-1];
    				match[i][j] = match[i][j] || match[i][j-2];
    		}
    		else if(cs==cp || cp=='.') 
    			match[i][j] = match[i-1][j-1];
    	}
    }
    return match[m][n];
}
int main(){
    cout<<isMatch("aab", "c*a*b")<<endl;    
    return 0;
}
