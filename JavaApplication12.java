
package javaapplication12;

import static java.lang.Double.MAX_VALUE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class JavaApplication12 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello and welcome!\n" + "It is the 12th application!");
        
        // stack classes
        
        Stack StudentInClass = new Stack();
        // stack class is like the arrayList and it is unlimited and you can store multiple elements
        // stack classes are dynamic 
        // it is a data structure
        // it uses last in first out
        // one example can be the softwares that we open in our computer
        
        System.out.println(StudentInClass.isEmpty());
        
        // lets add some element to our class
        StudentInClass.add("Amir ussain");
        StudentInClass.add("Ali hussain");
        StudentInClass.add("Bahram hussain");
       
       
         
        for(Object n: StudentInClass){
            System.out.println(n);
        }
        //---------------------------------------
        
        Person p = new Person();
         System.out.println(p.toString());
         p.name = "Hussain";
         p.ID = 1;
         
         Person p2 = new Person();
         p2.name = "Ali";
         p2.ID = 2;
         
         System.out.println("this it the comparison between p and p2");
         System.out.println(p.equals(p2));
         
       
         
        
      
       
        double b = 23.999;
         int myInt= (int)b; // this is explicit casting in primative data types
        System.out.println("this is myInt : "+myInt);
        System.out.println("this is b : "+b);
        
        
       //rrayList<dataType> name new ArrayList<>();
       
       ArrayList <String> numbers = new ArrayList<>();
       numbers.add("2334");
       numbers.add("343");
       
       for(String n:  numbers){
           System.out.println(n);
       }
       
       
       // new one
       
       ArrayList <String> nums = new  ArrayList<>();
       
       nums.add("234");
       nums.add("34");
         for(String n: nums){
           System.out.println(n);
           
       }
         
         String [] numbers2 = new String[nums.size()];
         nums.toArray(numbers2);
         System.out.println("this is arrayList to array");
         for(String m : numbers2){
             System.out.println(m);
         }
       
         /*
         to convert an arrayList to an array, follow the below syntax
         
         object datatype [] name = new data type [ArrayListName.size];
         name.toArray(the array name);
         */
         
         
         String  [] cities ={"Kabul","Ghazni", "Herat"};
         
         
         /*
         to converrt array to an arrayList we use the below syntax
         ArrayList <Reference type > name = new ArrayList<> (Arrays.asList(name of the array));
         */
         ArrayList <String> city = new ArrayList<>(Arrays.asList(cities));
         city.add("Badakhshan");
         for(String k : city){
             System.out.println(k);
         }
         
         // max and min in arrayList
         String[] array = {"red", "green", "blue"};
            System.out.println(java.util.Collections.max(new ArrayList<String>(Arrays.asList(array))));

         
            String [] arr = {"red", "green","blue"};
            System.out.println(java.util.Collections.min(new ArrayList<String>(Arrays.asList(arr))));
         
         
      TV tv = new TV ();
      System.out.println(tv.isOn);
      
      tv.start();
        System.out.println(tv.channel);
      
        tv.channelUp();
        System.out.println(tv.volumeLevel);
        tv.turnOff();
        
        TV n = new TV();
        TV m = new TV();
        TV bb = new TV();
      
        System.out.println("the TV model is :"+bb.model); 
        bb.model = "Samson";
        System.out.println("the TV model is :"+bb.model);
        bb.start();
        bb.setChannel(45);
        bb.channelDown();
        bb.turnOff();
        
        // new Tv  
        TV myTv = new TV("HP",3500,"white");
        System.out.println(Math.pow(2,3));
            
       
     
       // Circle.getArea(); // without creating the object of circle class  we can use its methods and properties directly
       

       Date date = new Date();
        System.out.printf("%-15s: %s%n","date",date);
        System.out.printf("%-15s: %s%n","date.toString()",date.toString() );
     
        // these two methods are the same and doesn't have any differebces
        // and both print :
        
        Person pp = new Person();
      //  System.out.println("age is:"+pp.getAge(110));
         pp.getAge(10000);
         pp.getAge(12);
         int number = 10;
     
       //------------------------ PASSING OBJECTS TO ARRAYS --------------------------------
         Circle [] cc = new Circle[3]; // ClassName [] ArrayName = new ClassName[lenngth];
         for(int i=0; i<cc.length; i++){
             cc[i] = new Circle(); // instantiating the Circles
             cc[i].rad= 1+i;  
         }
            for(int i=0; i<cc.length; i++){
                cc[i].getArea();
            }
        //--------------------- END -------------------------------------------------------- 
        
        /*
        StackOfIntegers list = new StackOfIntegers();
        
        for(int i=0; i<10; i++){
            list.push(i);
        }
*/
        
        
        
       
        
        
    }
    
}



 