package decisionmaking;

public class nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		int weight=140;
		if (age>=12)
		{
			if(weight>=40)
			{
				if(weight>=110)
				{
					System.out.println("Eligible for jumping");
				}
				else
				{
					System.out.println("Not eligible for jumping");
				}
			}
				else
				{
					System.out.println("Extra ropes will be added for jumping");
				}
			}

	}

}
