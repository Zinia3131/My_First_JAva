public class CounterRunner {
    public static void main(String[] args)
    {
        Counter count = new Counter();
        Counter count2 = new Counter(4);

        int value = count.getValue();  //0 (default constructor 0 initialize kore dibe)
        count.click();
        int val = count.getValue();   //1   increase hoice

        int value2 = count2.getValue();  //4
        count2.click();
        int val2 = count2.getValue();   //5

        System.out.println(value);
        System.out.println(val);
        System.out.println(value2);
        System.out.println(val2);

        System.out.println(value + " " + val);
        System.out.println(value2 + " " + val2);
    }
}
