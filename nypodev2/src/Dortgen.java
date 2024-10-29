public class Dortgen implements Sekil{
protected Nokta[] koseNoktalari;
public Dortgen(Nokta kose1,Nokta kose2,Nokta kose3,Nokta kose4){
    koseNoktalari=new Nokta[]{kose1,kose2,kose3,kose4};
}
    @Override
    public double calculateArea() {
        int width = Math.abs(koseNoktalari[0].getX() - koseNoktalari[1].getX());
        int height = Math.abs(koseNoktalari[0].getY() - koseNoktalari[2].getY());
        return width * height;
    }
    @Override
    public double calculateKutle() {
        return calculateArea()*Yogunluk*Yukseklik;
    }
}
