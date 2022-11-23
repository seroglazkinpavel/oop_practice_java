import java.util.Scanner;

public class ConsoleViewDIP implements ViewInterface, ViewDIP {
    public Presenter presenter;
    private ViewDIP view;
    private UserModel model;
    Scanner in;

    public ConsoleViewDIP() {
        // this.model = model;
        presenter = new Presenter(model, view);
        in = new Scanner(System.in);
    }

    @Override
    public void print() {

        UserModel model = new UserModel();

        Presenter presenter = new Presenter(model, view);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                String choice = choice();
                switch (choice) {
                    // Авторизация
                    case "1":
                        String login = getLogin();
                        String password = getPassword();
                        // Отправка данных представителю и получение обновлённой модели
                        model = presenter.login(login, password);
                        // Вывод сообщения из модели
                        System.out.println(model.message());
                        System.out.println("Список пользователей.");
                        model.loadUsers();
                        System.exit(0);
                        break;

                    // Регистрация
                    case "2":
                        String newname = getNewName();
                        String newlogin = getNewLogin();
                        String newpassword = getNewPassword();
                        model = presenter.isRegist(newname, newlogin, newpassword);
                        // model.loadUsers();
                        System.exit(0);
                        break;
                    // Выход
                    case "3":
                        System.out.println("Спасибо за ваше использование");
                        in.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Неверный ввод, пожалуйста, введите заново");
                        break;
                }
            }
        }
    }

    public String choice() {
        System.out.println("---------- Добро пожаловать ----------");
        System.out.println("1. Вход 2. Регистрация 3. Выход");
        System.out.println("Пожалуйста, введите ваш выбор");
        String choice = in.nextLine();
        return choice;
    }

    public String getLogin() {
        System.out.println("---------- Авторизация ----------");
        System.out.println("Пожалуйста, введите логин пользователя");
        String login = in.nextLine();
        return login;
    }

    public String getPassword() {
        System.out.println("Пожалуйста, введите пароль пользователя");
        String password = in.nextLine();
        return password;
    }

    public String getNewName() {
        System.out.println("---------- Регистрация ----------");
        System.out.println("Пожалуйста, введите имя пользователя");
        String newname = in.nextLine();
        return newname;
    }

    public String getNewLogin() {
        System.out.println("Пожалуйста, введите логин пользователя");
        String newlogin = in.nextLine();
        return newlogin;
    }

    public String getNewPassword() {
        System.out.println("Пожалуйста, введите пароль пользователя");
        String newpassword = in.nextLine();
        return newpassword;
    }

}
