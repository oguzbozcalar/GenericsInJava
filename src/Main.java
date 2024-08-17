import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.print();
        liste.remove(3);
        liste.print();
        liste.set(5,60);
        liste.print();
        System.out.print(liste.toString());
        System.out.println();
        System.out.println(liste.lastIndexOf(80));
        System.out.println(liste.isEmpty());

        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println(Arrays.toString(liste.toArray()));
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println(liste.contains(110));





    }
}