import java.util.ArrayList;

public class Evaporator {
    protected String name;	// Название
    protected int diameter;		// Диамерт
    protected int watts;			// Ватты
    protected int resistance;		// Сопрoтивление
    protected int secret_part = 1800;
    protected int[] factory_number_list = new int[3];

    public Evaporator() {
        name = "default name";
        diameter = 20;
        watts = 10;
        resistance = 5;
        System.out.println("\nEvaporator was created with default params!");

        for(int i = 0; i < factory_number_list.length; i++){
            factory_number_list[i] = i;
        }
    }

    public Evaporator(String name) {
        this.name = name;
        diameter = 20;
        watts = 10;
        resistance = 5;
        System.out.println("Evaporator was created\n");
    }
    Evaporator(String name, int diameter, int watts, int resistance) {
        this.name = name;
        this.diameter = diameter;
        this.watts = watts;
        this.resistance = resistance;
        System.out.println("\nNew Evaporator was created");
    }

    public void Evaporator_INFO() {
        System.out.println("\tname: " + name + "\n\tdiameter: " + diameter +
                "\n\twatts: " + watts + "\n\tresistance: " + resistance + "\n");
    }


    public void set_name(String name) {
        this.name = name;
    }
    public String get_name() {
        return name;
    }

    public void set_diameter(int diameter) {
        this.diameter = diameter;
    }
    public int get_diameter() {
        return diameter;
    }

    public void set_watts(int watts) {
        this.watts = watts;
    }
    public int get_watts() {
        return watts;
    }

    public void set_resistance(int resistance) {
        this.resistance = resistance;
    }
    public int get_resistance() {
        return resistance;
    }

    public static int findByName(ArrayList<Evaporator> lists, String desiredName) {
        for (int i = 0; i <lists.size(); i++) {
            if (lists.get(i).get_name().equals(desiredName)){
                return i;
            }
        }
        return -1;
    }

}
