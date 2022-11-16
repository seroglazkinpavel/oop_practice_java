
public class Presenter {

    private UserModel model; // Связь с моделью
    private User userinformation;

    public Presenter(UserModel model) {
        this.model = model;
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
}
