import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception{
        int result;
        ArrayList<Evaporator> list_of_evopar = new ArrayList<Evaporator>();

        Evaporator evaporator1 = new Evaporator();
        Evaporator evaporator2 = new Evaporator("Evaporator", 50, 10, 20);
        list_of_evopar.add(evaporator1);
        list_of_evopar.add(evaporator2);

        System.out.print("\nItems in list:\n");
        for (Evaporator var : list_of_evopar) {
            var.Evaporator_INFO();
        }
        Collections.sort(list_of_evopar, new Compar());
        System.out.print("\nItems in list after sorting:\n");
        for (Evaporator var : list_of_evopar) {
            var.Evaporator_INFO();
        }
        System.out.print("\nSearch in list:\n");
        result = Evaporator.findByName(list_of_evopar, "default name");
        if (result != -1) {
            System.out.print("\nFound element:\n");
            list_of_evopar.get(result).Evaporator_INFO();
            System.out.println();
        }
        else
            System.out.print("Item not Found\n");
    }
}