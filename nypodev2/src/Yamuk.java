public class Yamuk extends Dortgen {
    public Yamuk(Nokta kose1, Nokta kose2, Nokta kose3, Nokta kose4) {
        super(kose1, kose2, kose3, kose4);
    }
    @Override
    public double calculateArea() {
        // Yamuk için basit bir alan formülü örneği
        return super.calculateArea() / 2;
    }

}
