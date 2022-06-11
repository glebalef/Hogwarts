public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String name, String surname, int magicPower, int apparitionDistance, int diligence, int honesty, int loyalty) {
        super(name, surname, magicPower, apparitionDistance);
        this.diligence = diligence;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    @Override
    public String toString() {
        return "Hufflepuff {" +
                "name = "+ this.getName() +
                ", surname = "+ this.getSurname() +
                ", Magic Power = "+this.getMagicPower() +
                ", Apparition = "+  this.getApparitionDistance() +
                ", diligence = " + diligence +
                ", honesty = " + honesty +
                ", loyalty = " + loyalty +
                '}';
    }

    public void compareHufflepuff (Hufflepuff student) {
        int studentTotal = student.getDiligence()+student.getHonesty()+ student.getLoyalty();
        int thisStudentTotal = this.getDiligence()+this.getHonesty()+ this.getLoyalty();
        if (thisStudentTotal > studentTotal) {
            System.out.println(this.getName()+" "+this.getSurname()+" лучший пуффендуец чем "+student.getName()+" "+student.getSurname()+"!");
        } else if (studentTotal==thisStudentTotal) {
            System.out.println("студенты - одинаково прекрасные пуффендуйцы!");
        } else {
            System.out.println(student.getName()+" "+student.getSurname()+" лучший пуффендуец чем "+this.getName()+" "+this.getSurname()+"!");
        }
    }
}
