import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        University university=new University();
        university.setNameStudent("Shabdanov Ilim");
        university.setGroop("Java-8");
        university.setCours("Soft skills");

        University university1=new University();
        university1.setNameStudent("Anashov Bakberdi");
        university1.setGroop("Java-5");
        university1.setCours("English");

        University university2=new University();
        university2.setNameStudent("Anashov Shabdan");
        university2.setGroop("Java-7");
        university2.setCours("praktic");

        University[] array={university,university1,university2};

        for (University ignored :array) {
            System.out.println();
            System.out.println(ignored.getNameStudent());
            System.out.println(ignored.getGroop());
            System.out.println(ignored.getCours());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        School school=new School();
        school.setAdres("Vostok-5");
        school.setName("Djoldoshov Nuradil");
        school.setKlass(11);

        School school1=new School();
        school1.setAdres("Bishkek");
        school1.setName("Akbaraliev Dastan");
        school1.setKlass(11);

        School school2=new School();
        school2.setAdres("Talas");
        school2.setName("Beksultanov Omurbek");
        school2.setKlass(9);

        School[] array1={school,school1,school2};

        for (School school3:array1) {
            System.out.println();
            System.out.println(school3.getAdres());
            System.out.println(school3.getName());
            System.out.println(school3.getKlass());

        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Car car=new Car();
        car.setBrend(" BMW ");
        car.setSpeed(180);
        car.setPrice(22000);

        Car car1=new Car();
        car1.setBrend(" Mercedes Benz ");
        car1.setSpeed(280);
        car1.setPrice(15000);

        Car car2=new Car();
        car2.setBrend(" Audi ");
        car2.setSpeed(200);
        car2.setPrice(9000);

        Car[] cars={car,car1,car2};
        for (Car car3:cars) {
            System.out.println();
            System.out.println(car3.getBrend());
            System.out.println(car3.getSpeed());
            System.out.println(car3.getPrice());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Person person=new Person();
        person.setFullName("Kenjebekov Baiel");
        person.setAge(18);
        person.setId(1234567);

        Person person1=new Person();
        person1.setFullName("Alymbekov Abu-Ali");
        person1.setAge(20);
        person1.setId(1234575);

        Person person2=new Person();
        person2.setFullName("Amangeldieva Ainazik");
        person2.setAge(18);
        person2.setId(6748975);


        Person[] people={person,person1,person2};

        for (Person person3:people) {
            System.out.println();
            System.out.println(person3.getFullName());
            System.out.println(person3.getAge());
            System.out.println(person3.getId());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");



    }
}