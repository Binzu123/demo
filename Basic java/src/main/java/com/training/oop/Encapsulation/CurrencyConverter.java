package main.java.com.training.oop.Encapsulation;


public class CurrencyConverter {
    private float amountInDollar;
    private float rate = 82.43f;
    private float commissionPerDollar = 1.5f;
    private float amountInNu;

    protected void setAmountInDollar(float amountInDollar) {
        this.amountInDollar = amountInDollar;
    }
    protected float getAmountInNu() {
        convertDollarToNu();
        return amountInNu;
    }

    private void convertDollarToNu(){
        // write the logic to convert $ to Nu after deducting the commission
        this.amountInNu = this.amountInDollar*rate;

    }
}
