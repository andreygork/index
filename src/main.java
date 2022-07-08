public class main {
    public static void main (String[] args) {
        BmiService service = new BmiService();
        double weight = 76.5;
        double heiht = 1.80;
        double index = service.calculate(weight, heiht);
        System.out.println(index);
    }
}

