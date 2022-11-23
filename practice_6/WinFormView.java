
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinFormView implements ViewInterface {
    public Presenter presenter;
    private ViewInterface viewInterface;
    private UserModel model;

    public WinFormView() {
        presenter = new Presenter(model, viewInterface);
    }

    public void print() {
        JFrame window = new JFrame("Авторизация и регистрация");
        window.setBounds(5, 5, 500, 500);
        window.setLayout(null);

        // надпись Авторизация
        JLabel label = new JLabel("Авторизация");
        label.setBounds(45, 5, 150, 40);
        window.add(label);
        // надпись регистрация
        JLabel label_1 = new JLabel("Регистрация");
        label_1.setBounds(280, 5, 150, 40);
        window.add(label_1);

        // поля ввода для авторизации
        JTextField login_Field = new JTextField(" login");
        JTextField password_Field = new JTextField(" password");
        login_Field.setBounds(45, 45, 150, 40);
        password_Field.setBounds(45, 105, 150, 40);
        window.add(login_Field);
        window.add(password_Field);
        // поля ввода для регистрации
        JTextField newname_Field = new JTextField(" Name");
        JTextField newlogin_Field = new JTextField(" Login");
        JTextField newpassword_Field = new JTextField(" Password");
        newname_Field.setBounds(280, 45, 150, 40);
        newlogin_Field.setBounds(280, 105, 150, 40);
        newpassword_Field.setBounds(280, 165, 150, 40);
        window.add(newname_Field);
        window.add(newlogin_Field);
        window.add(newpassword_Field);

        // кнопка авторизации
        JButton button = new JButton("авторизация");
        button.setBounds(45, 165, 150, 40);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        window.add(button);
        // кнопка регистрации
        JButton button_1 = new JButton("регистрация");
        button_1.setBounds(280, 225, 150, 40);
        button_1.setBackground(Color.BLACK);
        button_1.setForeground(Color.WHITE);
        window.add(button_1);
        // надпись
        /*
         * JLabel label_2 = new JLabel("Здесь будет результат авторизация");
         * label_2.setBounds(45, 360, 150, 40);
         * window.add(label_2);
         */

        // обработчик нажатия на кнопку авторизация
        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                UserModel model = new UserModel();
                Presenter presenter = new Presenter(model, viewInterface);
                while (true) {
                    String login = login_Field.getText();
                    String password = password_Field.getText();
                    // label_2.setText(model.message());
                    // Отправка данных представителю и получение обновлённой модели
                    model = presenter.login(login, password);
                    // Вывод сообщения из модели
                    System.out.println(model.message());
                    System.out.println("Список пользователей.");
                    model.loadUsers();
                    System.exit(0);
                }
            }
        };
        button.addActionListener(actionListener);

        // обработчик нажатия на кнопку регистрация
        ActionListener actionListener_1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                UserModel model = new UserModel();
                Presenter presenter = new Presenter(model, viewInterface);
                while (true) {
                    String newname = newname_Field.getText();
                    String newlogin = newlogin_Field.getText();
                    String newpassword = newpassword_Field.getText();
                    if (newname == "" && newlogin == "" && newpassword == "") {
                        JOptionPane.showMessageDialog(null, "Заполните поля.");
                    } else {
                        model = presenter.isRegist(newname, newlogin, newpassword);

                    }
                    System.exit(0);
                }
            }
        };
        button_1.addActionListener(actionListener_1);

        window.setVisible(true);
    }
}
