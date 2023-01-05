package controlstructures;
import java.util.StringTokenizer;
public class DateValidation {

	public static void main(String[] args) {
		String sdate=new java.util.Scanner(System.in).nextLine();
		StringTokenizer st=new StringTokenizer(sdate,"/-.");
		int dd=Integer.parseInt(st.nextToken());
		int mm=Integer.parseInt(st.nextToken());
		int yy=Integer.parseInt(st.nextToken());
		boolean valid=true;
		if(dd<1||dd>31||mm<1||mm>12)
		{
			valid=false
		}
		else
		{
			switch(mm)
			{
			case 6:case 4:case 9:case 11:
				if(dd>30) valid=false;
				break;
			case 2:
				if((yy % 400==0)||(yy %4==0 && yy% 100!=0))
					if(dd >29)valid =false;
					else if(dd>28) valid=false;
		    }
	  }
	System.out.println(valid?"valid":"Invalid");
}
}


