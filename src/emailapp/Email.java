package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // Constructor to receive

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created:" + this.firstName + " " + this.lastName);

        // Call a method Department
        this.department=setDepatment();
        System.out.println("Department: "+ this.department);

        //Call a method password
        this.password=randomPassword(8);
        System.out.println("your password is:"+this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." +  lastName.toLowerCase() + "@" + this.companySuffix;
        System.out.println(email);
    }

    // Ask for the department

    private String setDepatment() {
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "Dev";
        } else if (depChoice == 3) {
            return "Acc";
        } else {
            return " ";
        }
    }

        // Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPURSTUWXYZ0123456789";
        char[] password=new char[length];
        for (int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);


        }



        // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

        // Set the alternate email
public void setAlternateEmail(String altEmail){
        this.alternateEmail   = altEmail;

}
public void changePassword(String password){
                this.password = password;
}
public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY_NAME:" +" " + firstName + " " + lastName + " " +
                "\nCOMPANY EMAIL: "+ email + "\n MAIL BOX CAPACIT: " + "\n"+ mailboxCapacity + " mb ";
    }
        // Change the password

}