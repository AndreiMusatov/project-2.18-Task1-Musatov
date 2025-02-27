/**Создать проект с главным классом (содержащим метод "main") в NetBeans или любой другой IDE на ваш вкус.
*Вывести на консоль фразу: "Как тебя зовут?"
*Считать ответ пользователя
*Вывести пользователю строку: "Привет, <введенное имя>!"
*/
import java.util.Scanner;

public class acquaintance {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");

    }
}
