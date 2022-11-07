package Q3;

public class ConsecutiveLetters {

    /** This method checks if the input given are between ranges of 0-100
     *
     * @param a int
     * @param b int
     * @return boolean based on condition
     */
    private boolean isNumberBetweenRange(int a , int b){
        System.out.println("verifying if given input is between range of (0-100)");
        if((a >100 || a < 0 )&& (b> 100|| b < 0 )){
            System.out.println("one of the input is out of range");
            return false;
        }

        System.out.println("input is within range range");
        return true;
    }

    /** This
     *
     * @param a
     * @param b
     * @return
     */
    public String lettersProcessor(int a , int b){
        if(!isNumberBetweenRange(a,b)){
            System.exit(-0); // here program will end because input is found to be out of range
        }

        return stringGenerator(a ,b);
    }

    /** This function generates a string  to match the ,
     * condition ==> neither "aaa" nor "bbb" may occur in the returned string).
     *
     * @return string
     */
    private String stringGenerator(int a , int b){
        Character A = 'A';
        Character B = 'B';

        int lengthOfLetters = a+b;
        String output = "";

        var letterA = String.valueOf(A);
        var letterB = String.valueOf(B);

        for (int i=0; i < lengthOfLetters ; i++ ){
            output += letterA;

                if (a >= b && output.substring(i) == output.substring(i+1)) {
                    output += letterA;
                }else {
                    output += letterB;
                }

        }

        System.out.println(output);
        return output;
    }

}
