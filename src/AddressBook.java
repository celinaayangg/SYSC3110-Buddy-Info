import java.util.*;

public class AddressBook {

    // instance variable
    private ArrayList<BuddyInfo> buddyCollection;

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyCollection.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyCollection.remove(buddy);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
