
package vuongtron;
public class HinhVuong {
    int canh1,canh2;
public HinhVuong() {
    if (canh1 != canh2) {
        System.out.println("Day khong phai la hinh vuong ");
    }    
}
public HinhVuong(int canh1, int canh2) {
    this.canh1=canh1;
    this.canh2=canh2;
}
public int getCanh1() {
    return this.canh1;
}    
public int getCanh2() {
    return this.canh2;
}
public void setCanh1(int canhone) {
    this.canh1=canh1;
}
public void setCanh2(int canhtwo) {
    this.canh2=canh2;
}
public String toString() {
    return canh1+" "+canh2;
}
}
public class HinhTron {
    double r;
public HinhTron(double r) {
    this.r=r;
}
public double getR() {
    return this.r;
}
public void setR(double ra) {
    this.r=r;
}
public String toString() {
    return r+" ";
}





    
}
