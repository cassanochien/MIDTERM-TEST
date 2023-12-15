public class GiangVienLinkedList {
    private GiangVienNode head = null;
    private int size = 0;

public void addFirst(GiangVien giangvien) {
    GiangVienNode newNode = new GiangVienNode(giangvien);
    newNode.setNext(head);
    head = newNode;
    size++;
}
public GiangVienNode removeFromFront() 
    {
        if(isEmpty()) {
        return null; 
        }
        GiangVienNode removedNode = head;
        head = head.getNext();
        size --;
        removedNode.setNext(null);
        return removedNode;
    }
    public void printList()
    {
        GiangVienNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.println(""+current);
            System.out.println("-> ");
            current = current.getNext();
    }
        System.out.println("NULL");
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty() 
    {
        return head == null;
    }
}