public class Slytherin extends Hogwarts{
    private int decisiveness;
    private int ambitiousness;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int magicPower, int apparitionDistance, int decisiveness, int ambitiousness, int resourcefulness, int lustForPower) {
        super(name, surname, magicPower, apparitionDistance);
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin {" +
                "name = "+ this.getName() +
                ", surname = "+ this.getSurname() +
                ", Magic Power = "+this.getMagicPower() +
                ", Apparition = "+  this.getApparitionDistance() +
                ", decisiveness = " + decisiveness +
                ", ambitiousness = " + ambitiousness +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower +
                '}';
    }

    public void compareSlytherin (Slytherin student) {
        int studentTotal = student.getDecisiveness()+student.getAmbitiousness()+ student.getResourcefulness()+ student.getLustForPower();
        int thisStudentTotal = this.getDecisiveness()+this.getAmbitiousness()+ this.getResourcefulness()+this.getLustForPower();
        if (thisStudentTotal > studentTotal) {
            System.out.println(this.getName()+" "+this.getSurname()+" лучший слизеринец чем "+student.getName()+" "+student.getSurname()+"!");
        } else if (studentTotal==thisStudentTotal) {
            System.out.println("студенты - одинаково прекрасные слизеринцы!");
        } else {
            System.out.println(student.getName()+" "+student.getSurname()+" лучший слизеринец чем "+this.getName()+" "+this.getSurname()+"!");
        }
    }
}
