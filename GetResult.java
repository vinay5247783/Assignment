package Assignment;

public class GetResult {

	int newValue1,newValue2;
	int asci_res;
	
	void getResult(String string1, String string2) {
		
		if(string1.length()!= string2.length()) {
			System.out.println("string is not of same length");
		}
		
		if(string1.length()>string2.length()) {
			String temp=string1;
			string1=string2;
			string2=temp;
			
		}
			
		for(int i=0; i<string1.length();i++) {
			
			int asci_Str1=string1.charAt(i);
			int asci_Str2=string2.charAt(i);

			
			if(65<=asci_Str1 && asci_Str1<=90 && 65<=asci_Str2 && asci_Str2<=90) {
				
				newValue1=asci_Str1+32;
				System.out.println("newValue1= "+newValue1);
				
				newValue2=asci_Str2+32;
				System.out.println("newValue2= "+newValue2);
				
			}else {
				newValue1=asci_Str1;
				//System.out.println("newValue1= "+newValue1);
				newValue2=asci_Str2;	
			}
			
				asci_res=newValue1-newValue2;
				if(asci_res==0) {
					System.out.println("0");
					
				
				}
				else if(asci_res<0) {
					System.out.println("-1");
				
			}
				else  {
					System.out.println("1");
			
		}

			
			if((int)string1.charAt(i)!=(int)string2.charAt(i)){
				
				System.out.println("char at "+(int)string1.charAt(i)+"which is   "+string1.charAt(i)+" this string breaks");

				break;
			}	
		}
	}
}

		
