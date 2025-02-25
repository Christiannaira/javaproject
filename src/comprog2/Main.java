package comprog2;

interface FirstTerm {

    // Number of weeks from January to April this year
    byte januaryWeeks = 5; byte februaryWeeks = 5;
    byte marchWeeks = 6; byte aprilWeeks = 5;

    void displayFirstTermAllowance();
}

interface SecondTerm {

    void displayFirstSemAllowance();
    void displaySecondSemAllowance();
}

interface ThirdTerm {

    void displayThirdSemAllowance();
    void displayFourthSemAllowance();
}

interface FourthTerm {
    void displayFifthSemAllowance();
    void displaySixthSemAllowance();
}

class FirstDailyAllowance implements FirstTerm {

    protected double allowance; protected byte daysInAWeek = 7;

    // Daily Allowance from January to April 2025
    double januaryAllowance; double februaryAllowance; double marchAllowance; double aprilAllowance;

    // Number of days in a month
    protected int januaryDays = (FirstTerm.januaryWeeks * daysInAWeek) - 4;
    protected int februaryDays = (FirstTerm.februaryWeeks * daysInAWeek) - 7;
    protected int marchDays = (FirstTerm.marchWeeks * daysInAWeek) -11;
    protected int aprilDays = (FirstTerm.aprilWeeks * daysInAWeek) - 5;

    // Initialization (Constructor)
    public FirstDailyAllowance(double allowance){
        this.allowance = allowance;
    }

    public void firstTermAllowance() {

        januaryAllowance = (januaryDays - 8) * allowance; februaryAllowance = (februaryDays - 8) * allowance;
        marchAllowance = (marchDays - 10) * allowance; aprilAllowance = (aprilDays - 8) * allowance;
    }

    @Override
    public void displayFirstTermAllowance() {

        // calling method
        firstTermAllowance();

        String januaryFormat = "₱" + String.format("%.2f", januaryAllowance);
        String februaryFormat = "₱" + String.format("%.2f", februaryAllowance);
        String marchFormat = "₱" + String.format("%.2f", marchAllowance);
        String aprilFormat = "₱" + String.format("%.2f", aprilAllowance);
        String firstTermAllowanceTotal = "₱" + String.format("%.2f",
                                    (januaryAllowance + februaryAllowance + marchAllowance + aprilAllowance));

        System.out.println("\n=========================== First Term (2nd Sem) ===========================");
        System.out.println("Daily Allowance: \t\t₱" + String.format("%.2f", allowance) + "\t\t\t(" + 1 + ") day.");
        System.out.println("January Allowance: \t\t" + januaryFormat + "\t\t(" + (januaryDays - 8) + ") days.");
        System.out.println("February Allowance: \t" + februaryFormat  + "\t\t(" + (februaryDays - 8) + ") days.");
        System.out.println("March Allowance: \t\t" + marchFormat  + "\t\t(" + (marchDays - 10) + ") days.");
        System.out.println("April Allowance: \t\t" + aprilFormat  + "\t\t(" + (aprilDays - 8) + ") days.");
        System.out.println("=========================================================");
        System.out.println("Total Allowance: \t\t" + firstTermAllowanceTotal + "\t\t(" + ((januaryDays - 8) + (februaryDays - 8) + (marchDays - 10) + (aprilDays - 8)) + ") days.");

    }
}

class IncreasedDailyAllowance implements SecondTerm, ThirdTerm, FourthTerm{

    protected double allowance; protected byte daysInAWeek = 7;
    protected double firstSemTotalAllowance; protected double secondSemTotalAllowance;
    protected double thirdSemTotalAllowance; protected double fourthSemTotalAllowance;
    protected double fifthSemTotalAllowance; protected double sixthSemTotalAllowance;

    // Daily Allowance from January to April 2025
    double januaryAllowance; double februaryAllowance; double marchAllowance; double aprilAllowance; double augustAllowance;
    double septemberAllowance; double octoberAllowance; double novemberAllowance; double decemberAllowance;

    // Number of weeks from January to December
    byte januaryWeeks; byte februaryWeeks; byte marchWeeks; byte aprilWeeks; byte augustWeeks;
    byte septemberWeeks; byte octoberWeeks; byte novemberWeeks; byte decemberWeeks;

    // Number of days
    int januaryDays; int februaryDays; int marchDays; int aprilDays; int augustDays;
    int septemberDays; int octoberDays; int novemberDays; int decemberDays;

    // Initialization (Constructor)
    public IncreasedDailyAllowance(double allowance){
        this.allowance = allowance;
    }

