
public class TestGroceryCounter {
    
    // Simple test method 
    public static void testInitialState() {
        System.out.println("Test 1: Initial State");
        GroceryCounter counter = new GroceryCounter();
        
        if (counter.getCount() == 0 && counter.overflows() == 0) {
            System.out.println("✓ PASS: Counter starts at 0000");
        } else {
            System.out.println("✗ FAIL: Counter should start at 0000");
        }
        System.out.println();
    }
    
    public static void testExample2011() {
        System.out.println("Test 2: Example from problem (2011)");
        GroceryCounter counter = new GroceryCounter();
        
        // Press tens twice, tenths once, hundredths once
        counter.tens();
        counter.tens();
        counter.tenths();
        counter.hundreths();
        
        if (counter.getCount() == 2011 && counter.total().equals("$20.11")) {
            System.out.println("✓ PASS: Display shows $20.11");
        } else {
            System.out.println("✗ FAIL: Expected $20.11, got " + counter.total());
        }
        System.out.println();
    }
    
    public static void testExample1100() {
        System.out.println("Test 3: Example from problem (1100)");
        GroceryCounter counter = new GroceryCounter();
        
        // Press ones 11 times
        for (int i = 0; i < 11; i++) {
            counter.ones();
        }
        
        if (counter.getCount() == 1100 && counter.total().equals("$11.00")) {
            System.out.println("✓ PASS: Display shows $11.00");
        } else {
            System.out.println("✗ FAIL: Expected $11.00, got " + counter.total());
        }
        System.out.println();
    }
    
    public static void testOverflow() {
        System.out.println("Test 4: Overflow Test");
        GroceryCounter counter = new GroceryCounter();
        
        // Press tens 10 times (10 * 1000 = 10000, should overflow to 0)
        for (int i = 0; i < 10; i++) {
            counter.tens();
        }
        
        if (counter.getCount() == 0 && counter.overflows() == 1) {
            System.out.println("✓ PASS: Counter overflowed correctly");
        } else {
            System.out.println("✗ FAIL: Expected overflow");
        }
        System.out.println();
    }
    
    public static void testMaxValue() {
        System.out.println("Test 5: Maximum Value (9999)");
        GroceryCounter counter = new GroceryCounter();
        
        // Set to 9999
        for (int i = 0; i < 9; i++) {
            counter.tens();
            counter.ones();
            counter.tenths();
            counter.hundreths();
        }
        
        if (counter.getCount() == 9999 && counter.total().equals("$99.99")) {
            System.out.println("✓ PASS: Maximum value $99.99");
        } else {
            System.out.println("✗ FAIL: Expected $99.99, got " + counter.total());
        }
        System.out.println();
    }
    
    public static void testOverflowByOne() {
        System.out.println("Test 6: Overflow by One Hundredth");
        GroceryCounter counter = new GroceryCounter();
        
        // Set to 9999
        for (int i = 0; i < 9; i++) {
            counter.tens();
            counter.ones();
            counter.tenths();
            counter.hundreths();
        }
        
        // Add one more
        counter.hundreths();
        
        if (counter.getCount() == 0 && counter.overflows() == 1) {
            System.out.println("✓ PASS: Overflowed from 9999 to 0000");
        } else {
            System.out.println("✗ FAIL: Should overflow to 0000");
        }
        System.out.println();
    }
    
    public static void testClear() {
        System.out.println("Test 7: Clear Function");
        GroceryCounter counter = new GroceryCounter();
        
        counter.tens();
        counter.ones();
        counter.clear();
        
        if (counter.getCount() == 0 && counter.overflows() == 0) {
            System.out.println("✓ PASS: Counter cleared successfully");
        } else {
            System.out.println("✗ FAIL: Clear should reset everything to 0");
        }
        System.out.println();
    }
    
    public static void testFormattedOutput() {
        System.out.println("Test 8: Formatted Output (leading zeros)");
        GroceryCounter counter = new GroceryCounter();
        
        // Create 509 (should display as $5.09 not $5.9)
        for (int i = 0; i < 5; i++) {
            counter.ones();
        }
        for (int i = 0; i < 9; i++) {
            counter.hundreths();
        }
        
        if (counter.total().equals("$5.09")) {
            System.out.println("✓ PASS: Displays $5.09 with leading zero");
        } else {
            System.out.println("✗ FAIL: Expected $5.09, got " + counter.total());
        }
        System.out.println();
    }
    
   
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   GROCERY COUNTER TEST SUITE");
        System.out.println("====================================");
        System.out.println();
        
        // Run all tests
        testInitialState();
        testExample2011();
        testExample1100();
        testOverflow();
        testMaxValue();
        testOverflowByOne();
        testClear();
        testFormattedOutput();
        
        System.out.println("====================================");
        System.out.println("   ALL TESTS COMPLETED!");
        System.out.println("====================================");
    }
}
