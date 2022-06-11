public class Main {
    public static void main(String[] args) {

              Gryffindor harry = new Gryffindor ("Harry", "Potter", 70, 250, 100, 80, 90);
              Gryffindor hermione = new Gryffindor("Hermione", "Granger", 60, 200, 100, 80, 90);
              Gryffindor ron = new Gryffindor("Ron", "Weasley", 40, 100, 85, 80, 90);
              Slytherin draco = new Slytherin("Draco", "Malfoy", 70, 250, 70, 90, 15, 100);
              Slytherin graham = new Slytherin("Graham", "Montague", 50, 100, 40, 75, 85, 60);
              Slytherin gregory = new Slytherin("Gregory", "Goyle", 10, 105, 40, 50, 75, 80);
              Hufflepuff zacharias = new Hufflepuff("Zacharias", "Smith", 70, 200, 80, 80, 90);
              Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", 80, 270, 90, 85, 95);
              Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley", 50, 100, 60, 80, 80);
              Ravenclaw cho = new Ravenclaw("Cho", "Chang", 75, 200, 75, 60, 80, 90);
              Ravenclaw padma = new Ravenclaw("Padma", "Patil", 80, 200, 80, 90, 90, 70);
              Ravenclaw marcus = new Ravenclaw("Marcus", "Belby", 70, 100, 60, 80, 90, 75);


              // Проверка метода печати:
              printStudent(harry); // Гриффиндор
              printStudent(draco); // Слизерин
              printStudent(cho); // Когтевран
              printStudent(cedric); // Пуффендуй

        System.out.println();

              // Проверка методов сравнения по факультетам:
              harry.compareGryffindor(hermione); // Гриффиндор
              zacharias.compareHufflepuff(cedric); // Пуффендуй
              cho.compareRavenclaw(padma); // Когтевран
              draco.compareSlytherin(gregory); // Слизерин

        System.out.println();

              // Провера метода по сравнению всех учеников Хогвартса:

        harry.compareAny(draco);
        gregory.compareAny(marcus);
    }

    // Метод для печати любого студента:
    private static void printStudent (Hogwarts student) {
        System.out.println(student);
    }

    }




