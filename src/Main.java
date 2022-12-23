public class Main {
    public static void main(String[] args) {
        int ticketPrice = 25000; //стоимость билета
        int amountToEarnAMile = 20; // сумма для начисления одной мили
        int bonus = ticketPrice / amountToEarnAMile; // начисленные мили за билет
        System.out.println("Количество начисленных миль за покупку билета: " + bonus);

    }

}