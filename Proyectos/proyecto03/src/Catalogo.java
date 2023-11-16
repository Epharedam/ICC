import java.util.ArrayList;
import java.util.List;

public class Main implements Interfaz {

    private List<Item> itemList;

    public Main() {
        this.itemList = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public void removeItem(Item item) {
        itemList.remove(item);
    }

    @Override
    public List<Item> getAllItems() {
        return new ArrayList<>(itemList);
    }

    @Override
    public List<Item> searchItems(String keyword) {
        List<Item> searchResults = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getName().contains(keyword)) {
                searchResults.add(item);
            }
        }
        return searchResults;
    }

    @Override
    public Item getItemDetails(String itemId) {
        for (Item item : itemList) {
            if (item.getId().equals(itemId)) {
                return item;
            }
        }
        return null; // Return null if item with the specified ID is not found
    }

    @Override
    public void updateItemDetails(String itemId, Item updatedItem) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId().equals(itemId)) {
                itemList.set(i, updatedItem);
                break;
            }
        }
    }

    @Override
    public int getTotalItems() {
        return itemList.size();
    }

    @Override
    public void clearCatalog() {
        itemList.clear();
    }

    public static void main(String[] args) {
        // Create an instance of the Main class
        Main mainCatalog = new Main();

        // Display all items in the catalog
        System.out.println("All items in the catalog:");
        List<Item> allItems = mainCatalog.getAllItems();
        for (Item item : allItems) {
            System.out.println(item);
        }

        
    }
}

