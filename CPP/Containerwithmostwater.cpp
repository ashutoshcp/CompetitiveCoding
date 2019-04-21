int Solution::maxArea(vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int l = 0;
    int r = A.size()-1;
    int max_area = (r-l)*min(A[l],A[r]);
    while(l<=r){
        if(A[l]<=A[r])
            l++;
        else
            r--;
        max_area=max(max_area, (r-l)*min(A[l],A[r]));
    }
    return max_area;
}
