import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,bonus=0,weeklyBonus=0;
        int[] salary=new int[7];
        for(int i=0;i<7;i++)
        {
            salary[i]=sc.nextInt();
            sum+=salary[i];
            if(salary[i]>8 && !(i==0 || i==6))
                bonus+=salary[i]-8;
        }
        if(sum>40)
            weeklyBonus=(sum-40)*25;
        System.out.println((sum*100)+(bonus*15)+weeklyBonus+(salary[0]*50)+(salary[6]*25));
    }
}
