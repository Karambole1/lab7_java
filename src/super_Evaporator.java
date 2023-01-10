public class super_Evaporator extends Evaporator implements Cloneable {

    private int more_secret_part;

    super_Evaporator(int more_secret_part) {
        this.more_secret_part = more_secret_part;
        System.out.println("some changes?\n");
    }

    void set_secret_part() {
        more_secret_part = secret_part;
        System.out.println("smth changed in secret part...\n");
    }

    void Evaporator_INFO(int smht) {
        System.out.println("If u need it: " + more_secret_part + "\n");
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        super_Evaporator s_E_clone = (super_Evaporator) super.clone();
//        s_E_clone.factory_number_list = new int[factory_number_list.length];
//        for (int i = 0; i < factory_number_list.length; i++) {
//            s_E_clone.factory_number_list[i] = factory_number_list[i];
//        }
//        return s_E_clone;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}