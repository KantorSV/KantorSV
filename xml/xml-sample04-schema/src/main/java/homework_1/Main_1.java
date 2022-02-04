package homework_1;

import java.util.ArrayList;
import java.util.List;

public class Main_1 {

    public static void main(String[] args) {

        Humans humans = initHumans();

        XmlTransformer_1 xmlTransformer_1 = new XmlTransformer_1();
        xmlTransformer_1.createXml(humans);

        Humans resultHumans = (Humans) xmlTransformer_1.createHumans("humans.xml");
        System.out.println(resultHumans);

    }

    public static Humans initHumans() {

        Humans humans = new Humans();
        humans.setNationality("ukrainian");

        List<Human> list = new ArrayList<>();
        Human human = new Human();

        human.setGender("male");
        human.setHeight(180);
        human.setWeight(85);
        human.setName("Serhii");

        list.add(human);
        humans.setHumanList(list);

        return humans;
    }

}
