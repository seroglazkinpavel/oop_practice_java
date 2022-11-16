import java.util.Scanner;

public class UsersActivity {

    private UserModel model;
    private Presenter presenter;

    public UsersActivity() {
        model = new UserModel();
        presenter = new Presenter(model);
    }

    public void userView() {
        while (true) {
            System.out.println("---------- Добро пожаловать ----------");
            System.out.println("1. Вход 2. Регистрация 3. Выход");
            System.out.println("Пожалуйста, введите ваш выбор");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice) {
                // Авторизация
                case "1":
                    System.out.println("---------- Логин ----------");
                    System.out.println("Пожалуйста, введите логин");
                    String name = sc.nextLine();
                    System.out.println("Пожалуйста, введите ваш пароль");
                    String password = sc.nextLine();
                    // Отправка данных представителю и получение обновлённой модели
                    this.model = this.presenter.login(name, password);
                    // Вывод сообщения из модели
                    System.out.println(this.model.message());
                    this.model.loadUsers();
                    System.exit(0);
                    break;

                // Регистрация
                case "2":
                    System.out.println("---------- Регистрация ----------");
                    System.out.println("Пожалуйста, введите имя пользователя");
                    String newname = sc.nextLine();
                    System.out.println("Пожалуйста, введите логин пользователя");
                    String newlogin = sc.nextLine();
                    System.out.println("Пожалуйста, введите пароль пользователя");
                    String newpassword = sc.nextLine();
                    this.model = this.presenter.isRegist(newname, newlogin, newpassword);
                    this.model.loadUsers();
                    System.exit(0);
                    break;
                // Выход
                case "3":
                    System.out.println("Спасибо за ваше использование");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод, пожалуйста, введите заново");
                    break;

            }
        }
    }

    public static void main(String[] args) {
        UsersActivity usersActivity = new UsersActivity();
        usersActivity.userView();
    }
}
