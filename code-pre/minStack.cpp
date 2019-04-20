/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) – Push element x onto stack.
pop() – Removes the element on top of the stack.
top() – Get the top element.
getMin() – Retrieve the minimum element in the stack.
Note that all the operations have to be constant time operations.

Questions to ask the interviewer :

Q: What should getMin() do on empty stack? 
A: In this case, return -1.

Q: What should pop do on empty stack? 
A: In this case, nothing. 

Q: What should top() do on empty stack?
A: In this case, return -1
NOTE : If you are using your own declared global variables, make sure to clear them out in the constructor. 
See Expected Output
NotesAll Notes


*/


stack<int> st,minv;
MinStack::MinStack() {
    while(!st.empty())
        st.pop();
    while(!minv.empty())
        minv.pop();
}


void MinStack::push(int x) {
    if(minv.empty() || (x<minv.top()))
        minv.push(x);
    st.push(x);
}

void MinStack::pop() {
    if(!st.empty()){
        int x=st.top();
        st.pop();
        if(x==minv.top())
            minv.pop();
    }
}

int MinStack::top() {
    if(st.empty())
        return -1;
    else{
       return st.top(); 
    }
}

int MinStack::getMin() {
    if(minv.empty())
        return -1;
    return minv.top();
}

