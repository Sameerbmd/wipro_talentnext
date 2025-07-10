package oopsAndInheritance;
import java.util.*;
class Video{
	private String VideoName;
	private boolean checkout;
	private int rating;
	public Video(String name) {
		this.VideoName=name;
		this.checkout=false;
		this.rating=0;
	}
	public String getName() {
		return VideoName;
	}
	public void doCheckout() {
		checkout=true;
	}
	public void doReturn() {
		checkout=false;
	}
	public void receiveRating(int rating) {
		this.rating=rating;
	}
	public int getRating() {
		return rating;
	}
	public boolean getCheckout() {
		return checkout;
	}
}
class VideoStore{
	private ArrayList<Video>store;
	 public VideoStore() {
	        store = new ArrayList<>();
	    }

	    public void addVideo(String name) {
	        store.add(new Video(name));
	        System.out.println("Video \"" + name + "\" added successfully.");
	    }

	    public void doCheckout(String name) {
	        for (Video v : store) {
	            if (v.getName().equalsIgnoreCase(name)) {
	                v.doCheckout();
	                System.out.println("Video \"" + name + "\" checked out successfully.");
	                return;
	            }
	        }
	        System.out.println("Video \"" + name + "\" not found.");
	    }

	    public void doReturn(String name) {
	        for (Video v : store) {
	            if (v.getName().equalsIgnoreCase(name)) {
	                v.doReturn();
	                System.out.println("Video \"" + name + "\" returned successfully.");
	                return;
	            }
	        }
	        System.out.println("Video \"" + name + "\" not found.");
	    }

	    public void receiveRating(String name, int rating) {
	        for (Video v : store) {
	            if (v.getName().equalsIgnoreCase(name)) {
	                v.receiveRating(rating);
	                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
	                return;
	            }
	        }
	        System.out.println("Video \"" + name + "\" not found.");
	    }

	    public void listInventory() {
	        System.out.println("--------------------------------------------------------");
	        System.out.println("Video Name\t| Checkout Status\t| Rating");
	        for (Video v : store) {
	            System.out.printf("%-15s| %-17s| %d\n", v.getName(), v.getCheckout(), v.getRating());
	        }
	        System.out.println("--------------------------------------------------------");
	    }
}
public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String nameToAdd = sc.nextLine();
                    vs.addVideo(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String nameToCheckout = sc.nextLine();
                    vs.doCheckout(nameToCheckout);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String nameToReturn = sc.nextLine();
                    vs.doReturn(nameToReturn);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String nameToRate = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    sc.nextLine();  // consume newline
                    vs.receiveRating(nameToRate, rating);
                    break;
                case 5:
                    vs.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } while (choice != 6);
	}

}