import java.util.*;

public class Palindrome{

public static void main(String [] cdg){

System.out.println("Enter in word:");

Scanner input = new Scanner(System.in);
while(input.hasNext()){
String word = input.next();

char [] forwards = word.toCharArray();
char [] backwards = word.toCharArray();


/*String [] forwards = new String [word.length()];
String [] backwards = new String [word.length()]; */


int y=0;

for (int x = word.length()-1; x>=0 ; x--){
backwards[y] = forwards[x];

y++;
}

String b = String.valueOf(backwards);
String f = String.valueOf(forwards);

if(b.equals(f)){
System.out.println("WORD IS A PALINDROME");
}
else{
System.out.println("NOT A PALINDROME");
}


System.out.println(String.valueOf(backwards) + " and " + String.valueOf(forwards) +"\n");

System.out.println("Next word?:");


   }
}
}