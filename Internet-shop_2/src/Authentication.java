import java.util.Scanner;

public class Authentication {
    int n;
    String log;
    String pass;
    Scanner scanner = new Scanner(System.in);
    User user ;
    public void requisites() {
        boolean check;
        do {
            check = false;
            if (scanner.hasNextLine()) {
                log = scanner.nextLine();
                System.out.println(log);
            } else {
                System.out.println("��� �� �������, ��������� ����: ");
                check = true;
            }
        } while (check);
        System.out.println("������ : ");
        do {
            check = false;
            if (scanner.hasNextLine()) {
                pass = scanner.nextLine();
                System.out.println(pass);
            } else {
                System.out.println("������ �� �����, ��������� ����: ");
                check = true;
            }
        } while (check);
    }

    public void assign() {
        user = new User(n, log, pass);
    }

}
