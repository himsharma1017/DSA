public class bst {
    int value;
    bst leftChild, rightChild;

    public bst(int value){
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public static bst insert(int value, bst current){
        if(current==null){
            bst node1 = new bst(value);
            return node1;
        }
        else{
            if(current.value>value){
                current.leftChild = insert(value, current.leftChild);
            }

            else
            current.rightChild = insert(value, current.rightChild);

        }
        return current;
    }

    public static void preOrder(bst current){
        if(current==null)
            return;

        else{
            System.out.println(current.value + " ");
            preOrder(current.leftChild);
            preOrder(current.rightChild);
        }
    }

    public static void inOrder(bst current){
        if(current==null)
            return;

        else{
            inOrder(current.leftChild);
            System.out.println(current.value + " ");
            inOrder(current.rightChild);
        }
    }

    public static void postOrder(bst current){
        if(current==null)
            return;

        else{
            postOrder(current.leftChild);
            postOrder(current.rightChild);
            System.out.println(current.value + " ");
        }
    }

    public static boolean search(int value, bst current) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }
        if (value < current.value) {
            return search(value, current.leftChild);
        } else {
            return search(value, current.rightChild);
        }
    }

    public static bst delete(int value, bst current) {
        if (current == null)
            return current;

        if (value < current.value)
            current.leftChild = delete(value, current.leftChild);

        else if (value > current.value)
            current.rightChild = delete(value, current.rightChild);

        else if (value == current.value) {
            if (current.leftChild != null && current.rightChild != null) {
                int min = current.rightChild.value;
                bst temp = current.rightChild;
                while (temp.leftChild != null) {
                    min = temp.leftChild.value;
                    temp = temp.leftChild;
                }
                current.value = min;
                current.rightChild = delete(min, current.rightChild);
            } 
            else if (current.leftChild == null)
                return current.rightChild;
            else if (current.rightChild == null)
                return current.leftChild;
            else
                return null;
        }
        return current;
    }
    public static void main(String[] args) {
        bst object1 = new bst(50);   
        insert(10, object1); 
        insert(15, object1); 
        insert(32, object1); 
        insert(80, object1); 
        insert(90, object1); 
        System.out.println("This is inOrder Traversal");
        inOrder(object1);
        System.out.println("This is PostOrder Traversal");
        postOrder(object1);
        System.out.println("This is PreOrder Traversal");
        preOrder(object1);





    }
}
