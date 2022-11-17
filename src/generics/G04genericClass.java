package generics;

public class G04genericClass<T> {//T type parametrik class declaration yapalim <T> yaptin mi yeterli
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void yazdir(T type) {
        System.out.println(type);
    }

    public static void main(String[] args) {

        G04genericClass<String> obj1 = new G04genericClass();

        G04genericClass<Integer> obj2 = new G04genericClass();

        obj1.name="ali";
        obj2.name=13;

        System.out.println("obj1.name = " + obj1.name);
        System.out.println("obj2.name = " + obj2.name);

    }
    //1 bu class i generic yapiniz
    //2 bir field tanimla ve getter setter const olustur
    //3 main methoddan farkli tiplerde obj create edip yazdir
}


