class Book{
    private String title;
    private int id;
    private String author;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setTitle(String titl){
        this.title = titl;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
public class BookInfo extends Book{
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setId(45872);
        obj.setTitle("Hello world");
        obj.setAuthor("Saurabh Kumar");
        System.out.println("Book Author is : "+obj.getAuthor()+"\nBook Title is : "+obj.getTitle()+"\nBook Id is : "+obj.getId());

    }
}
