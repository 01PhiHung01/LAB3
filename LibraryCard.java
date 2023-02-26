
package librarycard;
   public class LibraryCard {
       public long lbCode;
       public String owner;
       public int borrowCount;
   
    public LibraryCard() {}
    public LibraryCard(long lbCode,String owner,int borrowCount) {
        this.lbCode=lbCode;
        this.owner=owner;
        this.borrowCount=borrowCount;
    }
    public long getLbCode() {
        return this.lbCode;
    }
    public String getOwner() {
        return this.owner;
    }
    public int getBorrowCount() {
        return this.borrowCount;
    }
    public void setLbCode(long code) {
        this.lbCode=lbCode;
    }
    public void setOwner(String owner) {
        this.owner=owner;
    }
    public void checkOut(int num) {
    }
    public String toString() {
        return lbCode + " " + owner + " " + borrowCount;
    }
    

            
            
            
            
            
}