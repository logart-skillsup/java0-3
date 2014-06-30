
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Test {
    static class A{
        int counter = 1;
        void hello(){
            System.out.println("hello, I am A!");
        }
        void increment(){
            counter ++;
        }
    }
    
    static class B extends A{
        @Override
        void hello(){
            counter += 1;
            System.out.println("hello, I am B!");
        }
        
        void hello2(){
            
        }
    }

    static int m (A a){
        a.hello();
        return 1;
    }
    
    static class Book{
        
        Book(String name, int pages){
            this.name = name;
            if(pages < 0){
                this.pages = 0;
            }else{
                this.pages = pages;
            }
        }
        
        String name;
        int pages;
        
        String getDescription(){
            return name +" with pages : "+pages;
        }
    }
    
    public static void main(String[] args) {      

        A parent1 = new A();
        A parent2 = new A();
        B child = new B();
        
        child.hello2();
        
        m(parent1);
        m(child);
        
        
        
        Book thinkingInJava = new Book("Java", 12);
        thinkingInJava.pages = 123;
        
        Book phisicsForMidleSchool = new Book("Ph", -1);
        phisicsForMidleSchool.name = "Ph";
        phisicsForMidleSchool.pages = 12;
        
        phisicsForMidleSchool.name = null;
        
        
        
        System.out.println(thinkingInJava.getDescription());
        System.out.println(phisicsForMidleSchool.getDescription());
        
        
        
        
        
    }
    

}    

