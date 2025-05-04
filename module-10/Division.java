// Author: Austin Wiant - Date: May 4, 2025 - Assignment: Module 10 – Abstract Division Class
// Purpose: Defines an abstract Division superclass with shared attributes and an abstract display method

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor requires division name and account number
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented in subclasses
    public abstract void display();
}