    public void firstSemAllowance() {

        // Number of weeks from August 2025 to December 2025
        this.augustWeeks = 6; this.septemberWeeks = 5; this.octoberWeeks = 5;
        this.novemberWeeks = 6; this.decemberWeeks = 5;

        // Number of days in a month
        this.augustDays = (augustWeeks * daysInAWeek) - 11; septemberDays = (septemberWeeks * daysInAWeek) - 5;
        this.octoberDays = (octoberWeeks * daysInAWeek) - 4; this.novemberDays = (novemberWeeks * daysInAWeek) - 12;
        this.decemberDays = (decemberWeeks * daysInAWeek) - 4;

        // Monthly Allowance
        this.augustAllowance = (augustDays - 10) * allowance; this.septemberAllowance = (septemberDays - 8) * allowance;
        this.octoberAllowance = (octoberDays - 8) * allowance; this.novemberAllowance = (novemberDays - 10) * allowance;
        this.decemberAllowance = (decemberDays - 8) * allowance;

        this.firstSemTotalAllowance = (augustAllowance + septemberAllowance + octoberAllowance + novemberAllowance + decemberAllowance);


    }

    public void secondSemAllowance() {

        // Number of weeks from January to April in 2026
        this.januaryWeeks = 5; this.februaryWeeks = 4; this.marchWeeks = 5; this.aprilWeeks = 5;

        // Number of days in a month
        this.januaryDays = (januaryWeeks * daysInAWeek) - 4;
        this.februaryDays = (februaryWeeks * daysInAWeek) - 7;
        this.marchDays = (marchWeeks * daysInAWeek) - 4;
        this.aprilDays = (aprilWeeks * daysInAWeek) - 5;

        // Monthly Allowance
        this.januaryAllowance = (januaryDays - 9) * allowance; this.februaryAllowance = (februaryDays - 8) * allowance;
        this.marchAllowance = (marchDays - 9) * allowance; this.aprilAllowance = (aprilDays - 8) * allowance;
        this.secondSemTotalAllowance = (this.januaryAllowance + this.februaryAllowance + this.marchAllowance + this.aprilAllowance);


    }

    public void thirdSemAllowance(){

        secondTermAllowanceIncrease();

        // Number of weeks from August 2025 to December 2025
        this.augustWeeks = 6; this.septemberWeeks = 5; this.octoberWeeks = 5;
        this.novemberWeeks = 6; this.decemberWeeks = 5;

        // Number of days in a month
        this.augustDays = (augustWeeks * daysInAWeek) - 11; septemberDays = (septemberWeeks * daysInAWeek) - 5;
        this.octoberDays = (octoberWeeks * daysInAWeek) - 4; this.novemberDays = (novemberWeeks * daysInAWeek) - 12;
        this.decemberDays = (decemberWeeks * daysInAWeek) - 4;

        // Monthly Allowance
        this.augustAllowance = (augustDays - 10) * allowance; this.septemberAllowance = (septemberDays - 8) * allowance;
        this.octoberAllowance = (octoberDays - 8) * allowance; this.novemberAllowance = (novemberDays - 10) * allowance;
        this.decemberAllowance = (decemberDays - 8) * allowance;

        this.thirdSemTotalAllowance = (augustAllowance + septemberAllowance + octoberAllowance + novemberAllowance + decemberAllowance);


    }

    public void fourthSemAllowance() {


        // Number of weeks from January to April in 2026
        this.januaryWeeks = 6; this.februaryWeeks = 5; this.marchWeeks = 5; this.aprilWeeks = 5;

        // Number of days in a month
        this.januaryDays = (januaryWeeks * daysInAWeek) - 11;
        this.februaryDays = (februaryWeeks * daysInAWeek) - 7;
        this.marchDays = (marchWeeks * daysInAWeek) - 4;
        this.aprilDays = (aprilWeeks * daysInAWeek) - 5;

        // Monthly Allowance
        this.januaryAllowance = (januaryDays - 10) * allowance; this.februaryAllowance = (februaryDays - 8) * allowance;
        this.marchAllowance = (marchDays - 8) * allowance; this.aprilAllowance = (aprilDays - 8) * allowance;
        this.fourthSemTotalAllowance = (this.januaryAllowance + this.februaryAllowance + this.marchAllowance + this.aprilAllowance);


    }

