package concept;

import java.math.BigDecimal;

public class BankStandardDecimal extends BigDecimal{

	public BankStandardDecimal(double val) {
		super(val);
		// TODO Auto-generated constructor stub
	}


	public  BigDecimal getBankStandardDigit(double val, int decPlaces) {
		// TODO Auto-generated method stub
		BigDecimal convertedNumber= new BigDecimal(val);
		convertedNumber.setScale(decPlaces, BigDecimal.ROUND_HALF_UP);
//		convertedNumber.round(context);
		return convertedNumber;
	}
}
