import java.util.*;

public class VendingMachine {
    private HashMap<Integer, Product> bd;
    private HashMap<Integer, Integer> products;
    private double bank;
    private double deposit;
    private Map<Integer, String> command;
    private boolean work;
    private Scanner scanner;

    public VendingMachine() {
        bd = new HashMap<>();
        products = new HashMap<>();
        int index = 0;
        bd.put(index, new Bottle(index, 30, "Bon aqua", 2));
        products.put(index++, 1);
        bd.put(index, new Chocolate(index,80, "Alpen Gold"));
        products.put(index++, 3);
        bd.put(index, new Chocolate(index,120, "Аленка"));
        products.put(index++, 5);

        command = new TreeMap<>();
        command.put(1, "stop");
        command.put(2, "add money");
        command.put(3, "buy");
        command.put(4, "print all");
        command.put(5, "print");
        command.put(6, "deposit");

        bank = 0;
        deposit = 0;
    }

    public void execute(int command){
        if (!this.command.containsKey(command)){
            return;
        }
        switch (this.command.get(command)){
            case "stop":
                work = false;
                break;
            case "add money":
                System.out.println("какую сумму вы хотите добавить?");
                if (scanner.hasNextDouble()){
                    double money = scanner.nextDouble();
                    addDeposit(money);
                }
                break;
            case "buy":
                printAll();
                System.out.println("Какой товар вы хотите купить? Нажмите кнопку");
                Product product = buyProductById(scanner.nextInt());
                if (product != null){
                    System.out.println("Возьмите ваш товар: " + product.getName());
                }
                break;
            case "print all":
                printAll();
                break;
            case "deposit":
                System.out.println("У вас осталось не использовано " + getDeposit() + "р.");
                break;
        }
    }

    public void printAll(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product: bd.values()){
            stringBuilder.append(product.getId()).append(". - ").append(product).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public void console(){
        work = true;
        scanner = new Scanner(System.in);
        while (work){
            System.out.println(this.command);
            if (scanner.hasNextInt()){
                execute(scanner.nextInt());
            }
        }
        System.out.println("до скорой встречи");
    }

    public void addDeposit(double deposit){
        if (deposit>0)
        this.deposit += deposit;
    }

    public Product buyProductById(int idProduct){
        if (!bd.containsKey(idProduct)){
            System.out.println("Выбран несуществующий товар");
            return null;
        }
        if (products.get(idProduct) == 0){
            System.out.println("К сожалению, этот товар закончился");
            return null;
        }
        Product product = bd.get(idProduct);
        if (product.getPrice() > deposit){
            System.out.println("Недостаточно средств на счете");
            return null;
        } else {
            deposit -= product.getPrice();
            int count = products.get(idProduct);
            products.put(idProduct, --count);
            bank += product.getPrice();
            return product;
        }
    }

    public double getDeposit() {
        return deposit;
    }
}
