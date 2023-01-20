public class Main {
    public static void main(String[] args) {
        
        int mass = 85; // масса тела в килограммах
        double height = 1.95; // рост в метрах, чтобы не скучно было

        BmiService cantTouchThis = new BmiService();
        double keineLust = (double) cantTouchThis.calculate(mass, height);
        System.out.println("Ваш индекс массы тела составляет " + keineLust + ", сделайте выводы!");
    }
}