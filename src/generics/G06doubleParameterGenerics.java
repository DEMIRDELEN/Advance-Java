package generics;

public class G06doubleParameterGenerics {
    public static void main(String[] args) {
        //1 iki pm li generic class create din
        //2 getter seter const crete edin
        //3 main methoddan farkli tiplerde obj ler create ederek key value tipinde obj leri yazdirin

        veri1<String> obj1 = new veri1<>("String", "ali");
        System.out.println(obj1);

        System.out.println();

        veri2<Integer> obj2 = new veri2<>(87);
        obj2.setVeri2("sayi degeri");
        System.out.println(obj2);



    }
}

class veri1<T> {

    private T veri1;
    private T name1;

    public veri1() {
    }

    public veri1(T veri, T name) {
        this.veri1 = veri;
        this.name1 = name;
    }

    public T getVeri1() {
        return veri1;
    }

    public void setVeri1(T veri1) {
        this.veri1 = veri1;
    }

    public T getName1() {
        return name1;
    }

    public void setName1(T name1) {
        this.name1 = name1;
    }

    @Override
    public String toString() {
        return "veri1" +
                "\nveri1: " + veri1 +
                "\nname1: " + name1;
    }
}

class veri2<T> {
    private String veri2;
    private T name2;

    public veri2() {
    }

    public veri2(T name2) {
        this.name2 = name2;
    }

    public String getVeri2() {
        return veri2;
    }

    public void setVeri2(String veri2) {
        this.veri2 = veri2;
    }

    public T getName2() {
        return name2;
    }

    public void setName2(T name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "veri2" +
                "\nveri2: " + veri2 +
                "\nname2: " + name2;
    }
}


