package cleancode;
import java.util.Scanner;

public class Construction {
	public void dimension(){
		int standard = 1200;
		int abvstandard = 1500;
		int highstandard = 1800;
		int fullyautomated = 2500;
		float area ;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.format("%s", "Enter the area of the home to be constructed : ");
			area = sc.nextFloat();
			float total_cost;
			Boolean flag = true;
			while(flag) {
				System.out.format("%s", "Which type of home do you want to perform : ");
				System.out.format("%s", "\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.Automated Home\n");
				//System.out.format("%s", "Select the material standard : ");
				int ch = sc.nextInt();
				//System.out.format("%s","Do you want fully automated house : ");
				switch(ch) {
				case 1 :
					System.out.format("%s", "Standard Material costs:");
					total_cost = area*standard;
					System.out.format("%s", total_cost);
					System.out.println("\nDo you want to perform more operations?(y/n)");
					ch=sc.next().charAt(0);
					if(ch == 'y'||ch=='Y')
						flag = true;
					else {
						flag = false;
						System.out.format("%s","Exit");
					}
					break;
				case 2 :
					System.out.format("%s", "Above Standard Material costs:");
					total_cost = area*abvstandard;
					System.out.format("%s", total_cost);
					System.out.println("\nDo you want to perform more operations?(y/n)");
					ch=sc.next().charAt(0);
					if(ch == 'y'||ch=='Y')
						flag = true;
					else {
						flag = false;
						System.out.format("%s","Exit");
					}
					break;
				case 3 :
					System.out.format("%s", "High Standard Material costs:");
					total_cost = area*highstandard;
					System.out.format("%s", total_cost);
					System.out.println("\nDo you want to perform more operations?(y/n)");
					ch=sc.next().charAt(0);
					if(ch == 'y'||ch=='Y')
						flag = true;
					else {
						flag = false;
						System.out.format("%s","Exit");
					}
					break;
				case 4 :
					System.out.format("%s", "High Standard Material with Automated Home\n");
					total_cost = area*fullyautomated;
					System.out.format("%s", total_cost);
					System.out.println("\nDo you want to perform more operations?(y/n)");
					ch=sc.next().charAt(0);
					if(ch == 'y'||ch=='Y')
						flag = true;
					else {
						flag = false;
						System.out.format("%s","Exit");
					}
					break;
				}
			}
		}
		catch(Exception e) {
				System.out.format("%s", "Given area is wrong");
		}
	}
}

