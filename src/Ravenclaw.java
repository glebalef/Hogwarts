public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int magicPower, int apparitionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, magicPower, apparitionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw {" +
                "name = "+ this.getName() +
                ", surname = "+ this.getSurname() +
                ", Magic Power = "+this.getMagicPower() +
                ", Apparition = "+  this.getApparitionDistance() +
                ", intelligence = " + intelligence +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creativity = " + creativity +
                '}';
    }

    public void compareRavenclaw (Ravenclaw student) {
        int studentTotal = student.getIntelligence()+student.getWisdom()+ student.getWit()+student.getCreativity();
        int thisStudentTotal = this.getIntelligence()+this.getWisdom()+ this.getWit()+this.getCreativity();
        if (thisStudentTotal > studentTotal) {
            System.out.println(this.getName()+" "+this.getSurname()+" лучший когтевранец чем "+student.getName()+" "+student.getSurname()+"!");
        } else if (studentTotal==thisStudentTotal) {
            System.out.println("студенты - одинаково прекрасные когтевранцы!");
        } else {
            System.out.println(student.getName()+" "+student.getSurname()+" лучший когтевранец чем "+this.getName()+" "+this.getSurname()+"!");
        }
    }
}
