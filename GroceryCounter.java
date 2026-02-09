/**
 * Represents a 4-digit grocery counter that tracks purchases.
 * The counter displays values from 0000 to 9999 and wraps around on overflow.
 */
public class GroceryCounter {
    // Instance variables (like private member variables in C++)
    private int count;
    private int overflowCount;
    
    /**
     * Constructor - initializes counter to 0000
     */
    public GroceryCounter() {
        this.count = 0;
        this.overflowCount = 0;
    }
    
    /**
     * Increments the tens digit (adds 1000)
     */
    public void tens() {
        count += 1000;
        checkOverflow();
    }
    
    /**
     * Increments the ones digit (adds 100)
     */
    public void ones() {
        count += 100;
        checkOverflow();
    }
    
    /**
     * Increments the tenths digit (adds 10)
     */
    public void tenths() {
        count += 10;
        checkOverflow();
    }
    
    /**
     * Increments the hundredths digit (adds 1)
     */
    public void hundreths() {
        count += 1;
        checkOverflow();
    }
    
    /**
     * Checks for overflow and wraps around if needed
     */
    private void checkOverflow() {
        if (count > 9999) {
            overflowCount++;
            count = count % 10000;
        }
    }
    
    /**
     * Returns the current counter value as a formatted monetary amount
     */
    public String total() {
        int dollars = count / 100;
        int cents = count % 100;
        return String.format("$%d.%02d", dollars, cents);
    }
    
    /**
     * Returns the number of times the counter has overflowed
     */
    public int overflows() {
        return overflowCount;
    }
    
    /**
     * Resets the counter to 0000 and clears overflow count
     */
    public void clear() {
        count = 0;
        overflowCount = 0;
    }
    
    /**
     * Returns the raw count value (for testing)
     */
    public int getCount() {
        return count;
    }
}
