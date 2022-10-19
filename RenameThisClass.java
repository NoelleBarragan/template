
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
        do {
            int a3 = i / 3;
            int a5 = i / 5;
            float b3 = i / 3;
            float b5 = i/5;
            i +=1;
            if (a3 == b3) {
                System.out.println("Fizz");
            }
            if (a5 == b5) {
                System.out.println("Buzz");
            }
            if (a5 == b5 && a3 == b3) {
                System.out.println("FizzBuzz");
            } else {System.out.println(i);}
        } while (i <= 100);

    }
}