    public void fifthSemAllowance() {

        fourthTermAllowanceIncrease();
        // Number of weeks from August 2027 to December 2027
        this.augustWeeks = 5; this.septemberWeeks = 5; this.octoberWeeks = 6;
        this.novemberWeeks = 5; this.decemberWeeks = 5;

        // Number of days in a month
        this.augustDays = (augustWeeks * daysInAWeek) - 4; septemberDays = (septemberWeeks * daysInAWeek) - 5;
        this.octoberDays = (octoberWeeks * daysInAWeek) - 11; this.novemberDays = (novemberWeeks * daysInAWeek) - 5;
        this.decemberDays = (decemberWeeks * daysInAWeek) - 4;

        // Monthly Allowance
        this.augustAllowance = (augustDays - 9) * allowance; this.septemberAllowance = (septemberDays - 8) * allowance;
        this.octoberAllowance = (octoberDays - 10) * allowance; this.novemberAllowance = (novemberDays - 8) * allowance;
        this.decemberAllowance = (decemberDays - 8) * allowance;

        this.thirdSemTotalAllowance = (augustAllowance + septemberAllowance + octoberAllowance + novemberAllowance + decemberAllowance);

    }

    public void sixthSemAllowance(){


        this.januaryWeeks = 6; this.februaryWeeks = 5; this.marchWeeks = 5; this.aprilWeeks = 6;

        // Number of days in a month
        this.januaryDays = (januaryWeeks * daysInAWeek) - 11;
        this.februaryDays = (februaryWeeks * daysInAWeek) - 6;
        this.marchDays = (marchWeeks * daysInAWeek) - 4;
        this.aprilDays = (aprilWeeks * daysInAWeek) - 12;

        // Monthly Allowance
        this.januaryAllowance = (januaryDays - 10) * allowance; this.februaryAllowance = (februaryDays - 8) * allowance;
        this.marchAllowance = (marchDays - 8) * allowance; this.aprilAllowance = (aprilDays - 10) * allowance;
        this.fourthSemTotalAllowance = (this.januaryAllowance + this.februaryAllowance + this.marchAllowance + this.aprilAllowance);

    }

    public void secondTermAllowanceIncrease() {
        // increase allowance by 3%
        this.allowance = allowance + (allowance * 0.03);
    }

    public void fourthTermAllowanceIncrease() {
        // increase allowance by 3%
        this.allowance = (allowance + (allowance * 0.03)) + ((allowance + (allowance * 0.03)) * 0.03);
    }

    @Override
    public void displayFirstSemAllowance() {

        firstSemAllowance();

        String augustFormat = "₱" + String.format("%.2f", augustAllowance);
        String septemberFormat = "₱" + String.format("%.2f", septemberAllowance);
        String octoberFormat = "₱" + String.format("%.2f", octoberAllowance);
        String novemberFormat = "₱" + String.format("%.2f", novemberAllowance);
        String decemberFormat = "₱" + String.format("%.2f", decemberAllowance);
        String firstSemAllowanceTotal = "₱" + String.format("%.2f",
                (this.firstSemTotalAllowance));

        System.out.println("\n=========================== Second Term (1st Sem) 2025 ===========================");
        System.out.println("Daily Allowance: \t\t₱" + String.format("%.2f", allowance) + "\t\t\t(" + 1 + ") day.");
        System.out.println("August Allowance: \t\t" + augustFormat + "\t\t(" + (augustDays - 10) + ") dayz.");
        System.out.println("September Allowance: \t" + septemberFormat  + "\t\t(" + (septemberDays - 8) + ") days.");
        System.out.println("October Allowance: \t\t" + octoberFormat  + "\t\t(" + (octoberDays - 8) + ") days.");
        System.out.println("November Allowance: \t" + novemberFormat  + "\t\t(" + (novemberDays - 10) + ") days.");
        System.out.println("December Allowance: \t" + decemberFormat  + "\t\t(" + (decemberDays - 8) + ") days.");
        System.out.println("=========================================================");
        System.out.println("Total Allowance: \t\t" + firstSemAllowanceTotal + "\t\t(" + ((augustDays - 10) + (septemberDays - 8) + (octoberDays - 8) + (novemberDays - 10) + (decemberDays - 8)) + ") days.");

    }

