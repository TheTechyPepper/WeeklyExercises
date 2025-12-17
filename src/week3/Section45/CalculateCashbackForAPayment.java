package week5_and_6.Section45;

public class CalculateCashbackForAPayment {
    public static double calculateCashback(String paymentMethod, double purchaseAmount ) {
        if (paymentMethod.equals("cash") && purchaseAmount > 0) {
            return purchaseAmount * 0.03;
        }
        else if (paymentMethod.equals("credit card") && purchaseAmount > 0) {
            return purchaseAmount * 0.02;
        }
        else if (paymentMethod.isEmpty() || purchaseAmount < 0) {
            return purchaseAmount * 0.0;
        }
        return  0.0;
    }

    public static void main(String[] args) {
        double cashbackPayments1 = calculateCashback("cash", 100.0);
        System.out.println(cashbackPayments1);

        double cashbackPayments2 = calculateCashback("credit card", 50.0);
        System.out.println(cashbackPayments2);

        double cashbackPayments3 = calculateCashback("", 200.0);
        System.out.println(cashbackPayments3);

        double cashbackPayments4 = calculateCashback("credit card", 0.0);
        System.out.println(cashbackPayments4);

        double cashbackPayments5 = calculateCashback("debit card", 50.0);
        System.out.println(cashbackPayments5);
    }
}
