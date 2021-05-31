/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springautotype;


public class ATest {  
BTest b;  
ATest(){System.out.println("a is created");}  
public BTest getB() {  
    return b;  
}  
public void setB(BTest b) {  
    this.b = b;  
}  
void print(){System.out.println("hello a");}  
void display(){  
    print();  
    b.print();  
}  
}  
