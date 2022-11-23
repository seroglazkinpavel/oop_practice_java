import java.util.Scanner;

public class Activity implements View {
    Scanner in;

    public Activity() {
        in = new Scanner(System.in);
    }

    @Override
    public String choice() {
        System.out.println("---------- Добро пожаловать ----------");
        System.out.println("1. Вход 2. Регистрация 3. Выход");
        System.out.println("Пожалуйста, введите ваш выбор");
        String choice = in.nextLine();
        return choice;
    }

    @Override
    public String getLogin() {
        System.out.println("---------- Авторизация ----------");
        System.out.println("Пожалуйста, введите логин пользователя");
        String login = in.nextLine();
        return login;
    }

    /*
     * @Override
     * public void setLogin(String value) {
     * System.out.printf("newlogin: %s\n", value);
     * 
     * }
     */

    @Override
    public String getPassword() {
        System.out.println("Пожалуйста, введите пароль пользователя");
        String password = in.nextLine();
        return password;
    }

    /*
     * @Override
     * public void setPassword(String value) {
     * System.out.printf("newpassword: %s\n", value);
     * }
     */

    @Override
    public String getNewName() {
        System.out.println("---------- Регистрация ----------");
        System.out.println("Пожалуйста, введите имя пользователя");
        String newname = in.nextLine();
        return newname;
    }

    /*
     * @Override
     * public void setNewName(String value) {
     * System.out.printf("Name: %s\n", value);
     * 
     * }
     */

    @Override
    public String getNewLogin() {
        System.out.println("Пожалуйста, введите логин пользователя");
        String newlogin = in.nextLine();
        return newlogin;
    }

    /*
     * @Override
     * public void setNewLogin(String value) {
     * System.out.printf("newlogin: %s\n", value);
     * 
     * }
     */

    @Override
    public String getNewPassword() {
        System.out.println("Пожалуйста, введите пароль пользователя");
        String newpassword = in.nextLine();
        return newpassword;
    }

    /*
     * @Override
     * public void setNewPassword(String value) {
     * System.out.printf("newpassword: %s\n", value);
     * 
     * }
     */
}
