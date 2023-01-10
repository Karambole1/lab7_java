import java.util.Comparator;

public class Compar implements Comparator<Evaporator> {
    public int compare(Evaporator evopar1, Evaporator evopar2){
        if (evopar1.diameter == evopar2.diameter)
            return 0;
        else if (evopar1.diameter < evopar2.diameter)
            return 1;
        else
            return -1;
    }
}
