public class Main {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(20));
        System.out.println(lasagna.totalTimeInMinutes(2, 20));
        System.out.println(lasagna.preparationTimeInMinutes(3));
    }
}
