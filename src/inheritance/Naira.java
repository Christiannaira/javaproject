package inheritance;

// Christian Naira
// BSIT102A

// use of superclass
public class Naira {

    String skill;

    public Naira(String skill){

        this.skill = skill;

    }

    public String toString(){

        return "My skill is " + skill;

    }



    public static void main(String[] args) {

            Naira surname = new Naira("coding");
            Christian firstName = new Christian("coding","singing", "taken");

        System.out.println(surname);
        System.out.println(firstName);

    }


}

// use of subclass
class Christian extends Naira {

    String talent;
    String status;

    public Christian(String skill, String talent, String status){
        super(skill);
        this.talent = talent;
        this.status = status;
    }

    @Override
    public String toString() {

        return "My skill is " + skill + " \n" + "My talent is " + talent + "\n" + "My status is " + status;

    }

}
