import java.util.Scanner;
class array_waveform
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int arr[]=new int[10];
for(int i=0;i<10;i++)
{
arr[i]=scan.nextInt();
}
int temp;
for(int i=0;i<9;i=i+2)
{
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
System.out.println("output");
for(int i=0;i<10;i++)
System.out.println(arr[i]);
}
}