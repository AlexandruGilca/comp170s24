/*
 * Use the starter code below to write a program that assigns values to three
 * variables for the following information:
 *  - your first name,
 *  - your favorite movie, and
 *  - your hometown
 * Then use the variables above to produce the following output with the underlined 
 * parts indicating data specific to you, stored in the variables you created.
 *   
 * Hello, my name is Frodo, I am from Hobbiton, and my favorite movie is Young Frankenstein
 *                   -----            --------                           ------------------
 * 
 * DO NOT USE any tools that require to be imported, ie, do not use the import command.
 *
 * To save this assignment, make sure you commit your changes to your GitHub repository,
 * following the instructions in Sakai. IF YOU DO NOT COMMIT THE CHANGES, IT IS POSSIBLE THAT
 * YOUR WORK MAY BE LOST AND YOU MAY HAVE TO START ALL OVER AGAIN.
 */
public class A01 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("\n\nHello there! What is your first name? ");
        String firstName = sc.nextLine();
        System.out.print("\n\nWhat is your favorite movie? ");
        String favoriteMovie = sc.nextLine();
        System.out.print("\n\nWhat is your hometown? ");
        String homeTown = sc.nextLine();
        System.out.printf("\n\nHello, my name is " + firstName + ", I am from " + homeTown + ", and my favorite movie is " + favoriteMovie + ".\n\n");
        
    } // method main
} // class A01
