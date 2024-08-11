import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer valus = ");
        int i =  input.nextInt();
        System.out.println("Int value = "+i);

        System.out.print("Enter float valus = ");
        float f = input.nextFloat();
        System.out.println("float value is = "+f);

        System.out.print("Enter double valus = ");
        double d = input.nextDouble();
        System.out.println("double value = "+d);

        System.out.print("Enter one word valus = ");
        String w = input.next();
        System.out.println("Space chara string is = "+w);

        System.out.print("Enter many word valus = ");
        //String s = input.nextLine();
        //System.out.println("onk word er string is : "+s);


        System.out.print("Enter boolean valus = ");
        boolean b = input.nextBoolean();
        System.out.println("boolean is = "+b);

        System.out.print("Enter long valus = ");
        long l = input.nextLong();
        System.out.println("long value is = "+l);

        System.out.print("Enter short valus = ");
        short sh = input.nextShort();
        System.out.println("Short value is = "+sh);

        input.close();
    }
}
