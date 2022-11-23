import java.util.Scanner;

public class Presenter {

    private UserModel model; // Связь с моделью
    private View view;
    private User userinformation;

    public Presenter(UserModel model, View view) {
        this.model = model;
        this.view = view;
        userinformation = new User(null, null, null);
    }

    public UserModel login(String login, String password) { // Получение данных от вида
        login = login.trim(); // Обработка полученной информации
        password = password.trim();
        this.model.isLogin(login, password); // Обновление модели
        return this.model; // Передача обновлённой модели
    }

    public UserModel isRegist(String newname, String newlogin, String newpassword) {
        userinformation.setName(newname);
        userinformation.setLogin(newlogin);
        userinformation.setPassword(newpassword);
        this.model.regist(userinformation);
        return this.model;
    }

    public static void ButtonClick() {
        // System.out.print("\033[H\033[J");//
        // ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        UserModel model = new UserModel();
        View view = new Activity();
        Presenter presenter = new Presenter(model, view);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                String choice = view.choice();
                switch (choice) {
                    // Авторизация
                    case "1":
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
