public class linkedList {


    private Node head;
    private int numNodes;


    public linkedList() {
        // create an empty list
        head = null;
        numNodes = 0;
    }


    public linkedList(int[] values) {
        numNodes = values.length;
        head = new Node(values[0]); // assuming the array has atlesat 1 item
        Node adding;
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            adding = new Node(values[i]);
            current.setNext(adding);
            current = current.getNext();
        }
        numNodes = values.length;
    }

        public void display() {
            // goal is to display each element on the same line in the console
            Node current = head;
            while (current != null) {
                System.out.print(current.getValue()+", ");
                current = current.getNext();
            }
            System.out.println();
        }


    public int size() {
        return numNodes;
    }


    public void add(int v) {
            // create a new node with the value, add it to the end of the list
            Node nodeToAdd = new Node(v);
            Node current = head;

             while (current.getNext() != null) {
                 current = current.getNext();
             }
            current.setNext(nodeToAdd);
        }



        public void addFirst(int v) {
        Node nodeToAdd = new Node(v);
        Node first = head;

        first.setNext(nodeToAdd);
        }

        public void add(int index, int v) {
        Node nodeToAdd = new Node(v);



    public void remove(int index) {
        
            }

    }
