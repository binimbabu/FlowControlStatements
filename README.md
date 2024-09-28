Flow Control Statements

Flow Control Statements determines the way which statements gets executed during runtime. Flow Control Statement are divided into 2 selection statements, iterative statements and transfer statements. Selection statements do have the if-else and switch. Selection statements assist do conditional statements. Iterative statements do have 'while', 'do-while', 'for', 'for-each'. Iterative statements helps to loop through and iterate through same statements multiple times. Transfer statements do have 'break', 'continue', 'return', 'try-catch-finally' and 'assert'. Transfer statements helps to transfer the code of execution from one point of code to another point of code.


if-else

if(conditional expression){
//code to be executed
}
else{
//line of code
}


The conditional expression evaluate a Boolean to true or false and it cannot be another values. If the conditional expression evaluates true then body of if ( contains line of code) will be executed. If the conditional expression evaluates false then body of 'if' ( contains line of code) will not be executed, instead body of 'else' will be executed. 

Example


package com.bini.babu;

public class IfElse {

	public static void main(String[] args) {
		int x = 10, y = 20;
		if (x > y) {
			System.out.println("X is greater");
		} else {
			System.out.println("Y is greater");
		}
	}

}


Output

Y is greater


Nested if-else

Nested if-else have multiple conditions. we can have if block followed by any number of 'if-else' block and at last else block.


if(conditional expression){
//code to be executed
}
else if(conditional expression){
//code to be executed
}
else if(conditional expression){
//code to be executed
}
else{
//line of code
}


Example


package com.bini.babu;

public class IfElse {

	public static void main(String[] args) {
		int x = 10, y = 10;
		if (x > y) {
			System.out.println("X is greater");
		} else if (x < y) {
			System.out.println("Y is greater");
		} else {
			System.out.println("X and Y are equal");
		}
	}

}



Output

X and Y are equal





Switch

syntax:-

switch(expression){
 case 1: Action 1;
         break;
 case 2: Action 2;
         break;
 default: default action;
}

Here 1, 2 in the above syntax are labels. Each label which matches the expression its body will get executed. the 'break' statement breaks from the case's body. If none of the cases are executed the we have the default case which will be executed.

Example

package com.bini.babu;

public class SwitchExample {
	public static void main(String[] args) {
		int x = 1;
		switch (x) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default case");
		}
	}

}



Output

Case 1


Here 'x' matches with case 1 since x = 1 , hence case 1 gets executed and the break switches to outside the switch. The type of expression supported include byte, short, char, int, ENUM and String. The labels used in switch should be constants and variables cannot be used. In switch if we don't give break in the case then the code execution goes to next case. Default case are executed only if neither of the case in switch does not get executed. 



Switch Fall through


package com.bini.babu;

public class SwitchExample {
	public static void main(String[] args) {
		int x = 1;
		switch (x) {
		case 1:
		case 2:
			System.out.println("Common code");
			break;
		default:
			System.out.println("Default case");
		}
	}

}

Output

Common code


If case 1 and case 2 have the same line of code to be executed then we give case 1: and give the body of code in case 2 this is called switch fall through. Duplicate labels are not allowed.



While


syntax:

while(condition){
//body of loop
}


The body of while loop gets executed until 'condition' in the while loop gets false.

Example

package com.bini.babu;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

}

Output

1
2
3
4
5
6
7
8
9


do-while

We use do-while loop if we want to execute the do-while loop atleast once. After executing once the do-while loop, we check if the condition matches true , if the condition evaluates true then the do-while loop gets executed again. When the condition evaluates false then next time do-while loop will not be executed. 

Syntax:-


do{
//code
}while(condition);



package com.bini.babu;

public class DoWhileloop {

	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.println("Inside the loop");
		} while (x < 1);
	}

}


Output

Inside the loop




For Loop


Syntax:-

for(initialization; condition; increment or decrement){
//loop body
}


'condition' need to be true to go through the for loop, 'initialization' declares a variable,  'increment or decrement' will  increment or decrement the initialized variable. each time when go through the for loop it should go through  increment or decrement and condition is checked each time to be true before the for loop is executed.

Example


package com.bini.babu;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}



Output

1
2
3
4
5
6
7
8
9
10



Break

break statement breaks the line of normal execution of code.

package com.bini.babu;

public class ForLoopBreak {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

}


Output

1
2
3
4


When the condition i == 5 condition is matched then the break will breaks the normal flow of code and gets out of for loop.



Labelled Block and Break



package com.bini.babu;

public class LabelledBlock {

	public static void main(String[] args) {
		int x = 20;
		l1: {
			System.out.println("Inside the labelled block"); // example of labelled block
			if (x == 20) {
				break l1;
			}
		}
	}

}



Output

Inside the labelled block






Continue

Continue will skip the current iteration in a loop. Continue has to be used inside the loop.


Example

package com.bini.babu;

public class ContinueTransferStatment {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}


Output
1
3
5
7
9


If even number (i.e  i%2==0) then the loop will not execute since 'continue' is used (as per the above code. Hence, only odd numbers are used.




final variable

final int b =20;

if 'final' is given to 'b' then 'b' will mad constant by 'final'.


