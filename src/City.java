public class City {
    int pop;
    String continent;
    String name;
    int averagetemp;

    public City(){
        name = "Chicago";
        pop = 1000;
        continent = "Ohio";
        averagetemp = 20;
        print();
    }

    public void print() {
        System.out.println("the city " + name + " in " + continent);
        System.out.println("With an average tempurature of " +averagetemp + " and a population of " + pop + " people");
    }

}
