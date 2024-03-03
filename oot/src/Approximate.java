import java.math.BigDecimal;
import java.math.RoundingMode;

public class Approximate {
	public static void main(String[] args) {
		BigDecimal valHundred = new BigDecimal("100");
		BigDecimal valThousand = new BigDecimal("1000");
		
		for (BigDecimal i = valHundred; i.compareTo(valThousand) <= 0; i = i.add(valHundred))
			System.out.println(i + "\t= " + getNumber(i));
	}

	public static BigDecimal getNumber(BigDecimal number) {
		BigDecimal result = BigDecimal.ZERO;
		BigDecimal valOne = BigDecimal.ONE;

		for (BigDecimal i = valOne; i.compareTo(number) <= 0; i = i.add(valOne)) {
			BigDecimal denominator = i;

			for (BigDecimal k = i.subtract(valOne); k.compareTo(valOne) > 0; k = k.subtract(valOne))
				denominator = denominator.multiply(k);
			
			BigDecimal divide = valOne.divide(denominator, 25, RoundingMode.UP);
			result = result.add(divide);
		}
		
		return result;
	}
}