/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
/**
 *
 * @author shubham
 */
class A{
    int a,b,c;
    
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        c=a+b;
    }
    void display(){
        System.out.println("Sum="+c);
    }
}

class B extends A{
    B(int a,int b){
        super(a,b); 
    }
    
    @Override
    void add(){
        c=a*b;
    }
    @Override
    void display(){
        super.display();
    }
}
public class JavaApplication4 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B obj=new B(10,20);
        obj.add();
        obj.display();
    }
    
}
