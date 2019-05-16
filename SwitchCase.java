import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char x;

        System.out.println("Choose any latter from A to E:");
        x=sc.next().charAt(0);
        System.out.println("You chose:"+x);

        switch (x){
            case 'a':
            {
                System.out.println("Apple");
                break;
            }
            case 'b':
            {
                System.out.println("Banana");
                break;
            }
            case 'c':
            {
                System.out.println("Cherry");
                break;
            }
            case 'd':
            {
                System.out.println("Dragon Fruit");
                break;
            }
            case 'e':
            {
                System.out.println("Elder Berry");
                break;
            }
            default:
                System.out.println("Choose the correct option !!");
        }


    }
}
