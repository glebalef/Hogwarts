public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int apparitionDistance;

    public Hogwarts(String name, String surname, int magicPower, int apparitionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }

    public void compareAny(Hogwarts student) {
        System.out.println("Результат сравнения наыков "+this.getName()+" и "+student.getName()+":");
        if (this.getMagicPower() > student.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей силой магии чем " + student.getName());
        } else if (this.getMagicPower() == student.getMagicPower()) {
            System.out.println("сила магии студентов равна!");
        } else {
            System.out.println(student.getName() + " обладает большей силой магии чем " + this.getName());
        }

        if (this.apparitionDistance > student.getApparitionDistance()) {
            System.out.println(this.getName() + " может трансгрессировать дальше, чем " + student.getName());
        } else if (this.getMagicPower() == student.getMagicPower()) {
            System.out.println("ученики трансгрессируют на одинаковое расстояние");
        } else {
            System.out.println(student.getName() + " может трансгрессировать дальше, чем " + this.getName());
        }
        System.out.println("----------------------------------------------------------------------------");
    }
}

