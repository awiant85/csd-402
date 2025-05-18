// Author: Austin Wiant - Date: 2025-05-18 - Assignment: Module 12 - Yearly Auto Service Calculator
// Purpose: Demonstrate method overloading to calculate yearly auto service cost

public class AutoServiceCalculator {

    // Constant for standard service charge
    public static final double STANDARD_SERVICE_CHARGE = 150.00;

    /**
     * Returns the standard yearly auto service cost.
     */
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    /**
     * Returns the standard service charge plus oil change.
     * @param oilChangeCost The cost of the oil change
     */
    public static double yearlyService(double oilChangeCost) {
        return STANDARD_SERVICE_CHARGE + oilChangeCost;
    }

    /**
     * Returns the total service charge with oil change and tire rotation.
     * @param oilChangeCost The cost of the oil change
     * @param tireRotationCost The cost of the tire rotation
     */
    public static double yearlyService(double oilChangeCost, double tireRotationCost) {
        return STANDARD_SERVICE_CHARGE + oilChangeCost + tireRotationCost;
    }

    /**
     * Returns the total service cost minus the coupon discount.
     * @param oilChangeCost The cost of the oil change
     * @param tireRotationCost The cost of the tire rotation
     * @param couponDiscount The discount to be applied
     */
    public static double yearlyService(double oilChangeCost, double tireRotationCost, double couponDiscount) {
        return STANDARD_SERVICE_CHARGE + oilChangeCost + tireRotationCost - couponDiscount;
    }

    /**
     * Main method to test each yearlyService method twice.
     */
    public static void main(String[] args) {
        // Test 1: Standard service only
        System.out.println("Test 1a - Standard Service: $" + String.format("%.2f", yearlyService()));
        System.out.println("Test 1b - Standard Service: $" + String.format("%.2f", yearlyService()));

        // Test 2: Service + oil change
        System.out.println("Test 2a - Service + Oil Change: $" + String.format("%.2f", yearlyService(39.99)));
        System.out.println("Test 2b - Service + Oil Change: $" + String.format("%.2f", yearlyService(45.00)));

        // Test 3: Service + oil change + tire rotation
        System.out.println("Test 3a - Service + Oil + Tires: $" + String.format("%.2f", yearlyService(39.99, 24.99)));
        System.out.println("Test 3b - Service + Oil + Tires: $" + String.format("%.2f", yearlyService(45.00, 30.00)));

        // Test 4: Service + oil + tires - coupon
        System.out.println("Test 4a - Full Service with Coupon: $" + String.format("%.2f", yearlyService(39.99, 24.99, 20.00)));
        System.out.println("Test 4b - Full Service with Coupon: $" + String.format("%.2f", yearlyService(45.00, 30.00, 25.00)));
    }
}
