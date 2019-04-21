//@ASHUTOSH KUMAR GUPTA@
vector<int> Solution::maxone(vector<int> &A, int B) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    vector<int> res;
    int l=0, r=0;
    int nZero = 0;
    int width = -1;
    int start = 0, end =0;
    while(r<A.size()){
        if(nZero <= B){
            if(A[r]==0)
                nZero++;
            r++;
        }

        if(nZero > B){
            if(A[l]==0)
                nZero--;
            l++;
        }

        if(nZero<=B){
            if(r-l+1>width){
                width = r-l+1;
                start = l;
                end = r;
            }
        }
    }
    for(int i=start;i<end;i++){
        res.push_back(i);
    }
    return res;
}
