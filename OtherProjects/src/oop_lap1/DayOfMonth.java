package oop_lap1;
import java.util.Scanner;
public class DayOfMonth {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		int month = 0;
		System.out.println("Enter a month: ");
		String inputMonth = sc.next();
		
		switch (inputMonth) {
		 case "january":
         case "jan.":
         case "jan":
         case "1":
             month = 1;
             break;
         case "february":
         case "feb.":
         case "feb":
         case "2":
             month = 2;
             break;
         case "march":
         case "mar.":
         case "mar":
         case "3":
             month = 3;
             break;
         case "april":
         case "apr.":
         case "apr":
         case "4":
             month = 4;
             break;
         case "may":
         case "5":
             month = 5;
             break;
         case "june":
         case "jun":
         case "6":
             month = 6;
             break;
         case "july":
         case "jul":
         case "7":
             month = 7;
             break;
         case "august":
         case "aug.":
         case "aug":
         case "8":
             month = 8;
             break;
         case "september":
         case "sept.":
         case "sep":
         case "9":
             month = 9;
             break;
         case "october":
         case "oct.":
         case "oct":
         case "10":
             month = 10;
             break;
         case "november":
         case "nov.":
         case "nov":
         case "11":
             month = 11;
             break;
         case "december":
         case "dec.":
         case "dec":
         case "12":
             month = 12;
             break;
         default:
        	 System.out.println("Please enter a valid month!");
        	 
		}
		    int day = 0;
			if (year < 0) {
				System.out.println("Invalid year, please enter a non negative year!");
				
			}else {
				switch(month) {
					case 2:
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
							day = 29;
							break;
						}else 
						{
							day = 28;
							break;
						}
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						day = 31;
						break;
					default:
						day = 30;
						break;
						
				}
			}System.out.println("Number of days in month " + month + " in the year " + year + " is " + day );
		
			
		


			
			}
		}
