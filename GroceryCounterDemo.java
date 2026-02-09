
public class GroceryCounterDemo {
    public static void main(String[] args) {
        
        GroceryCounter counter = new GroceryCounter();
        
        System.out.println("=== Grocery Counter Demo ===\n");
        
        // Example 1
        System.out.println("Starting value: " + counter.total());
        System.out.println();
        
        // Example 2: From problem statement
        System.out.println("Pressing tens (2x), tenths (1x), hundredths (1x):");
        counter.tens();
        counter.tens();
        counter.tenths();
        counter.hundreths();
        System.out.println("Display: " + counter.total());
        System.out.println("Overflows: " + counter.overflows());
        System.out.println();
        
        // Reset
        counter.clear();
        
        // Example 3: From problem statement
        System.out.println("Pressing ones (11x):");
        for (int i = 0; i < 11; i++) {
            counter.ones();
        }
        System.out.println("Display: " + counter.total());
        System.out.println("Overflows: " + counter.overflows());
        System.out.println();
        
        // Reset
        counter.clear();
        
        // Example 4: Overflow demonstration
        System.out.println("Demonstrating overflow (pressing tens 15 times):");
        for (int i = 1; i <= 15; i++) {
            counter.tens();
            System.out.println("  Press " + i + ": " + counter.total() + 
                             " (Overflows: " + counter.overflows() + ")");
        }
        System.out.println();
        
        // Reset
        counter.clear();
        
        // Example 5: Maximum value
        System.out.println("Setting to maximum (9999):");
        for (int i = 0; i < 9; i++) {
            counter.tens();
            counter.ones();
            counter.tenths();
            counter.hundreths();
        }
        System.out.println("Display: " + counter.total());
        System.out.println();
        
        System.out.println("Adding one more hundredth:");
        counter.hundreths();
        System.out.println("Display: " + counter.total() + " (wrapped around!)");
        System.out.println("Overflows: " + counter.overflows());
    }
}
