public class Main {
    public static void main(String[] args) {
        BmiServiceService service = new BmiServiceService();
        double height = 1.87;
        double weight = 98;
        double bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела = " + (int) bmi );
    }
}