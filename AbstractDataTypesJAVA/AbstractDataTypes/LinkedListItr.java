package mustafa.evdzhan.AbstractDataTypes;


public class LinkedListItr implements java.util.Iterator<Object> {
  private Node currentPosition;
	 
	public LinkedListItr(Node firstNode) {
	currentPosition=firstNode.getNext();	
	}
	public boolean hasNext() {
		 
		return currentPosition != null;
	}

	@Override
	public Object next() {
		 Object returned = currentPosition.getData();
		 currentPosition=currentPosition.getNext();
		return returned;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	 }

}