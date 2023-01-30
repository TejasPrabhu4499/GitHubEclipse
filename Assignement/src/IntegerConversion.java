import java.util.Scanner;
public class IntegerConversion
{
    public static void main(String[] args) 
    {
    	System.out.println("*****Integer to Binary,Decimal and Octal Converter*****");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer Number:");
        int Input=sc.nextInt();
        System.out.println("Binary Number:"+Integer.toBinaryString(Input));
        System.out.println("HexaDecimal Number:"+Integer.toHexString(Input));
        System.out.println("Octal Number:"+Integer.toOctalString(Input));
        sc.close();
       
    }
}