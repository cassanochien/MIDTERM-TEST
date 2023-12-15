public class App {
    public static void main(String[] args) throws Exception {
        GiangVien G01 = new GiangVien(111,"Nguyễn Văn","Lợi");
        GiangVien G02 = new GiangVien(111,"Đặng Văn","Nghĩa");
        GiangVien G03 = new GiangVien(222,"Võ Thị Giảng","Quyên");
        GiangVien G04 = new GiangVien(333,"Trần Thị Thanh","Linh");
        GiangVien G05 = new GiangVien(444,"Lee Quỳnh","Trân");
        
            GiangVienLinkedList list = new GiangVienLinkedList ();
            list.addFirst(G01);
            list.addFirst(G02);
            list.addFirst(G03);
            list.addFirst(G04);
            list.addFirst(G05);

            System.out.println(""+list.getSize());
                list.printList();
                list.removeFromFront();
                list.printList();
    }
}
