public class Primitive02 {
    public static void main(String args[]) {
        byte b = 13;
        System.out.println(b);

        char ch = 'a';
        System.out.println(ch);

        boolean var = false;
        System.out.println(var);

        float price = 10.5f; // You can use 'f' to indicate a float literal
        System.out.println(price);

        int number = 25;
        System.out.println(number);

        long bigNumber = 1234567890L; // You can use 'L' to indicate a long literal
        System.out.println(bigNumber);

        double bigDecimal = 1234.5678;
        System.out.println(bigDecimal);

        short n = 250;
        System.out.println(n);
    }
}
/*byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
 */