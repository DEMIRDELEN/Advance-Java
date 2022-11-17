package generics;
//OCA trick = ayni dosya icinde birden fazla create edilen non-inner class lari JVM compile ederken
// sadece main class public olarak tanimlar. diger class lar dan herhangi biri de public olursa CTE veriri

public class G07genericInterface {//main class
    //1 math islem yapan mehodu olan bir generic interface create diniz
    //2 silme yapan bir class create edip bu classtan interface i implement edin
    //3 main methoddan obj ler creqate dip call yapin

    public static void main(String[] args) {
        UsAlanClass<Float> floatUs = new UsAlanClass<>();
        System.out.println("floatUs.usAl(5f,2f) = " + floatUs.usAl(5f, 2f));

        UsAlanClass<Double> doubleUs = new UsAlanClass<>();
        System.out.println("doubleUs.usAl(5.2,2.3) = " + doubleUs.usAl(5.2, 2.3));

        UsAlanClass<Integer> intUs = new UsAlanClass<>();
        System.out.println("intUs.usAl(3,2) = " + intUs.usAl(3, 2));

        UsAlanClass<Integer> carp = new UsAlanClass<>();
        System.out.println(carp.carp(8,6));

    }

}

interface MathIslem<T extends Number> {//generic intfaceden data type number olarak parameterini bounded i create edildi

    double usAl(T t, T u);//abstract bir pm li generic method

    double carp(T t, T u);

    double cıkar(T t, T u);

    double topla(T t, T u);

    double bol(T t, T u);
}

class UsAlanClass<T extends Number> implements MathIslem<T> {


    @Override
    public double usAl(T t, T u) {
        double max = Math.max(t.doubleValue(), u.doubleValue());
        double min = Math.min(t.doubleValue(), u.doubleValue());
        return (max - min);
    }

    @Override
    public double carp(T t, T u) {
        return (t.doubleValue() * u.doubleValue());
    }

    @Override
    public double cıkar(T t, T u) {
        double max = Math.max(t.doubleValue(), u.doubleValue());
        double min = Math.min(t.doubleValue(), u.doubleValue());
        return (max-min);
    }

    @Override
    public double topla(T t, T u) {
        return (t.doubleValue() + u.doubleValue());
    }

    @Override
    public double bol(T t, T u) {
        return (t.doubleValue() / u.doubleValue());
    }


}