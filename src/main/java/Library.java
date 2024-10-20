import java.util.ArrayList;
import java.util.List;
public class Library {

    private List<Lendable> items;

    public Library() {
        items = new ArrayList<>();

    }

    public void addItem(Lendable item) {
        items.add(item);
        System.out.println("Added to Library: " + ((Book) item).getTitle());

    }
     public void removeItem(Lendable item) {
        items.remove(item);
        System.out.println("Removed from library:" + ((Book) item).getTitle());
     }

     public List<Lendable> getAvailabeItems() {
        List<Lendable> availableItems = new ArrayList<>();
        for (Lendable item : items){
            if (!availableItems.contains(item)){
                availableItems.add(item);
            }
        }
        return availableItems;
     }
     public void displayAvailableItems() {
        System.out.println("Available Items in the library");
        for (Lendable item: items) {
            System.out.println(((Book) item).getTitle() + "by" + ((Book) item).getAuthor());
        }
     }
}
