package encrypt_construct;
import java.util.*;
/*
 * Enter the string:
   aass
   Before Encrypt:
   aass
   After Encrypt:
   a2s2
 * 
 */

class Encrypt
{
 char ch[];
 String string;
 Encrypt(String string)
 {
  this.string=string;
  ch=string.toCharArray(); //conversion string to array inbuilt 
 }
 void beforeEncrypt()
 {
  System.out.println("Before Encrypt:");
  System.out.println(string);
 }
 void afterEncrypt()
 {
  int count;
  for(int i='a'; i<='z'; i++)
  {
   count=0;
   for(int j=0; j<string.length(); j++)
   {
    if(ch[j]==i)
    {
     count++; 
    }
   }
   if(count!=0)
   {
    System.out.printf("%c%d",i,count);
   } 
  }
  for(int i='A'; i<='Z'; i++)
  {
   count=0;
   for(int j=0; j<string.length(); j++)
   {
    if(ch[j]==i)
    {
     count++; 
    }
   }
   if(count!=0)
   {
    System.out.printf("%c%d",i,count);
   } 
  }
 }
}
public class Encryption {

 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the string:");
  String string=s.nextLine();
  Encrypt e=new Encrypt(string);
  e.beforeEncrypt();
  System.out.println("After Encrypt:");
        e.afterEncrypt();
 }
}





