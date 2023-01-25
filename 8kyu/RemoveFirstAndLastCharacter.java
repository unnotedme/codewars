public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1); //lenght starts at 0, so we need to start at 1 and end at length - 1.  
    }
}