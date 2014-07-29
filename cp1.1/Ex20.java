/********************************************
 *  Compilation:  javac Ex20.java
 * 
 *  exercises 1.1.20
 * 
 *  wirte recursive function of logarithm
 *
 ********************************************/

/*
 * @author Jing Xu
 * 
 * */

public class Ex20
{
    public static double ln(int N)
    {
        if(N == 1)
            return 0;
        else
            return Math.log10(N) + ln(N - 1);
    }
    
    public static void main(String[] args)
    {
        StdOut.println(ln(1));
    }
}