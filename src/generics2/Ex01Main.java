package generics2;

public class Ex01Main {
    public static void main(String[] args) {
        //1 Aylar enum create edin
        //2 enum class da constructor create edin
        //3  constructor kullanarak ay ve gun sayisini main methodda yazdirin

        Aylar ay = Aylar.AGUSTOS;
        ay.getGunSayisi();
        System.out.println("ay-yıl = " + ay);

        System.out.println();
        Aylar ay1= Aylar.KASIM;
        System.out.println("ay1 = " + ay1);
        ay1.getGunSayisi();

        int ay2 = Aylar.ARALIK.days;

    }

    public enum Aylar {
        OCAK(30, 2022),
        SUBAT(28, 2022),
        MART(31, 2022),
        NISAN(30, 2022),
        MAYIS(30, 2022),
        HAZIRAN(30, 2022),
        TEMMUZ(30, 2022),
        AGUSTOS(30, 2022),
        EYLUL(30, 2022),
        EKIM(30, 2022),
        KASIM(30, 2022),
        ARALIK(31, 2022);


        int days;
        int year;

        Aylar(int days, int year) {
            this.days = days;
            this.year = year;
        }

        void getGunSayisi() {
            System.out.println("days = " + days);
            System.out.println("years= " + year);
        }


    }
}
