

package bookstore2;
import java.sql.Date;

public class A_BOOK {
    private String Title;
    private String Author;
    private Date Release;
    private double The_price;
    private final int id;

    public A_BOOK(int id,String Title, String Author, Date Release, double The_price) {
        this.id=id;
        this.Title = Title;
        this.Author = Author;
        this.Release = Release;
        this.The_price = The_price;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public Date getRelease() {
        return Release;
    }

    public double getThe_price() {
        return The_price;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setRelease(Date Release) {
        this.Release = Release;
    }

    public void setThe_price(float The_price) {
        this.The_price = The_price;}
   
    @Override
    public String toString() {
        return "A_BOOK has a Title" + Title + ",Author" + Author + ", Release=" + Release + "and a price =" + The_price ;
    }
    
    
    
}
