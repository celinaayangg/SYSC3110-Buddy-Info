import java.util.*;

public class AddressBook {

    // instance variable
    private ArrayList<BuddyInfo> buddyCollection;

    // default constructor
    public AddressBook() {
        buddyCollection = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyCollection.add(buddy);
            System.out.println("Added Buddy");
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyCollection.remove(buddy);
            System.out.println("Removed Buddy");
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Marcus", "Ottawa", "647-000-0000");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
