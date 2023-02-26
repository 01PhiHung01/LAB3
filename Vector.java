
package vector;
public class Vector {
    double x;
    double y;
    double z;
public Vector(double x,double y, double z) {
    this.x=x;
    this.y=y;
    this.z=z;
}
public Vector add(Vector v) {
    return new Vector(this.x+v.x,this.y+v.y,this.z+v.z);
}
public Vector sub(Vector v) {
    return new Vector(this.x-v.x,this.y-v.y,this.z-v.z);
}
public Vector mul(Vector v) {
    return new Vector(this.x*v.x,this.y*v.y,this.z*v.z);
}








    
}