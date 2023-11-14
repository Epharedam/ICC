// Catalog interface
public interface catalogo {

    // Method to add an item to the catalog
    void addItem(Item item);

    // Method to remove an item from the catalog
    void removeItem(Item item);

    // Method to retrieve a list of all items in the catalog
    List<Item> getAllItems();

    // Method to search for items based on a given keyword
    List<Item> searchItems(String keyword);

    // Method to get details of a specific item
    Item getItemDetails(String itemId);

    // Method to update the details of an existing item in the catalog
    void updateItemDetails(String itemId, Item updatedItem);

    // Method to get the total number of items in the catalog
    int getTotalItems();

    // Method to clear all items from the catalog
    void clearCatalog();
}
