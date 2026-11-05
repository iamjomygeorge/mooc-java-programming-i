
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Book)){
            return false;
        }

        Book comparedItem = (Book) compared;

        if(name.equals(comparedItem.name) && publicationYear == comparedItem.publicationYear){
            return true;
        }

        return false;
    }
}
