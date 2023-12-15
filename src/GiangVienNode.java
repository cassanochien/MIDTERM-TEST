public class GiangVienNode {
    private GiangVien giangvien;
    private GiangVienNode next;

    public GiangVienNode() {
    }
    public GiangVienNode(GiangVien GiangVien) {
        this.giangvien = GiangVien;
    }

    public GiangVien getGiangvien() {
        return giangvien;
    }

    public GiangVienNode getNext() {
        return next;
    }

    public void setGiangvien(GiangVien giangvien) {
        this.giangvien = giangvien;
    }

    public void setNext(GiangVienNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "GiangVienNode [giangvien=" + giangvien + ", next=" + next + "]";
    }
}
