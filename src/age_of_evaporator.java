public class age_of_evaporator<T> {
    private T value;

    age_of_evaporator(T value) {
        this.value = value;
    }

    void print_age()
    {
        System.out.print("age (in months) is " + value + "\n");
    }
}


//    public static void main(String[] args) {
//        new TstTpl<Boolean>(true).out();
//        // сгенерированные типы принадлежат одному классу
//        TstTpl<Integer> a = new TstTpl<Integer>(1);
//        TstTpl<Double> b = new TstTpl<Double>(3.14);
//        System.out.println(a.getClass() == b.getClass());
//    }



//template<typename T>
//class age_of_evaporator {
//    public:
//    age_of_evaporator(T value)
//    {
//        this->value = value;
//    }
//
//    void print_age()
//    {
//        System.out.print("age (in months) is " << value << endl;
//    }
//    private:
//    T value;
//};
