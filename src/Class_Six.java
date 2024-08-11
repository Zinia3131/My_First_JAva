public class Class_Six {
    public static void main(String[] args) {
        String firstname = "Zinia";     //or, String name = new String("Harry");
        System.out.println("FirstName = "+firstname);
        int len1 = firstname.length();
        System.out.println("Length1 = " +len1);

        String lastname = "Ashraf";
        System.out.println("LastName = "+ lastname);
        int len2 = lastname.length();
        System.out.println("Length2 = "+len2);

        String name = firstname + " \\ " + lastname;
        System.out.println("Name = " +name);

        int len = len1 +len2;
        System.out.println("Length = "+len);



    }
}
