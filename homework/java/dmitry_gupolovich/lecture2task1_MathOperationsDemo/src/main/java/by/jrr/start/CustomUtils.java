package by.jrr.start;

/**
 * Custom class for checking values before calculation
 */
class CustomUtils {
    /**
     *
     * @param value - for checking with condition
     * @return true when value greater than zero
     *         false when value less then zero
     */
    Boolean checkValue(Double value) {

       return value > 0;
    }
}
