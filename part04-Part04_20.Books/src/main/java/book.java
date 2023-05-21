
public class book {
    private String title;
    private int page;
    private int year;
    
    public book(String title, int page, int year){
        this.title = title;
        this.page = page;
        this.year = year;
    }
    
    public String toString(){
        return this.title + ", " + this.page + " pages, " + this.year;
    }
    
    public String title(){
        return this.title;
    }
}
