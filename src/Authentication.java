package src;

import java.util.Scanner;

public class Authentication {

    private static final String LOGIN = "anton";
    public static final String PASSWORD = "qweasdzxc";

    public static int authenticate() {
        Scanner s = new Scanner(System.in);

        int maxCount = 3;
        boolean isLoginSuccess = false;

        while (maxCount > 0 && !isLoginSuccess) {
            System.out.print("Login: ");
            String login = s.nextLine();

            System.out.print("Password: ");
            String password = s.nextLine();

            if (login.equals(LOGIN) && password.equals(PASSWORD)) {
                isLoginSuccess = true;
            }

            maxCount--;
        }

        return isLoginSuccess ? 0 : -1;
    }
}
