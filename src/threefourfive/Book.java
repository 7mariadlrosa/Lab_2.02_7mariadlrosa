
public class Book {
    private String name;
    private String author;
    private int pages;
    private boolean hasBeenRead;

    public Book(String name, String author, int pages, boolean hasBeenRead) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.hasBeenRead = hasBeenRead;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setHasBeenRead(boolean hasBeenRead) {
        this.hasBeenRead = hasBeenRead;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean hasBeenRead() {
        return hasBeenRead;
    }

}