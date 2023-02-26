package nhanvien;
public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double Luong_Max;
public NhanVien(String tenNhanVien,double luongCoBan,double heSoLuong,double Luong_Max) {
    this.tenNhanVien=null;
    this.luongCoBan=0;
    this.heSoLuong=0;
    this.Luong_Max=0;
}   
public String getTenNhanVien() {
    return this.tenNhanVien;
}
public double getLuongCoBan() {
    return this.luongCoBan;
}
public double getHeSoLuong() {
    return this.heSoLuong;
}
public double getluong_Max() {
    return this.Luong_Max;
}
public void setTenNhanVien() {
    this.tenNhanVien=tenNhanVien;
}
public void setLuongCoBan() {
    this.luongCoBan=luongCoBan;
}
public void setHeSoLuong(double a) {
    this.heSoLuong=heSoLuong;
}
public void setluong_Max() {
    this.Luong_Max=Luong_Max;
} 

public double tinhLuong() {
    double Luong=this.luongCoBan*this.heSoLuong;
    return Luong;
}

public boolean tangLuong(double a) {
    setHeSoLuong(a);
    if (Luong()>this.Luong_Max) {
        return false;
    } else {
        return true;
    }
}
private double Luong() {
      throw new UnsupportedOperationException("Not supported yet."); 
    }

public void inTTin() {
    System.out.println("ten nhan vien"+ tenNhanVien + "luong co ban" + luongCoBan + "he so luong "+ heSoLuong+"luong toi da"+Luong_Max);
}

   
}

    
