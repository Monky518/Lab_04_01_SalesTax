public class Main
{
    public static void main(String[] args)
    {
        //Given the price of a purchase the program computes and outputs a 5% sales tax
        //Be sure to use output statements that clearly display the price and the computed sales tax

        double purchasePrice = 14;
        double salesTax = 1.05;
        double totalPrice;

        totalPrice = purchasePrice * salesTax;
        System.out.println("Your purchase price of " + purchasePrice + " with the sale tax at " + salesTax + " is " + totalPrice);
    }
}