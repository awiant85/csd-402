// Author: Austin Wiant - Date: May 4, 2025 - Assignment: Module 10 – Abstract Division Class
// Purpose: Creates instances of InternationalDivision and DomesticDivision and displays their details

public class UseDivision {
    public static void main(String[] args) {
        // Create two DomesticDivision instances
        DomesticDivision techSupportDivision = new DomesticDivision("Tech Support", 101, "California");
        DomesticDivision salesDivision = new DomesticDivision("Sales", 102, "New York");

        // Create two InternationalDivision instances
        InternationalDivision developmentDivision = new InternationalDivision("Development", 201, "Germany", "German");
        InternationalDivision marketingDivision = new InternationalDivision("Marketing", 202, "Japan", "Japanese");

        // Display information for each division
        techSupportDivision.display();
        salesDivision.display();
        developmentDivision.display();
        marketingDivision.display();
    }
}
