// Write simple .camelCase method (camel_case function in PHP,
// CamelCase in C# or camelCase in Java) for strings.
// All words must have their first letter capitalized without spaces.



public class CamelCaseMethod {

    public static void main(String[] args) {

        String str = " camel case word";
        System.out.println(Solution.camelCase(str));
    }
}

class Solution {
    public static String camelCase(String str) {
        // your code here
        String[] array= str.split("[\\W_]+");
        for (int i = 0; i < array.length; i++) {
            try{
            array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
            }catch(StringIndexOutOfBoundsException ignored){

            }

        }
        return String.join("", array);
    }

}