public class BuddyInfo {

    // instance variables
    private String name;
    private String address;
    private String phoneNumber;

    // getter method
    public String getName() {
        return name;
    }

    // constructor taking parameters
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // default constructor
    public BuddyInfo() {
        this.name = "Celina";
        this.address = "1 Perry St";
        this.phoneNumber = "647-982-4924";
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        BuddyInfo buddyInfo = new BuddyInfo("Homer", "Carleton", "000-000-0000");
        System.out.println(buddyInfo.getName() + " Hello");
    }
}

