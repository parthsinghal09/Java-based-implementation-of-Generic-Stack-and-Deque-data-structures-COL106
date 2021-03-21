public class ArrayDeque implements DequeInterface {

	Object[] ar = new Object[1];
	private int f = 0; 
	private int r = 0; 
	private int N = 1;
	private int length = 0;

	public void insertFirst(Object o){
		//you need to implement this

		if (length == 0) {

			ar[0] = o;
			f = 0;
			r = 0;
			length = 1;

		} else if (length == N) {

			Object[] ar1 = new Object[2*N];
			for(int i = 0; i<N; i++){
				ar1[i] = ar[(f + i)%N];
			}
			f = 0;
			r = N - 1;
			ar = ar1; 
			N = 2*N;

			f = (N + f - 1)%N;
			ar[f] = o;
			length = length + 1; 

		} else {

			f = (N + f - 1)%N;
			ar[f] = o;
			length = length + 1;

		}

	}

	public void insertLast(Object o){
		//you need to implement this

		if (length == 0) {

			ar[0] = o;
			f = 0;
			r = 0;
			length = 1;

		} else if (length == N) {

			Object[] ar1 = new Object[2*N];
			for(int i = 0; i<N; i++){
				ar1[i] = ar[(f + i)%N];
			}
			f = 0;
			r = N - 1;
			ar = ar1; 
			N = 2*N;
			
			r = (r + 1)%N;
			ar[r] = o;
			length = length + 1; 

		} else {

			r = (r + 1)%N;
			ar[r] = o;
			length = length + 1;

		}

	}

	public Object removeFirst() throws EmptyDequeException{
		//you need to implement this

		if (length!=0){

			Object o1 = ar[f];

			f = (f + 1)%N;

			length = length - 1;

			return o1;

		} else {

			String s = "";
			throw new EmptyDequeException(s);

		}
		
	}

	public Object removeLast() throws EmptyDequeException{
		//you need to implement this

		if (length!=0){

			Object o1 = ar[r];

			r = (N + r - 1)%N;

			length = length - 1;

			return o1;

		} else {

			String s = "";
			throw new EmptyDequeException(s);

		}
		
	}

	public Object first() throws EmptyDequeException{
		//you need to implement this

		if (length!=0){

			Object o1 = ar[f];

			return o1;

		} else {

			String s = "";
			throw new EmptyDequeException(s);

		}
		
	}

	public Object last() throws EmptyDequeException{
		//you need to implement this

		if (length!=0){

			Object o1 = ar[r];

			return o1;

		} else {

			String s = "";
			throw new EmptyDequeException(s);

		}
		
	}

	public int size(){
		//you need to implement this

		return length;

	}

	public boolean isEmpty(){
		//you need to implement this

		return (length == 0);

	}

	public String toString(){
		//you need to implement this

		String s = "[";

		for(int i = 0; i<length; i++){

			if(i == (length - 1)){
				s = s + ar[(f + i)%N].toString();
			} else {
				s = s + ar[(f + i)%N].toString() + ", ";
			}
			
		}
		s = s + "]";

		return s;

	}  
}