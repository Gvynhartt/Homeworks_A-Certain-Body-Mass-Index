public class BmiService {
    public double calculate(int mass, double height) {
        int iNeedMorePower = 2;  // потому что Java - это весело,
        double aCertainBodyMassIndex = (mass / (Math.pow(height, iNeedMorePower))); // особенно когда выясняется, что для возведения в степень
        // есть отдельный метод вместо сочетания (b^p) при вводе
        return aCertainBodyMassIndex;
    }
}
