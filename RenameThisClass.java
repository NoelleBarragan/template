
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public static void main(String[] args) {
        int i = 0;
        System.out.println("----------------------------------------------------------");
        do {
            int a3 = i/3;
            int a5 = i/5;
            double b3 = i/3.0;
            double b5 = i/5.0;
            if (a3 == b3 || a5 == b5) {
                if (a3 == b3 && a3 > 0) {
                    System.out.println("Fizz");
                }
                if (a5 == b5 && a5 > 0) {
                    System.out.println("Buzz");
                }
                if (a5 == b5 && a3 == b3 && a3 > 0) {
                    System.out.println("FizzBuzz");
                } 
            } 
            else {System.out.println(i);}
            i +=1;
        } while (i <= 100);

    }
}