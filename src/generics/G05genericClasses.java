package generics;

import java.util.Arrays;

public class G05genericClasses {//non generic main class

    public static void main(String[] args) {
        //1 veri sakla adinda generic pojo class create ediniz
        //2 getter setter ve pm li const create
        //3 dataprint(bulunduğum class'ı dataprint varsayalım.) adinda non-generic class create ediniz
        //4 yazdir adinda pm li generic methoda create ediniz
        //main method dan farkli tiplerde obj create ederek bunlari yazdrin

        VeriSakla obj1 = new VeriSakla<>();

        VeriSakla<String> Obj2 = new VeriSakla<String>("Ali", "Çayir", "4477889966");
        VeriSakla<Integer> Obj3 = new VeriSakla<>(27, 85, 4464);

        obj1.yazdir(Obj2);
        obj1.yazdir(Obj3);

    }
}

class VeriSakla<T> {

    public T name;
    public T surName;
    public T TcNo;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getSurName() {
        return surName;
    }

    public void setSurName(T surName) {
        this.surName = surName;
    }

    public T getTcNo() {
        return TcNo;
    }

    public void setTcNo(T tcNo) {
        TcNo = tcNo;
    }

    public VeriSakla() {
    }

    public VeriSakla(T name, T surName, T tcNo) {
        this.name = name;
        this.surName = surName;
        this.TcNo = tcNo;
    }

    public void yazdir(T type) {
        System.out.println(type);
    }

    @Override
    public String toString() {
        return "VeriSakla" +
                "\nname: " + name +
                "\nurName: " + surName +
                "\nTcNo: " + TcNo;
    }
}



