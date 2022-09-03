package loop;
class Reversenum
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int t=num;
int rev=0;
while(num!=0)
{
rev = rev*10+(num%10);
num = num/10;
}
System.out.println(rev);
}
}
