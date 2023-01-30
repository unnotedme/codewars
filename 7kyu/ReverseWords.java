public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] arr=original.split(" "); //Split the phrase into letters
        if(arr.length==0) //If length is 0, return original
          return original;
        String result="";
        for(String word:arr){ //If more than 0 (or array)
            StringBuilder input = new StringBuilder();
            result+=input.append(word).reverse().toString()+" "; // Reverse the words on the array array and then turn into a string again
        }
    return result.trim();
    }
}