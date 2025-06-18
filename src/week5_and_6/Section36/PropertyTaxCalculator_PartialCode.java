package week5_and_6.Section36;

public class PropertyTaxCalculator_PartialCode {
    public static void main(String[] args) {

    }

    public static double calculatePropertyTax(double assessedValue, double taxRate, double exemptions) {
        double taxableValue = (assessedValue - exemptions) * taxRate / 100;
        return taxableValue;
    }
}
