import java.util.LinkedList;
import java.util.List;

public class UserModel {
    private List<User> users;
    private User loggedUser; // зарегистрирован

    public UserModel() {
        users = new LinkedList<>(); // Создание списка тестовых пользователей

        users.add(new User("Name1", "Login1", "password1"));
        users.add(new User("Name2", "Login2", "password2"));
        users.add(new User("Name3", "Login3", "password3"));
        users.add(new User("Name4", "Login4", "password4"));

        loggedUser = null;
    }

    /*
     * Метод авторизации
     */
    public void isLogin(String login, String password) {
        boolean hasLogged = false;

        for (User user : this.users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                this.loggedUser = user; // Обновление модели
                hasLogged = true;
                break;
            }
        }
        if (!hasLogged) {
            this.loggedUser = null;
        }
    }

    /*
     * Вывод сообщения в зависимости от того, успешно ли был авторизован
     * пользователь
     */
    public String message() {
        return this.loggedUser != null ? "Привет " + this.loggedUser.getName() + "!"
                : "Неправильный логин или пароль!";
    }

    /*
     * Получение списка пользователей из БД
     */
    public void loadUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    /*
     * Добавление пользователя в БД
     */
    public void regist(User userinformation) {
        for (int i = 0; i < users.size(); i++) {
            if (users.contains(userinformation)) {
                System.out.println("Такие данные уже есть.");
                System.exit(i);
            } else {
                users.add(userinformation);
                System.out.println("Вы успешно зарегистрировались " + userinformation.getName() + "!");
                System.out.println("Список пользователей.");
                loadUsers();
                System.exit(i);
            }
        }

    }

}
