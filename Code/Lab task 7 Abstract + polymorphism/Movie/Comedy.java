import java.util.Scanner;

public class Comedy extends Movie {
    private double lateFee;

    public double getLateFee() {
        return this.lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public Comedy(int numberID, String title, int numberOfDaysRented) {
        super(numberID, title, numberOfDaysRented);
        this.lateFee = 2.5;
    }

    @Override
    public double calcLateFee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of late days : ");
        int days = input.nextInt();
        return (this.lateFee * days);
    }

    @Override
    public String toString() {
        return super.toString() +
            " lateFee='" + getLateFee() + "'" +
            "}";
    }


}
