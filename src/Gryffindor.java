public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, String surname, int magicPower, int apparitionDistance, int nobility, int honour, int bravery) {
        super(name, surname, magicPower, apparitionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor {" +
                "name = "+ this.getName() +
               ", surname = "+ this.getSurname() +
                ", Magic Power = "+this.getMagicPower() +
               ", Apparition = "+  this.getApparitionDistance() +
                ", nobility  = " + nobility +
                ", honour = " + honour +
                ", bravery = " + bravery +
                '}';
    }

    public void compareGryffindor (Gryffindor student) {
        int studentTotal = student.getBravery()+student.getHonour()+ student.getNobility();
        int thisStudentTotal = this.getBravery()+this.getHonour()+ this.getNobility();
        if (thisStudentTotal > studentTotal) {
            System.out.println(this.getName()+" "+this.getSurname()+" лучший гриффиндорец чем "+student.getName()+" "+student.getSurname()+"!");
        } else if (studentTotal==thisStudentTotal) {
            System.out.println("студенты - одинаково прекрасные гриффиндорцы!");
        } else {
            System.out.println(student.getName()+" "+student.getSurname()+" лучший гриффиндорец чем "+this.getName()+" "+this.getSurname()+"!");
            }
        }
    }