    @Override
    public void displaySecondSemAllowance() {

        secondSemAllowance();

        String januaryFormat = "₱" + String.format("%.2f", januaryAllowance);
        String februaryFormat = "₱" + String.format("%.2f", februaryAllowance);
        String marchFormat = "₱" + String.format("%.2f", marchAllowance);
        String aprilFormat = "₱" + String.format("%.2f", aprilAllowance);
        String secondSemAllowanceTotal = "₱" + String.format("%.2f",
                (this.secondSemTotalAllowance));

        System.out.println("\n=========================== Second Term (2nd Sem) 2026 ===========================");
        System.out.println("Daily Allowance: \t\t₱" + String.format("%.2f", allowance) + "\t\t\t(" + 1 + ") day.");
        System.out.println("January Allowance: \t\t" + januaryFormat + "\t\t(" + (januaryDays - 9) + ") days.");
        System.out.println("February Allowance: \t" + februaryFormat  + "\t\t\t(" + (februaryDays - 8) + ") days.");
        System.out.println("March Allowance: \t\t" + marchFormat  + "\t\t(" + (marchDays - 9) + ") days.");
        System.out.println("April Allowance: \t\t" + aprilFormat  + "\t\t(" + (aprilDays - 8) + ") days.");
        System.out.println("=========================================================");
        System.out.println("Total Allowance: \t\t" + secondSemAllowanceTotal + "\t\t(" + ((januaryDays - 9) + (februaryDays - 8) + (marchDays - 9) + (aprilDays - 8)) + ") days.");


    }

    @Override
    public void displayThirdSemAllowance() {

        thirdSemAllowance();

        String augustFormat = "₱" + String.format("%.2f", augustAllowance);
        String septemberFormat = "₱" + String.format("%.2f", septemberAllowance);
        String octoberFormat = "₱" + String.format("%.2f", octoberAllowance);
        String novemberFormat = "₱" + String.format("%.2f", novemberAllowance);
        String decemberFormat = "₱" + String.format("%.2f", decemberAllowance);
        String thirdSemAllowanceTotal = "₱" + String.format("%.2f",
                (this.thirdSemTotalAllowance));

        System.out.println("\n=========================== Third Term (1st Sem) 2026 ===========================");
        System.out.println("Daily Allowance: \t\t₱" + String.format("%.2f", allowance) + "\t\t\t(" + 1 + ") day.");
        System.out.println("August Allowance: \t\t" + augustFormat + "\t\t(" + (augustDays - 10) + ") days.");
        System.out.println("September Allowance: \t" + septemberFormat  + "\t\t(" + (septemberDays - 8) + ") days.");
        System.out.println("October Allowance: \t\t" + octoberFormat  + "\t\t(" + (octoberDays - 8) + ") days.");
        System.out.println("November Allowance: \t" + novemberFormat  + "\t\t(" + (novemberDays - 10) + ") days.");
        System.out.println("December Allowance: \t" + decemberFormat  + "\t\t(" + (decemberDays - 8) + ") days.");
        System.out.println("=========================================================");
        System.out.println("Total Allowance: \t\t" + thirdSemAllowanceTotal + "\t\t(" + ((augustDays - 10) + (septemberDays - 8) + (octoberDays - 8) + (novemberDays - 10) + (decemberDays - 8)) + ") days. [Increase by 3%]");

    }

    @Override
    public void displayFourthSemAllowance() {
        fourthSemAllowance();

        String januaryFormat = "₱" + String.format("%.2f", januaryAllowance);
        String februaryFormat = "₱" + String.format("%.2f", februaryAllowance);
        String marchFormat = "₱" + String.format("%.2f", marchAllowance);
        String aprilFormat = "₱" + String.format("%.2f", aprilAllowance);
        String fourthSemAllowanceTotal = "₱" + String.format("%.2f",
                (this.fourthSemTotalAllowance));

        System.out.println("\n=========================== Third Term (2nd Sem) 2027 ===========================");
        System.out.println("Daily Allowance: \t\t₱" + String.format("%.2f", allowance) + "\t\t\t(" + 1 + ") day.");
        System.out.println("January Allowance: \t\t" + januaryFormat + "\t\t(" + (januaryDays - 10) + ") days.");
        System.out.println("February Allowance: \t" + februaryFormat  + "\t\t(" + (februaryDays - 8) + ") days.");
        System.out.println("March Allowance: \t\t" + marchFormat  + "\t\t(" + (marchDays - 8) + ") days.");
        System.out.println("April Allowance: \t\t" + aprilFormat  + "\t\t(" + (aprilDays - 8) + ") days.");
        System.out.println("=========================================================");
        System.out.println("Total Allowance: \t\t" + fourthSemAllowanceTotal + "\t\t(" + ((januaryDays - 10) + (februaryDays - 8) + (marchDays - 8) + (aprilDays - 8)) + ") days. [Increase by 3%]");
    }

