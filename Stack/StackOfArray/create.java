package Stack.StackOfArray;

import java.util.Scanner;

class stack{
     int[] st=new int[5];
     int top=-1;
   public void push(int n){
        if(st.length-1==top){
         System.out.println("Stack already full");
        }else{
       top=top+1;
       st[top]=n;
       }
   }
   public int pop(){
       if(top==-1){
           System.out.println("Stack is fully Empty");
           return 0;
       }
       int data=st[top];
       top=top-1;
       System.out.println(data);
       return data;
   }
   public void display(){
       int p=top;
       if(top!=-1){
         while(p!=-1){
             System.out.println(st[p]);
             p=p-1;
         }
       }else{
           System.out.println("Currently Stack is Empty");
       }
   }

   public boolean isEmpty(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return true;
        }   
        System.out.println("Stack is not Empty");
        return true;
   }

public void size(){
    System.out.println("Stack currently size is "+top+1);
}


 }
public class create {
    public static void main(String[] args) {
         stack s=new stack();
          Scanner input=new Scanner(System.in);
        
          boolean check=true;
          while(check) {
              System.out.println("press 1 for push");
              System.out.println("press 2 for pop");
              System.out.println("press 3 for display");
              System.out.println("press 4 for check empty or not");
              System.out.println("press 5 for size");
              System.out.println("press 6 for exit  ");
              
              try {
                 int val=input.nextInt();

                 switch (val) {
                  case 1: 
                      System.out.println("Enter element for stack");
                      int ele=input.nextInt();
                      s.push(ele);
                      break;
  
                  case 2:
                      s.pop();
                      break;
  
                  case 3:
                  System.out.println("stack -");
                      s.display();
                      break;
  
                  case 4:
                  s.isEmpty();
                      break;
  
                  case 5:
                       s.size();
                       break;
  
                  case 6:
                      
                      //exit
                      check=false;
                      break;  
                  }
                  
              }
              catch(Exception e) {
                  System.out.println("Invalid Input");
                  System.out.println(e.getMessage());
              }
          }
    }
}
