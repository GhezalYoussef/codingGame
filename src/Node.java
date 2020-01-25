public class Node {

    Node left;
    Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node recursiveFind(int value) {
        Node currentNode = this;
        if (currentNode.value == value)
            return currentNode;
        if (value < currentNode.value && currentNode.left != null) {
            currentNode = currentNode.left;
            return currentNode.recursiveFind(value);
        }
        if (value > currentNode.value && currentNode.right != null) {
            currentNode = currentNode.right;
            return currentNode.recursiveFind(value);
        }
        return null;

    }


    public Node iterativeFind(int value) {

        Node currentNode = this;
        while (currentNode != null) {
            if (value == currentNode.value) {
                return currentNode;
            }

            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }

        }
        return null;

    }



    public static void main(String[] args) {

        Node small = new Node(7);
        Node left = new Node(6);
        Node right = new Node(9);


        small.left = left;
        small.right = right;

        Node result = small.recursiveFind(6);
        if (result == null)
            System.out.println("value not found");
        else
            System.out.print(result.value);

    }
}
