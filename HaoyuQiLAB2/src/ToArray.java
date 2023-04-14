public class ToArray {
    static char[] Trans(String input){
        char[] prefixc = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            prefixc[i] = input.charAt(i);}
        return prefixc;
    }}

