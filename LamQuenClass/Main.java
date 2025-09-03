package BaiTapVeNha.LamQuenClass;

public class Main {
    class SinhVien { 
        private String maSv , hoTen ; 
        private int tuoi ;
        private static int soLuong = 0 ; 
        public SinhVien(String maSv, String hoTen, int tuoi) {
            this.maSv = maSv;
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            soLuong++;
    }
        public void setThongTin(String maSv, String hoTen, int tuoi) {
            this.maSv = maSv;
            this.hoTen = hoTen;
            this.tuoi = tuoi;
    }
        public String HienThiThongTIn ( ) { 
            return this.maSv+" " +this.hoTen  +" " + this.tuoi ;

        }
        public int HienThiSoLuong () { 
            return soLuong ;
        }
    }
    public static void main(String[] args) {
        
    }
    
}
