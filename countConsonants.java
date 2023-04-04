//Complete the function that takes a string of English-language text and returns the number of consonants in the string.
//Consonants are all letters used to write English excluding the vowels a, e, i, o, u.
public class countConsonants {

    public static void main(String[] args) {

        String text = "Hello, how are you?";
        System.out.println(Consonants.getCount(text));
    }
}

class Consonants {
    public static int getCount(String str) {
        int count=0;
        String cons= "bcdfghjklmnpqrstvwxyz";
        for (int i=0; i< str.length(); i++) {
            if (cons.contains(str.toLowerCase().substring(i, i+1))) {
                count++;
            }
        }



    return count;
    }
}