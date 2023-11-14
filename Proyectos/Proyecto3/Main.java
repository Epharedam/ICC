public class Main {

    public static void main(String[] args) {
        // Create an instance of a class that implements the Catalog interface
        Catalog catalog = new YourCatalogImplementation(); // Replace with the actual implementation class

        // Sample usage of the catalog methods
        Item item1 = new Item("ID001", "Product A", 19.99);
        Item item2 = new Item("ID002", "Product B", 29.99);

        // Add items to the catalog
        catalog.addItem(item1);
        catalog.addItem(item2);

        // Display all items in the catalog
        System.out.println("All items in the catalog:");
        List<Item> allItems = catalog.getAllItems();
        for (Item item : allItems) {
            System.out.println(item);
        }

        // Search for items based on a keyword
        String keyword = "Product";
        System.out.println("Items containing keyword '" + keyword + "':");
        List<Item> searchResults = catalog.searchItems(keyword);
        for (Item result : searchResults) {
            System.out.println(result);
        }

        // Get details of a specific item
        String itemIdToSearch = "ID001";
        Item searchedItem = catalog.getItemDetails(itemIdToSearch);
        System.out.println("Details of item with ID '" + itemIdToSearch + "':");
        System.out.println(searchedItem);

        // Update the details of an existing item
        Item updatedItem = new Item("ID001", "Updated Product A", 24.99);
        catalog.updateItemDetails(itemIdToSearch, updatedItem);

        // Display updated details
        System.out.println("Updated details of item with ID '" + itemIdToSearch + "':");
        System.out.println(catalog.getItemDetails(itemIdToSearch));
    }
}
