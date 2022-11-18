import java.util.Scanner;

public class App {
    public static void ButtonClick() {
        // System.out.print("\033[H\033[J");//
        // ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        UserModel model = new UserModel();
        View view = new Activity();
        Presenter presenter = new Presenter(model, view);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("---------- Добро пожаловать ----------");
                System.out.println("1. Вход 2. Регистрация 3. Выход");
                System.out.println("Пожалуйста, введите ваш выбор");
                String choice = in.nextLine();
                switch (choice) {
                    // Авторизация
                    case "1":
                        System.out.println("---------- Авторизация ----------");
                        String login = view.getLogin();
                        String password = view.getPassword();
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
                        System.out.println("---------- Регистрация ----------");
                        String newname = view.getNewName();
                        String newlogin = view.getNewLogin();
                        String newpassword = view.getNewPassword();
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
}
