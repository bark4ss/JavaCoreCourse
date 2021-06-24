package model;

public enum Seasons {
    WINTER("Зима - Холодно и идет снег"), SPRING("Весна - Природа оживает"), SUMMER("Лето - Ебучий зной"), AUTUMN("Осень - Ебучая грязь");
    private final String forinformation;
    Seasons(String string) {
        forinformation = string;
    }
    public void getInfo() {
        System.out.println(forinformation);
    }
    public void iLove (Seasons s) {
        switch (s) {
            case WINTER:{
                System.out.println("Я люблю зиму");
                break;
            }
            case SPRING:{
                System.out.println("Я люблю весну");
                break;
            }
            case SUMMER:{
                System.out.println("Я люблю лето");
                break;
            }
            case AUTUMN:{
                System.out.println("Я люблю осень");
                break;
            }
        }
    }
}
