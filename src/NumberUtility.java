import java.text.NumberFormat;
import java.util.Random;

public class NumberUtility {

	public static String asPercent(double num){
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		return percent.format(num);
	}
	
	public static String asCurrency(double num){
		boolean neg = (num<0);
		if(neg)num=num*-1;
		NumberFormat number = NumberFormat.getCurrencyInstance();
		number.setMaximumFractionDigits(2);
		number.setMinimumFractionDigits(2);
		String str=number.format(num);
		if(neg)str="-"+str;
		return str;
	}
	
	public static String toLength(double num, int places){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(places);
		number.setMaximumFractionDigits(places);
		return number.format(num);
	}
	
	public static int randBetween(int min, int max){
		Random rand = new Random();
		if(min>max){
			int temp = max;
			max = min;
			min=temp;
		}
		return min+rand.nextInt(max-min+1);
	}
	
	public static double minOf(double a, double b){
		if(a>b)return b;
		return a;
	}
	
	public static double maxOf(double a, double b){
		if(a<b)return b;
		return a;
	}
}
