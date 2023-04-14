/*This class is checking the input prefix valid or not, only the numbers and operators can consist the expression
**There are 2 kinds of wrong may happen, prefix contains invalid element(wrong1) and too much operator or operon(wrong2)
* the valid will return 0
* Integer, letters, +,-,*,/,$ are acceptable
 */

public class checkwrong {
    public static int Check(String input){
        int normal=0;int wrong1=1;int wrong2=2;
        int operatorcount=0; int numbers=0;
    for(int i=input.length()-1;i>=0;i--){
        char IN= input.charAt(i);
        if (distingChar.isOperators(IN)){
            operatorcount++;
        }
        else
            if(Character.isLetter(IN) || Character.isDigit(IN)){
                numbers++;
            }
        //counting the  operators and operons numbers.
            if(!(distingChar.isOperators(IN)||Character.isLetter(IN) || Character.isDigit(IN))) {
//            System.out.println("input hava invalid element, check your input");
                return wrong1;
                }
    }
        if (numbers!=operatorcount+1){
            return wrong2;}
        else
            return normal;
    }
}

