package avaj;

/**
 * A class for math functions that are not in the standard Java Math class. 
 * 
 * @author Elaine Cui
 * @author Ranjit Paintal
 */
public class Math2
{
    /**
     * Returns a random integer between min and max.
     * Inclusive of min and exclusive of max.
     * 
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @return a random integer between min and max
     */
    public static int randomInt(int min, int max)
    {
        return (int)(Math.random() * (max - min)) + min;
    }

    /**
     * Rounds a double to a specified number of decimal places.
     * 
     * @param num the number to round
     * @param decimalPlaces the number of decimal places to round to
     * @return the rounded number
     */
    public static double round(double num, int decimalPlaces)
    {
        double multiplier = Math.pow(10, decimalPlaces);
        return Math.round(num * multiplier) / multiplier;
    }

    /**
     * Normalizes a vector (array of doubles) to have a length of 1.
     * 
     * @param vector the vector to normalize
     * @return the normalized vector
     */
    public static double[] normalize(double[] vector)
    {
        double length = 0;
        for (double component : vector)
        {
            length += component * component;
        }
        length = Math.sqrt(length);
        
        if (length == 0)
        {
            return new double[vector.length]; // Return a zero vector if the input is a zero vector
        }
        
        double[] normalizedVector = new double[vector.length];
        for (int i = 0; i < vector.length; i++)
        {
            normalizedVector[i] = vector[i] / length;
        }
        
        return normalizedVector;
    }
}