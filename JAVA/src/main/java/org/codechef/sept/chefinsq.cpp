#include <bits/stdc++.h>
using namespace std;

void makeCombiUtil(vector<int>& A, vector<vector<int> >& ans, vector<int>& tmp, int n, int left, int k) {
	if (k == 0) {
		ans.push_back(tmp);
		return;
	}

	for (int i = left; i <= n; ++i) {
		tmp.push_back(A[i]);
		makeCombiUtil(A, ans, tmp, n, i + 1, k - 1);
		tmp.pop_back();
	}
}

vector<vector<int> > makeCombi(vector<int>& A,int n, int k) {
	vector<vector<int> > ans;
	vector<int> tmp;
	makeCombiUtil(A,ans, tmp, n, 1, k);
	return ans;
}

// Driver code
int main() {
    int t;
    cin>>t;
    while(t--) {
        int n,k, *A;
        cin>>n>>k;
        A = new int[n];
        for(int i=0; i<n; i++) {
            cin>>A[i];
        }
        sort(A, A+n);
        int sum = 0;
        for(int i=0;i<k; i++) {
            sum+=A[i];
        }
        vector<vector<int> > ans = makeCombi(A, n, k);
        int c = 0;
        for (int i = 0; i < ans.size(); i++) {
            int pSum = 0;
        	for (int j = 0; j < ans[i].size(); j++) {
        		pSum += ans.at(i).at(j);
       		}
       		if(pSum==sum) {
        	    c++;
       		}
        }
        cout<<sum<<endl;
    }
	return 0;
}
