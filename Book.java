
package book;

public class Book {
    public String boCode;
    public String boTitle;
    public String boAuthor;
    
    public Book(){}
    
    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode=boCode;
        this.boTitle=boTitle;
        this.boAuthor=boAuthor;
    }
    
    public Book(Book bo) {
        
    }
    public String getBoCode() {
        return this.boCode;
    }
    public String getBoTitle() {
        return this.boTitle;
    }
    public String getBoAuthor() {
        return this.boAuthor;
    }
    
    public void setBoCode(String code) {
        this.boCode=boCode;
    }
    public void setBoTitle(String title) {
        this.boTitle=boTitle;
    }
    public void setBoAuthor(String authorname) {
        this.boAuthor=boAuthor;
    }
    
    public String toString() {
        return boCode+ " " + " " + boTitle + " " + boAuthor;
    }
}
