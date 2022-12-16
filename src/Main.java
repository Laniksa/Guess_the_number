import java.util.Scanner;

public class Main {
    public static int count = 0;

    public static int randomNum(){
        return (int) (Math.random()*((100-1)+1))+1;
    }

    public static void main(String[] args) {
        int rand = randomNum();
        Scanner scan = new Scanner(System.in);
        while (true){
            count++;
            System.out.println("Введите число от 0 до 100");
            int num;
            try {
                String str = scan.nextLine();
                num = Integer.parseInt(str);

                if(num == rand){
                    System.out.println("Поздравляю! Вы угадали число! Число попыток :"+count);
                    break;
                }else if(num > rand){
                    System.out.println("Загаданное число меньше вашего, попробуйте еще раз");
                }else{
                    System.out.println("Загаданное число больше вашего, попробуйте еще раз");
                }
            }catch(NumberFormatException e){
                System.out.println("Вы ввели число с ошибкой");
            }


        }


    }
}