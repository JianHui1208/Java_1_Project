/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testError;

/**
 *
 * @author User
 */
public class Test {

   public static void main(String[] args){

  Test b;
  b = new CommunityMember();
  b = new Employee();
  b = new Administrator();

   }
}
class Faculty extends Test{
Faculty(){
System.out.println("Faculty no-arg argument");
}
Faculty(String s){
System.out.println(s);
}
}


class CommunityMember extends Test{
CommunityMember(){
System.out.println("Community Member");
}
}
class Employee extends Test{
Employee(){
this("Employee");
System.out.println("Employee no-arg argument");
}
Employee(String s){
System.out.println(s);
}
}