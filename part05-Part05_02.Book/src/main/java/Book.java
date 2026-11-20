public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pageCount){
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return title;
    }

    public int getPages(){
        return pageCount;
    }

    @Override
    public String toString(){
        return getAuthor() + ", " + getName() + ", " + getPages() + " pages";
    }
}
