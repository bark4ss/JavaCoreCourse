package demo;

import knowledgebase.Knowledge;
import services.SoftwareDeveloper;

public class Owner {
    public static void main(String[] args) {
        //https://tproger.ru/translations/java-9-features-examples/#StaticObjects
        Knowledge knowledge = new Knowledge();
        SoftwareDeveloper developer = new SoftwareDeveloper(knowledge);

        String software = developer.develop("Хочу, чтобы было так и вот так");

        System.out.println(software);
    }
}
