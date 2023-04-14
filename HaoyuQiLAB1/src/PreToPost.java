// Use the method conversion to realize the prefix to postfix conversion.

public class PreToPost {
//conversion method
    public static String conversion(String input) {
        String str1;String str2;
        createstack s1 = new createstack();createstack s2 = new createstack();
        s1.stack("Num",input.length());
        s2.stack("temp",input.length());
//stack we used
        for (int i = input.length() - 1; i >= 0; i--) {
            char element = input.charAt(i);
            /*System.out.println("char is "+character);
            System.out.println("OP "+distingChar.isOperators(character));*/
            //you can use the above sout code to monitor the stack processure
            if (!distingChar.isOperators(element)){
                s1.push(element+"");
//                System.out.println("l:"+s1.getLength());
                //check the input type first and the operons will be directly push in the stack
            }
            else{
                if (s1.isEmpty()){
                    return "Check your prefix!";}
                str1= (String) s1.pop();
                if (s1.isEmpty()){
                    return "Check your prefix!";}
                else{
                    str2= (String) s1.pop();
                    String post=str1+str2+element;
                    s1.push(post);}}}
        //operator will be push in to the stack with the top 2 element of the stack

        return (String) s1.peek();
    }}

