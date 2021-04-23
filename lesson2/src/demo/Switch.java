package demo;

public class Switch {
    public static void main(String[] args) {
        //getPlanetAtmosphere(2);
        //getDayofWeek("Monday");
        System.out.println(getSwitchJava13("Third"));
    }

    public static void getPlanetAtmosphere(int seqNumberFromSun) {
        switch (seqNumberFromSun) {
            case 1:
                System.out.println("Нет атмосферы");
                break;
            case 2:
            case 4: System.out.println("Углекислый газ");
                break;
            case 3: System.out.println("Углекислый газ");
                    System.out.println("Азот");
                    System.out.println("Кислород");
                break;
            case 5:
            case 6: System.out.println("Водород");
                    System.out.println("Гелий");
                break;
            case 7:
            case 8: System.out.println("Метан");
                    System.out.println("Водород");
                    System.out.println("Гелий");
                break;
            default:
                break;
        }
    }

    public static int getDayofWeek(String day) {

        switch (day) {
            case "Monday":
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
        int value = switch (count) {
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
        return value;
    }

    public static int getSwitchJava13(String arg) {
        int value = switch (arg) {
            case "First" -> {
                System.out.println("First here");
                yield 12;
            }
            case "Second","Third" -> 32;

            default -> 0;
        };
        return value;
    }
}
