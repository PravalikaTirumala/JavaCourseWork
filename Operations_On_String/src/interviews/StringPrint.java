package interviews;

public class StringPrint {
public static void main(String[] args){
String str="This is a message to test";
int len=str.length();

System.out.println(len);
System.out.println(str);

for(int i=0;i<len;i++){
	System.out.print(str.charAt(i));
}

}
}