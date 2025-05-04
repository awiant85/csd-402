// Author: Austin Wiant - Date: May 4, 2025 - Assignment: Module 10 – Abstract Division Class
// Purpose: Implements an InternationalDivision subclass that extends Division and adds country and language fields

public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor requires division name, account number, country, and language
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Displays the details of the international division
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
