public class Main {
    public static void main(String[] args) {

        System.out.println("\nПеременые___________________________________________________________________________________");

        byte bt = 100;
        short sh = 10_000;
        int it = 1_000_000_000;
        long lg = 1_000_000_000;
        float fl = 1.1f;
        double db = 1.1;
        char ch = 10_000;
        boolean bl = true;
        String st="Число";

        System.out.println(st + " " + bt);

        System.out.println("\nУсловные операторы_________if else___________________________________________________________");
        int x =4;

        if (x<5){
            System.out.printf("%s,меньше 5\n",x);
        }else {
            System.out.printf("%s,больше 5\n",x);
        }

        int y=6;

        if (y < 5) {
            System.out.printf("%s,меньше 5\n", y);
        } else if (y == 5) {
            System.out.printf("%s,равно 5\n", y);
        } else {
            System.out.printf("%s,больше 5\n", y);
        }

        int gr =1;
        boolean num=true;

        if (gr <= 1 && num == true) {
            System.out.println("Зеленый, можно идти.");
        } else if (gr == 2 && num == true) {
            System.out.println("Желтый цвет, будте внимательны.");
        } else if (gr==3 && num==true) {
            System.out.println("Красный идти нельзя.");
        }else {
            System.out.println("Свитафор не работает.");
        }



        System.out.println("\nУсловные операторы_________switch_____________________________________________________________");

        int numberSwitch =2+2*2;

        switch (numberSwitch) {
            case 2:
                System.out.printf("Равно: %s\n", numberSwitch);
                break;
            case 4:
                System.out.printf("Равно: %s\n", numberSwitch);
                break;
            case 6:
                System.out.printf("Равно: %s\n", numberSwitch);
                break;
            default:
                System.out.println("Нет верного ответа");
        }



    }
}
