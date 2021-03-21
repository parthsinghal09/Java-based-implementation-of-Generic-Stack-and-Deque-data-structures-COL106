// You should utilise your implementation of ArrayDeque methods to implement this
public class Stack implements StackInterface {	

	private ArrayDeque ar = new ArrayDeque();

	public void push(Object o){
    	//you need to implement this

		ar.insertLast(o);

  	}

	public Object pop() throws EmptyStackException{
    	//you need to implement this
		try{

			return ar.removeLast();

		}
		catch (EmptyDequeException e){

			String s = "";
			throw new EmptyStackException(s);

		}

	}

	public Object top() throws EmptyStackException{
    	//you need to implement this
		try{

			return ar.last();

		}
		catch (EmptyDequeException e){

			String s = "";
			throw new EmptyStackException(s);

		}

	}

	public boolean isEmpty(){
    	//you need to implement this

		return ar.isEmpty();

	}

    public int size(){
    	//you need to implement this

    	return ar.size();

    }
}