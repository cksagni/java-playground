package functionalprogramming;

import java.sql.Time;
import java.util.TimeZone;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {

    public static void main(String[] args) {
        Supplier<Double> getRandom = Math::random;
        DoubleSupplier getRandomPrim = Math::random;
        System.out.println(getRandom.get());
        var startTime = System.nanoTime();
        int iterations = 1_000_000;
        int million = 1_000_000;
        for (int i = 0; i < iterations; i++)
            getRandom.get();
        var endTime = System.nanoTime();
        var elapsedTime = (endTime - startTime)/million;
        System.out.println("Total time in ms for Autoboxing Supplier interface: " + elapsedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++)
            getRandomPrim.getAsDouble();
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime)/million;
        System.out.println("Total time in ms for Autoboxing Supplier interface: " + elapsedTime);
    }
}
