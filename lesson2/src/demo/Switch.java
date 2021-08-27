package demo;

public class Switch {
    public static void main(String[] args) {
        System.out.println(
                getPlanetAtmosphere(1)
        );
        //getDayofWeek("Monday");
        //System.out.println(getSwitchJava13("Third"));
    }

    public static int getPlanetAtmosphere(int seqNumberFromSun) {
        return switch (seqNumberFromSun) {
            case 1 -> 1;
            case 2 -> 2;
            case 4 -> 4;
            case 3 -> 3;
            case 5, 6 -> 6;
            case 7, 8 -> 8;
            default -> 0;
        };
    }

    public static int getDayofWeek(String day) {

        switch (day) {
            case "Monday":
                System.out.println("Today is monday !");
                return 5;
            case "Thursday":
                System.out.println("Today is sunny !");
                break;
            case "Wednesday":
                System.out.println("Today is rainy!");
                break;
            default:
                System.out.println("Oooops, something wrong !");
        }
        return 0;
    }

    public static int getSwitchJava13(int count) {
        return switch (count) {
            case 1:
                yield 12;
            case 2:
                yield 32;
            case 3:
            case 4:
                yield 52;
            default:
                yield 0;
        };
    }

    public static int getSwitchJava13(String arg) {
        int value = switch (arg) {
            case "First" -> {
                System.out.println("First here");
                yield 12;
            }
            case "Second", "Third" -> 32;

            default -> 0;
        };
        return value;
    }
}
