public class Book implements Lendable{
    private String title;
    private String author;
    private boolean borrowed;

    public Book (String title, String author) {
        this.title = title;
        this.author  = author;
        this.borrowed = false;

    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Borrowd: "+ title);
        } else {
            System.out.println("This book is already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Returned: "+ title);

        }else{
            System.out.println("This book was not borrowed");
        }
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
