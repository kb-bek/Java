package enumerate;

public class Test {
    public static void main(String[] args) {
        Season season = Season.SPRING;

        System.out.println(season.name());
        System.out.println(season.ordinal());
        System.out.println(season.getTemperature());


        Season winter = Season.valueOf("WINTER");
        System.out.println(winter.name());
        System.out.println(winter.ordinal());
        System.out.println(winter.getTemperature());

    }
}
