import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter no.of subjects");
	int n=s.nextInt();
	int totalmarks=0;
	for(int i=1;i<=n;i++)
	{
	    System.out.println("enter the marks of subject "+i+":");
	    totalmarks+=s.nextInt();
	}
	double percentage=(double)totalmarks/n;
	String grade="";
	if(percentage >=90)
	{
	    grade="A+";
	}
	else if((percentage)>=80 && percentage<90)
	{
	    grade="A";
	}
	else if((percentage)>=70  && percentage<80)
	{
	    grade="B";
	}
	else if((percentage)>=60  && percentage<70)
	{
	    grade="C";
	}
	else if((percentage)>=50 &&  percentage<60) 
	{
	    grade="D";
	}
	else if((percentage)>=40 && percentage<50)
	{
	    grade="E";
	}
	else{
	    System.out.println("Fail");
	}
	System.out.println("Total Marks: " + totalmarks);
    System.out.println("Average Percentage: " + percentage + "%");
    System.out.println("Grade: " + grade);
    s.close();
	}
}
