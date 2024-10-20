import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Lendable> checkedOutItems;

    public Customer(String name) {
        this.name = name;
        checkedOutItems= new ArrayList<>();

    }

    public void checkOutItem(Lendable item){
        if (!checkedOutItems.contains(item)) {
            checkedOutItems.add(item);
            item.borrow();
            System.out.println(name + "has checked out: "+ ((Book) item).getTitle());

        }else {
            System.out.println(name + "already checked out this item.");
        }
    }
     public void returnItem(Lendable item) {
        if (checkedOutItems.contains(item)) {
            checkedOutItems.remove(item);
            item.returnItem();
            System.out.println(name + "has returned: " + ((Book) item).getTitle());

        }else {
            System.out.println(name + " has not borrowed this item.");

        }
     }

}
