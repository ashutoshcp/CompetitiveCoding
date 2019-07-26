Input:	{ } and letters (a - z)
{ } -> Code block
a - z -> Block var name
Output: Hyphens(-) and block var name

{ i { i j i } k i i }
-iki*i*
--iji*

{ a b { b { c } a } b }
---c
-abb*
--ba

{ i j k { i j { k }  i } i { i j k } i }
---k
--iji*
--ijk
-ijki*i*



Stack:
Counter = 0

---k
--iji*
--ijk
-ijki*i*





{ a b c }
{ a b a }
void getOutput(String input) {
	Int counter = 0;
	Stack<Character> stack = new Stack();
	for(char c: input.tocharArray() ) {
		if(c == ‘{’ || isLowerAlphabet(c)) {
			If (c == ‘{’) counter++;
			stack.push(c);
}
if(c ==  ‘}’ ) {
	String out = “”;
	while(stack.peek()!= ‘{’) {
	   Char c = stack.pop();
               if(stringContainsChar(out, c)) {
		Out =  out + c + “*”;
   } else {
Out = c + out;
}
}
stack.pop();
print(String.repeat(-) + out)
counter--;
}
	}

}
A b a
Counter: 1
Stack: { a b c
Vector: c b a
A b c
A b a
A b a*
Out: abc
Stack: cba