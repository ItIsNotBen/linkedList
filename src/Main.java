import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Node myNode = new Node(13);
        myNode.display();
        int[] data = {13, 7, 19, 68, 0};
        linkedList myList = new linkedList(data);
        myList.display();
        myList.add(99);
        myList.display();

    }
}
