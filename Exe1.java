public class Exe1 {
    public static void main(String[] args) {
        double a=20,b=80,add,mul,mod;

        add=a+b;
        mul=add*25;
        System.out.println("Tothal is:" +mul);

        mod=mul%40;
        System.out.println("The Remainder is:" +mod);

        if (mod<=20)
        {
            System.out.println("Total was over the limit");
        }

    }
}
