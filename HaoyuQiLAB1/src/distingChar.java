/*
This class is used to distinguish the input char as the operator or operaons

*/

public class distingChar {

    public static boolean isOperators(char o){
        if (o=='+'||o=='-'||o=='*'||o=='/'||o=='$'){
            return true;
        }
        else {
            return false;
        }
       }
    //define the priorities
    public int prior(char p){
        if (p=='$') {
            return 2;
        }
        if (p=='*'||p=='/'){
            return 1;
        }
        else {
            return 0;
        }
    }
}
