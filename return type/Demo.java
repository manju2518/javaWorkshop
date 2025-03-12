public class Demo{
    public int add(int num1,int num2){
    int num=num1+num2;
    return num;
    }
public static void main(String args[]){
    Demo obj=new Demo();
    int c=obj.add(50,67);
    System.out.println(c);
    
}
}