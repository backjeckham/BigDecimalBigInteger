import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalBigInteger {

    public static void main (String [] args) {

        BigDecimal bostonCondo = new BigDecimal ("1234567.8901");
        BigDecimal santaMonicaCondo = new BigDecimal ("2345678.9012");
        BigDecimal dcCondo = new BigDecimal ("1987654.3210");
        BigDecimal seattleCondo = new BigDecimal ("2918736.5421");
        BigDecimal condoTotals = new BigDecimal ("0");

        condoTotals = bostonCondo.add(santaMonicaCondo).add(dcCondo).add(seattleCondo);
        System.out.println("The total cost of the condos are : " + condoTotals + "\n");

        BigInteger bostonSalesCount = new BigInteger ("1234567");
        BigInteger santaMonicaSalesCount = new BigInteger ("2345678");
        BigInteger dcSalesCount = new BigInteger ("1987654");
        BigInteger seattleSalesCount = new BigInteger ("2918736");

        BigInteger salesCountTotals = new BigInteger("0");

        salesCountTotals = bostonSalesCount.add(santaMonicaSalesCount).add(dcSalesCount).add(seattleSalesCount);
        System.out.println("The total cost of the condos are : " + salesCountTotals + "\n");



    }
}
