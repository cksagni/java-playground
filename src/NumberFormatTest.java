import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        final Locale INR = new Locale("en", "IN");
        NumberFormat currency = NumberFormat.getCurrencyInstance(INR);
        System.out.println(currency.format(333333333));

        System.out.println(NumberFormat.getPercentInstance().format(0.1));
        System.out.println(NumberFormat.getPercentInstance().format(10));

    }
}
