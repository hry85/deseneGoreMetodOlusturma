import java.util.Scanner;
public class Main {

    static int desen(int number,boolean isReturn,int counter) {
        if (isReturn) {
            if (number > 0) {
                System.out.print(number + " ");
                counter++;
                return desen(number - 5, true, counter);
            } else {
                return desen(number, false, counter);
            }

        } else {
            System.out.print(number + " ");
            if (counter > 0) {
                counter--;
                return desen(number + 5, false, counter);
            } else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("N sayisi : " );
        number=sc.nextInt();

        System.out.print("Ciktisi : ");
        desen(number,true,0);

    }
}
