package concept;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Testex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigDecimal aint=new BigDecimal(85.698);
		BigDecimal bint=new BigDecimal(2);
		System.out.println(aint);
		System.out.println(bint);
		BigDecimal a2int=new BigDecimal(99.9995);
		BigDecimal b2int=new BigDecimal(7);
		System.out.println(a2int);
		System.out.println(b2int);

		MathContext mc = new MathContext(9, RoundingMode.HALF_DOWN);
//		BigDecimal div1=aint.divide(bint,mc);
//		div1 = div1.setScale(3, BigDecimal.ROUND_HALF_UP);
//		BigDecimal div2=a2int.divide(b2int,mc);
//		div2 = div2.setScale(3, BigDecimal.ROUND_HALF_UP);
//		System.out.println(div1.add(div2));
		BigDecimal output=(aint.divide(bint,mc).add(a2int.divide(b2int,mc))).setScale(3, BigDecimal.ROUND_HALF_UP);
		System.out.println("Divided and Add= "+output);
		
		System.out.println("Multiply= "+aint.multiply(bint));
        System.out.println("Add= "+aint.add(bint));
        System.out.println("Subtract= "+aint.subtract(bint));
        System.out.println("Divide= "+aint.divide(bint));
		
		DecimalFormat decformat = new DecimalFormat("0.000000");
	}

	private static BigDecimal roundedBigDecimal(double d, int i) {
		// TODO Auto-generated method stub
//		MathContext context=new MathContext(i,RoundingMode.HALF_UP);
		BigDecimal convertedNumber= new BigDecimal(d);
		convertedNumber.setScale(i, BigDecimal.ROUND_HALF_UP);
//		convertedNumber.round(context);
		return convertedNumber;
	}

}
