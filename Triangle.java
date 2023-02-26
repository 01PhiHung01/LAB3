/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author HP
 */
public class Triangle {
    private float width;
    public float getWidth() {
        return this.width;
    }
    private float height;
    public float getHeight() {
        return this.height;
    }
public void getTriangle(float width, float height) {
    getWidth();
    getHeight();
}  
public void setWidth(float width) {
    this.width=width;
}
public void setHeight(float height) {
    this.height=height;
}
public String toString() {
    return width+" "+height;
}
}
