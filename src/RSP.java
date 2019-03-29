import java.util.Random;
import java.util.Scanner;
public class RSP {
    public static void main(String[] args){
        System.out.println("Добро пожаловать");
        System.out.println("Вас приветствует игра:");
        System.out.println("Камень-ножницы-бухлишко");
        System.out.println("Камень-1,Ножницы-2,Бумага-3");
        System.out.println("Хотите выйти нажмите 0");
        System.out.println(" ");
        System.out.println("Выбирайте действие: ");
        input();
    }
    static void input(){
        Scanner ty = new Scanner(System.in);// Сюда передается действие игрока
        int x=ty.nextInt();
        int ka=1;
        int no=2;
        int bu=3;
        int Answer = Computer();
        if (x==0) {
            System.exit(0);
        }
        if(x== 1) {
            System.out.println("Камень");
            ka=x;
        }
        if (x==2){
            System.out.println("Бумага");
            bu=x;
        }
        if (x==3){
            System.out.println("Ножницы");
            no=x;
        }
        while (x>3 && x<1) {
            System.out.println("Ошибка! Даные введены не корректно.");
        }
        if (ka < Answer) {
            System.out.println("Победа");
        }
        if (no > Answer) {
            System.out.println("Победа");
        }
        if (bu > Answer) {
            System.out.println("Победа");
        }
        if (ka == Answer || no == Answer || bu == Answer) {
            System.out.println(" Ничья ");
        }

        if (ka > Answer) {
            System.out.println("Победа");
        }
        if (no < Answer) {
            System.out.println("Победа");
        }
        if (bu < Answer) {
            System.out.println("Победа");
        }

        }



    static int Computer(){
        Random rd = new Random();
        int Answer = rd.nextInt(3)+1;
        if (Answer==0){

        }
        return Answer;
    }
}

