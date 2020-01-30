package Assignment;

public class ExceptionHandling {

	            public static void main(String args[])
	            {
	                int arr[]=new int[4];
	                ExceptionHandling e1=null;
	                System.out.println("Array created");
	                try
	                {
	                    arr[4]=10;
	                    e1.toString();
	                }
	                catch(ArrayIndexOutOfBoundsException ae) 
	                {
	                    System.out.println(ae);
	                }
	                catch(NullPointerException ne)
	                {
	                    System.out.println(ne);
	                }
	                System.out.println("Array assigned");
	            }
}
