public class Counter {
    private int value;

    public Counter(int value)
    {
        this.value = value;
    }
    public Counter()
    {
        this.value = 0;
    }

    /**
     * the click method will increase the value by 1
     */
    public void click()
      {
          value = value+1;
      }
    /**
     * The below method will return the current value
     */
    public int getValue()
    {
        return value;
    }
}
