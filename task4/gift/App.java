package epam.Epam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import epam.Epam.Gift;
public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("Welcome to gifts");
        System.out.print("Enter number of gifts :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Gift gifts[] = new Gift[n];
        int j = n;
        int k=0;
        for(int i=0;i<gifts.length;i++)
        {
        	System.out.println("Enter number of Mango Bytes : ");
        	String name = "Gift"+i;
        	System.out.println("Enter number of Mango Bytes : ");
        	int x = i+j;
        	System.out.println("Enter number of Coffe Bytes : ");
        	int y = i+k;
        	Gift singleGift = new Gift(name,x,y);
        	gifts[i] = singleGift;
        	j--;
        	k++;
        }
        System.out.print("Gits sorted in order");
        Arrays.sort(gifts, new Comparator<Gift>() {
            public int compare(Gift o1, Gift o2) {
                return o1.compareTo(o2);
            }
        });
        
        for(Gift g : gifts)
        {
        	System.out.println(" Name :"+g.getName() +" weight :"+g.getTotalWeight() );
        }
    }
}