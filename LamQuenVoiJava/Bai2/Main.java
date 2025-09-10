package BaiTapVeNha.LamQuenVoiJava.Bai2;

import java.util.ArrayList;
import java.util.Collections;

class TaiKhoan { 
    private String soTaiKhoan, chuTaiKhoan; 
    private double soDu; 
    private static double interest = 0.07;   

    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan) { 
        this.soTaiKhoan = soTaiKhoan; 
        this.chuTaiKhoan = chuTaiKhoan; 
        this.soDu = 0; 
    }

    public void napTien(String soTaiKhoan, double money) { 
        if (soTaiKhoan.equals(this.soTaiKhoan)) { 
            this.soDu += money; 
        }
    }

    public void rutTien(String soTaiKhoan, double money) { 
        if (soTaiKhoan.equals(this.soTaiKhoan) && this.soDu >= money) { 
            this.soDu -= money; 
        }
    }

    public double tinhLai() {
        return this.soDu * (interest / 12);
    }

    public static void thayDoiLaiSuat(double newInterest) {
        interest = newInterest;
    }

    public static double getLaiSuat() {
        return interest;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    @Override 
    public String toString() { 
        return String.format("So Tai Khoan: %s, Chu Tai Khoan: %s, So Du: %.2f", 
            soTaiKhoan, chuTaiKhoan, soDu);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<TaiKhoan> danhSachTK = new ArrayList<>();
        
       
        danhSachTK.add(new TaiKhoan("1001", "Nguyen Van A"));
        danhSachTK.add(new TaiKhoan("1002", "Tran Thi B"));
        danhSachTK.add(new TaiKhoan("1003", "Le Van C"));

        
        danhSachTK.get(0).napTien("1001", 5000000);
        danhSachTK.get(1).napTien("1002", 3000000);
        danhSachTK.get(2).napTien("1003", 7000000);

        
        System.out.println("Danh sach tai khoan:");
        for (TaiKhoan tk : danhSachTK) {
            System.out.println(tk + " - Lai suat thang: " + tk.tinhLai());
        }

        
        Collections.sort(danhSachTK, (a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));

        System.out.println("\nDanh sach tai khoan sau khi sap xep:");
        for (TaiKhoan tk : danhSachTK) {
            System.out.println(tk);
        }
    }

    
    public static TaiKhoan timKiemTK(ArrayList<TaiKhoan> danhSach, String soTK) {
        return danhSach.stream()
                      .filter(tk -> tk.getSoTaiKhoan().equals(soTK))
                      .findFirst()
                      .orElse(null);
    }
}