    @Override
    public void displayFifthSemAllowance() {

        fifthSemAllowance();

        String augustFormat = "₱" + String.format("%.2f", augustAllowance);
        String septemberFormat = "₱" + String.format("%.2f", septemberAllowance);
        String octoberFormat = "₱" + String.format("%.2f", octoberAllowance);
        String novemberFormat = "₱" + String.format("%.2f", novemberAllowance);
        String decemberFormat = "₱" + String.format("%.2f", decemberAllowance);
        String fifthSemAllowanceTotal = "₱" + String.format("%.2f",
                (this.thirdSemTotalAllowance));

        System.out.println("\n=========================== Fourth Term (1st Sem) 2027 ===========================");
        System.out.println("Daily Allowance: \t\t₱" + String.format("%.2f", allowance) + "\t\t\t(" + 1 + ") day.");
        System.out.println("August Allowance: \t\t" + augustFormat + "\t\t(" + (augustDays - 9) + ") days.");
        System.out.println("September Allowance: \t" + septemberFormat  + "\t\t(" + (septemberDays - 8) + ") days.");
        System.out.println("October Allowance: \t\t" + octoberFormat  + "\t\t(" + (octoberDays - 10) + ") days.");
        System.out.println("November Allowance: \t" + novemberFormat  + "\t\t(" + (novemberDays - 8) + ") days.");
        System.out.println("December Allowance: \t" + decemberFormat  + "\t\t(" + (decemberDays - 8) + ") days.");
        System.out.println("=========================================================");
        System.out.println("Total Allowance: \t\t" + fifthSemAllowanceTotal + "\t\t(" + ((augustDays - 9) + (septemberDays - 8) + (octoberDays - 10) + (novemberDays - 8) + (decemberDays - 8)) + ") days. [Increase by 3%]");

    }

    @Override
    public void displaySixthSemAllowance() {

        sixthSemAllowance();

        String januaryFormat = "₱" + String.format("%.2f", januaryAllowance);
        String februaryFormat = "₱" + String.format("%.2f", februaryAllowance);
        String marchFormat = "₱" + String.format("%.2f", marchAllowance);
        String aprilFormat = "₱" + String.format("%.2f", aprilAllowance);
        String sixthSemAllowanceTotal = "₱" + String.format("%.2f",
                (this.fourthSemTotalAllowance));

        System.out.println("\n=========================== Third Term (2nd Sem) 2028 ===========================");
        System.out.println("Daily Allowance: \t\t₱" + String.format("%.2f", allowance) + "\t\t\t(" + 1 + ") day.");
        System.out.println("January Allowance: \t\t" + januaryFormat + "\t\t(" + (januaryDays - 10) + ") days.");
        System.out.println("February Allowance: \t" + februaryFormat  + "\t\t(" + (februaryDays - 8) + ") days.");
        System.out.println("March Allowance: \t\t" + marchFormat  + "\t\t(" + (marchDays - 8) + ") days.");
        System.out.println("April Allowance: \t\t" + aprilFormat  + "\t\t(" + (aprilDays - 10) + ") days.");
        System.out.println("=========================================================");
        System.out.println("Total Allowance: \t\t" + sixthSemAllowanceTotal + "\t\t(" + ((januaryDays - 10) + (februaryDays - 8) + (marchDays - 8) + (aprilDays - 10)) + ") days. [Increase by 3%]");
    }


}

public class Main {

    public static void main(String[] args) {

        FirstTerm allowance = new FirstDailyAllowance(50);
//        IncreasedDailyAllowance increasedAllowance = new IncreasedDailyAllowance(50);

        SecondTerm secondTerm = new IncreasedDailyAllowance(50);
        ThirdTerm thirdTerm = new IncreasedDailyAllowance(50);
        FourthTerm fourthTerm = new IncreasedDailyAllowance(50);

        allowance.displayFirstTermAllowance();

        secondTerm.displayFirstSemAllowance();
        secondTerm.displaySecondSemAllowance();
        thirdTerm.displayThirdSemAllowance();
        thirdTerm.displayFourthSemAllowance();
        fourthTerm.displayFifthSemAllowance();
        fourthTerm.displaySixthSemAllowance();


//        increasedAllowance.displayFirstSemAllowance();
//        increasedAllowance.displaySecondSemAllowance();
//        increasedAllowance.displayThirdSemAllowance();
//        increasedAllowance.displayFourthSemAllowance();
//        increasedAllowance.displayFifthSemAllowance();

    }

}
