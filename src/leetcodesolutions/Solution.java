package leetcodesolutions;

public class Solution {

    static public int reverse(int x) {
        // convert x to a string
        String xStr = String.valueOf(x);

        // reverse the string
        String newxStr = new StringBuffer(xStr).reverse().toString();
        // handle the minus sign properly
        String corrected = newxStr;
        if (newxStr.charAt(newxStr.length()-1) == '-') {
        	corrected = newxStr.split("-")[0];
        	corrected = ("-").concat(corrected);
        }
        
        // convert back to an int
        try {
            return Integer.parseInt(corrected); //return the reverse of x
        } catch (NumberFormatException nfe) {
            return 0; // if its out of the range of signed 32-bit integer return 0
        }
    }
    
    public static void main(String args[]) {
    	int result = reverse(123);
    	
    }
    
}