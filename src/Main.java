public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.84; // рост в метрах
        double weight = 84;      // вес в кг
        double index = service.calculate(height, weight);
        System.out.println((int) index);
    }
}