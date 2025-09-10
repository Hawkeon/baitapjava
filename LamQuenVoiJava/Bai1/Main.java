package BaiTapVeNha.LamQuenVoiJava.Bai1;

class HinhChuNhat { 
    private double chieuDai,chieuRong ; 
    public HinhChuNhat (double chieuDai , double chieuRong ) { 
        this.chieuDai = chieuDai ; 
        this.chieuRong = chieuRong ; 
    }
    public double chuVi () { 
        return this.chieuDai*2 + this.chieuRong*2 ;  
    }
    public double dienTich () { 
        return this.chieuDai * this.chieuRong ; 
    }
    @Override 
    public String toString() { 
        return String.format("Chu Vi: %.2f, Dien Tich: %.2f", this.chuVi(), this.dienTich()); 
    }

    
}

public class Main {
    public static void main(String[] args) {
        HinhChuNhat a  = new HinhChuNhat(1, 2) ; 
    }
}
