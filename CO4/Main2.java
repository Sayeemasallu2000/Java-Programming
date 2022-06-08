import java.util.*;
import java.io.*;
class Main2 {
public static void main(String[] args) {

ArrayList<String> obj = new ArrayList<String>();

obj.add("One");
obj.add("Three");
obj.add("Four");
obj.add("Five");
obj.add(1, "Two");

System.out.println("\n ArrayList after add operation:");
for(int i=0;i<obj.size();i++)
  {
System.out.println(obj.get(i)+ " ");
    }

obj.remove("Five");
obj.remove(3);

System.out.println("\n ArrayList after remove operation:");

System.out.println(obj);

System.out.println("\n Final ArrayList:");
for(String str:obj)
System.out.println(str);

Collections.sort(obj);
System.out.println("\n ArrayList after sorting:");
for (String str : obj)
System.out.println(str);

System.out.println("\n Object at index 2:"+obj.get(2));
  
System.out.println("\n Six is in the ArrayList :"+obj.contains("Six"));
System.out.println("\n Two is in the ArrayList :"+obj.contains("Two"));

System.out.println("\n Size of the ArrayList:"+obj.size());

obj.clear();
System.out.println("\n ArrayList after clear method:"+obj);
}
}
