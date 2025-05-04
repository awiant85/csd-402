// Author: Austin Wiant - Date: May 4, 2025 - Assignment: Module 10 – Abstract Division Class
// Purpose: Implements a DomesticDivision subclass that extends Division and adds a state field

public class DomesticDivision extends Division {
    private String state;

    // Constructor requires division name, account number, and state
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Displays the details of the domestic division
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
