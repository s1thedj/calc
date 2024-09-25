import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String input = scanner.nextLine();
        String calc1 = calc(input);
        System.out.println(calc1);
    }

    public static String calc(String input) throws IOException {
        String incalc = input;
        String[] precalc = incalc.split(" ");
        byte a = 0;
        try {
            a = Byte.parseByte(precalc[0]);
        } catch (NumberFormatException e) {
            return "throws Exception: неверный формат введенных данных";
    }
        byte c = 0;
        try {
            c = Byte.parseByte(precalc[2]);
        } catch (NumberFormatException e){
            return "throws Exception: неверный формат введенных данных";
        }
        if (precalc.length>3){
            throw new IOException("throws Exception: кол-во символов в строке больше 3-х");
        }
        if (precalc.length<3){
            throw new IOException("throws Exception: кол-во символов в строке меньше 3-х");
        }
            if ((a > 10 || a < 1) || (c > 10 || c < 1)) {
            throw new IOException("throws Exception: одно или два числа находятся вне диапазона");
            }
        byte result;
        switch (precalc[1]) {
            case "+":
                result = (byte) (a + c);
                break;
            case "-":
                result = (byte) (a - c);
                break;
            case "/":
                result = (byte) (a / c);
                break;
            case "*":
                result = (byte) (a * c);
                break;
            default:
                result = 0;
                break;
        }
        return String.valueOf(result);

    }
}