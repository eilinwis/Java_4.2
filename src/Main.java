public class Main {
    public static void main(String [] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(76, 1.84);
        System.out.println(bmi);
    }
}
