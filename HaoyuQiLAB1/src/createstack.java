/*
this is the stack definition class, stack is constructed by array here
push, pop, peek and isEmpty are defined
*/
public class createstack {
    Object[]arraystack;
    private int size;
    private int  top;

    public void stack (String name,int size){
        this.size=size;
        arraystack=new Object[size];
        this.top=-1;
    }
    public boolean push (Object a){
        if (top + 1 == size){
            return false;}
        else {
            this.arraystack[++top]=a;return true;
        }

    }
    public Object pop(){
        Object popelement;
        if (top==-1){
            return false;}
        else{
            popelement= this.arraystack[top--];
            System.out.print(popelement+"\r");
            return popelement;}
    }
    public Object peek(){
        Object peekelement;
        if (top==-1){

            return false;}
        else
            peekelement= this.arraystack[top--];
            System.out.print(peekelement+"\r");
            return peekelement;
    }
    public boolean isEmpty(){
        if (top==-1){

            return true;}
        else

            return false;
    }
    public Object getLength() {
        int length;
        if (top==-1)
            return false;
        else
            length=top+1;
            System.out.println(length+"\r");
            return length;
    }


    }



