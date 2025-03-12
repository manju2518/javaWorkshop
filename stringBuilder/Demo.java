public class Demo{
    public String Concatenator(String name1,String name2){
    String name=name1+" "+name2;
    return name;
}
public static void main(String args[])
{
    Demo obj=new Demo();
    String y=obj.Concatenator("Manju","MP");
    System.out.println(y);
}
}
