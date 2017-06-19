
import java.util.Scanner;
public class main
{
    public static void main()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int liczba=input.nextInt();
        if(liczba%2==0)
        {
            System.out.println("Liczba jest parzysta");
        }
        
      
        if(liczba%2!=0)
        {
        System.out.println("Liczba jest nieparzysta");
        }
        
       

    }   
}
