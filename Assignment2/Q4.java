import java.util.Stack;

public class Q4 {
	public static int calculate(int op2, String opr, int op1) {
		switch(opr) {
		case "+":return op1+op2;
		case "-":return op1-op2;
		case "*":return op1*op2;
		case "/":return op1/op2;
		}
		return 0;
	}
	public static int postfixEvaluation(String expression) {
		String[] arr = expression.split(" ");
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
				int op2 = st.pop();
				int op1 = st.pop();
 				int res = calculate(op2,arr[i],op1);
 				st.push(res);
			}else {
				int element = Integer.parseInt(arr[i]);
				st.push(element);
			}
		}
		return st.peek();
	}
	public static int prefixEvaluation(String expression) {
		String[] arr = expression.split(" ");
		Stack<Integer> st = new Stack<>();
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
				int op1 = st.pop();
				int op2 = st.pop();
				int res = calculate(op2,arr[i],op1);
				st.push(res);
			}else {
				int element = Integer.parseInt(arr[i]);
				st.push(element);
			}
		}
		return st.peek();
	}
	
	public static void main(String[] args) {
		String expression = "15 5 + 10 2 - *";
		int res = postfixEvaluation(expression);
		System.out.println(res);
		
		
		String expression1 = "- + 100 * 20 5 / 50 2";
		int res1 = prefixEvaluation(expression1);
		System.out.println(res1);
		
	}

}
