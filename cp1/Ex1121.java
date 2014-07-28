/********************************************************
 *  Compilation:  javac Ex1121.java
 * 
 *  exercises 1.1.21
 * 
 *  Read standard input, output name and average number
 *  Data file:    avrgin.txt
 *  Output file:  avrgout.txt
 ********************************************************/

/*
 * @author Jing Xu
 * 
 * */

public class Ex1121
{ 
    public static void main(String[] args)
    {
        In in = new In(args[0]);
        Out out = new Out(args[1]);
        
        while(!in.isEmpty())
        {
            String name = in.readString();
            int a = in.readInt();
            int b = in.readInt();
            
            float c = (float)a / (float)b;
            out.printf("%s %.3f\n", name, c);
        }
    }
}