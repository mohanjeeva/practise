import java.io.*;
import java.util.*;
public class Working
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
switch(s)
{
case"Sunday":
System.out.println("Workingday(sunday)->False");
break;
case"Monday":
System.out.println("Workingday(Monday)->True");
break;
case"Tuesday":
System.out.println("Workingday(Tuesday)->True");
break;
case"Wednesday":
System.out.println("Workingday(Wednesday)->True");
break;
case"Thursday":
System.out.println("Workingday(Thursday)->True");
break;
case"Friday":
System.out.println("Workingday(Friday)->True");
break;
case"Saturday":
System.out.println("Workingday(Saturday)->True");
break;
}
}
}
