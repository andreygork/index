public class main {
    public static void main (String[] args) {
        BmiService service = new BmiService();
        double weight = 76.5;
        double height = 1.80;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}

