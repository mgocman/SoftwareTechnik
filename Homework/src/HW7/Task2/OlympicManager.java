package HW7.Task2;

public class OlympicManager {

    public OlympicManager() {

        Composite olympicsTeams = new Composite("OlympicsTeams");

        Composite asiaTeam = new Composite("AsiaTeam");
        olympicsTeams.add(asiaTeam);
        Composite chinaTeam = new Composite("ChinaTeam");
        asiaTeam.add(chinaTeam);

        Composite chinaWomenTeam = new Composite("China-Womens-Team");
        chinaTeam.add(chinaWomenTeam);
        Leaf womenTakewondo = new Leaf("Women's Takewondo",10,4);
        chinaWomenTeam.add(womenTakewondo);
        Leaf womenWaterpolo = new Leaf("Women's Waterpolo",4,1);
        chinaWomenTeam.add(womenWaterpolo);
        Leaf womenGym = new Leaf("Women's ArtisticGymnastics",6,0);
        chinaWomenTeam.add(womenGym);

        Composite chinaMenTeam = new Composite("China-Men-Team");
        chinaTeam.add(chinaMenTeam);
        Leaf menShooting = new Leaf("Men's Shooting", 3, 0);
        chinaMenTeam.add(menShooting);

        Leaf afghanistanTeam = new Leaf("Afghanistan Team",23, 3);
        asiaTeam.add(afghanistanTeam);

        Leaf africaTeam = new Leaf("Africa Team", 45, 17);
        olympicsTeams.add(africaTeam);

        Composite europeTeam = new Composite("Europe Team");
        olympicsTeams.add(europeTeam);
        Composite germanyTeam = new Composite("Germany Team");
        europeTeam.add(germanyTeam);

        Composite womenGermany = new Composite("Germany-Women-Team");
        germanyTeam.add(womenGermany);
        Leaf cyclingWomen = new Leaf("Women's Cycling Team",12,7);
        womenGermany.add(cyclingWomen);
        Leaf tennisWomen = new Leaf("Women's Tennis",6,2);
        womenGermany.add(tennisWomen);

        Composite menGermany = new Composite("Germany-Men-Team");
        germanyTeam.add(menGermany);
        Leaf tableTennisMen = new Leaf("Table Tennis Men",12,7);
        menGermany.add(tableTennisMen);
        Leaf footballMen = new Leaf("Football Men",11,11);
        menGermany.add(footballMen);


        AthletesVisitor av = new AthletesVisitor();
        GoldMedalVisitor gv = new GoldMedalVisitor();

        System.out.println("Name of the Teams and Number of Athletes of Germany Men's Team");
        menGermany.accept(av);
        System.out.println("\n Name of the Teams and Number of Gold Medals of Germany");
        germanyTeam.accept(gv);
        System.out.println("\n Name of the Teams and Number of Gold Medals of Asia's Team");
        asiaTeam.accept(gv);
        System.out.println("\n Name and Number of athletes of teams in the Olympic 2024!");
        olympicsTeams.accept(av);

    }

    public static void main(String[] args) {
        OlympicManager om = new OlympicManager();
    }
}
