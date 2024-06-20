package player;

import java.util.Scanner;

public class Player {
    String name;
    String emailID;
    String contactNo;
    String address;
    int age;

    public void setPlayerDetails(String name, String emailID, String contactNo, String address, int age) {
        this.name = name;
        this.emailID = emailID;
        this.contactNo = contactNo;
        this.address = address;
        this.age = age;
    }
    public void setPlayerName(String name) {
        this.name = name;
    }
    
    public void getPlayerDetails() {
        System.out.println("Player name: " + this.name);
        System.out.println("Player emailID: " + this.emailID);
        System.out.println("Player contactNo: " + this.contactNo);
        System.out.println("Player adress: " + this.address);
        System.out.println("Player age: " + this.age);
    }
    public String getPlayerName() {
        return this.name;
    }

     public void setPlayerDetailsFromUserInput(Player p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter the player name: ");
        String name = sc.nextLine();
        System.out.println("Enter the player email ID: ");
        String emailID = sc.nextLine();
        System.out.println("Enter the player contact number: ");
        String contactNo = sc.nextLine();
        System.out.println("Enter the player address: ");
        String address = sc.nextLine();
        System.out.println("Enter the player age: ");
        int age = sc.nextInt();

        p.setPlayerDetails(name, emailID, contactNo, address, age);
    }


}
