package main.java;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class MyCollections {

    public static void main(String[] args) {
        // List
        myArrayList();                        // ArrayList
        myLinkedList();                       // LinkedList
        // Set
        myHashSet();                          // HashSet
        myTreeSet();                          // TreeSet
        // Map
        myHashMap();                          // HashMap
        myTreeMap();                          // TreeMap
        //Stack
        myStack();                          // Stack
        // Queue
        myQueue();                          // Queue
        myArrayBlockingQueue();             // ArrayBlockingQueue
        myDeque();                          // Deque
    }

    public static void myArrayList(){
        System.out.println("ArrayList Output:\n");
        //ArrayList list = new ArrayList();
        //ArrayList list = new ArrayList(2);
        ArrayList list = new ArrayList(5);
        list.add("Anish");
        list.add("Abhinav");
        list.add("Aayush");
        System.out.println(list);
        list.remove("Abhinav");//removes
        list.remove("xxxx");//no impact
        System.out.println(list);
        int l=list.size();
        list.remove(l-1);
        //list.remove(l); // throws IndexOutOfBoundsException
        System.out.println(l);
        for (Object name : list) {
            System.out.println(name);
        }
        System.out.println(list.hashCode());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Anish"));
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("Anish");
        list.add("Abhinav");
        list.add("Aayush");
        System.out.println(list);
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        ListIterator l_iter = list.listIterator();
        while(l_iter.hasNext()){
            System.out.println(l_iter.next());
        }
        while(l_iter.hasPrevious()){
            System.out.println(l_iter.previous());
        }
        System.out.println(list.get(0));
        list.set(0, "ANISH");
        //list.set(10, "Abhinav"); // throws IndexOutOfBoundsException
        System.out.println(list);
        int x=100;
        list.add(10);
        list.add(x);
        list.set(0, "Anish");
        System.out.println(list);
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add("Abhinav");
        System.out.println(list2);
        ArrayList<String> list3 = new ArrayList<>();
        // list3.add(1); // error as it can accept object of type String only.
        list3.add("Abhinav");
        System.out.println(list3);
        System.out.println("\n##################################################\n");
    }

    public static void myLinkedList(){
        System.out.println("LinkedList Output:\n");
        LinkedList<Object> list1 = new LinkedList<>();
        LinkedList<Object> list2 = list1;
        list1.add(1);
        list1.add("Abhinav");
        System.out.println(list1);
        list1.addFirst("Anish");
        list1.addLast(2);
        list1.add(0, "First");
        list1.add("Abhinav");
        System.out.println(list1.get(3));
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1);
        System.out.println(list2);
        list2.remove();
        System.out.println(list2);
        list2.remove("Abhinav"); // removes 1st occurance of Object
        System.out.println(list2);
        System.out.println(list1.indexOf("Abhinav")); // 1st occurance!
        LinkedList<Integer> i = new LinkedList<>();
        i.add(1);
        i.add(2);
        i.addFirst(0);
        i.addLast(3);
        i.add(3,4);
        i.add(5);
        i.removeFirst();
        System.out.println(i);
        for ( Integer n : i){
            System.out.println(n);
        }
        ListIterator l_iter = i.listIterator();
        while(l_iter.hasNext()){
            System.out.println(l_iter.next());
        }
        while(l_iter.hasPrevious()){
            System.out.println(l_iter.previous());
        }
        System.out.println("\n##################################################\n");
    }

    public static void myHashSet(){
        System.out.println("HashSet Output:\n");
        HashSet set1 = new HashSet(); // Not recommended as it was used before Java 5
        // thus should be used only if you know all elements inserted will be of same data type.
        set1.add("Anish");
        set1.add(30);
        set1.add("Abhinav");
        set1.add(27);
        set1.add("Aayush");
        set1.add(25);
        set1.add("Aayush"); // No Impact on set
        set1.add(25); // No Impact on set
        if(set1.contains("Aayush")){
            System.out.println(set1); // Order is not maintained
        }
        System.out.println(set1.add("New")); // successful addition return true
        System.out.println(set1.add("Aayush")); // non successful addition return false
        // set.add(object) checks the availability of hashcode of the object in the ArrayList. If hashcode of the object exists,
        // there is no need to call equals() since it is now guaranteed that the new object is unique,
        // thus the add function somehow add the new object to the set and returns true. If the hashcode exists
        // then it further looks for the existence of the object in the bucket determined by hashcode value
        // and make a call to equals() method. If equals() method returns true which means that the object is not unique and
        // thus the object is not added in the set and the add function returns false. But if equals() returns false,
        // which confirms the object is unique and is added to the set and thus add functions returns true.
        // Note: If two objects are equal according to the equals(Object) method,
        // then calling the hashCode method on each of the two objects must produce the same integer result.
        System.out.println(set1);
        Iterator i = set1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        HashSet<Integer> hset = new HashSet(); // Recommended as it was introduced in Java 5 generics,
        // which gives us a flexibility to specify the data type of elements for which we need a TreeSet.
        //hset.add("Abhinav"); // gives compiler error as
        // Error:(93, 18) java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
        hset.add(3);
        hset.add(2);
        hset.add(1);
        if (hset.contains(3)){
            System.out.println(hset);
        }
        HashSet<Object> set2 = new HashSet<>(); // We can specify Object to make it more generic and support polymorphism
        set2.add(1);
        set2.add("Abhinav");
        System.out.println(set2);
        System.out.println("\n##################################################\n");
    }

    public static void myTreeSet(){
        System.out.println("TreeSet Output:\n");
        TreeSet set1 = new TreeSet(); // Not recommended as it was used before Java 5
        // thus should be used only if you know all elements inserted will be of same data type.
        set1.add(30);
        set1.add(27);
        set1.add(25);
        set1.add(25); // No Impact on set
        if(set1.contains(25)){
            System.out.println(set1); // Order is not maintained
        }
        System.out.println(set1.add(50)); // successful addition return true
        System.out.println(set1.add(50)); // non successful addition return false
        System.out.println(set1);
        Iterator i = set1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //set.add("Aayush"); // throws ClassCastException


        TreeSet<String> tset = new TreeSet(); // Recommended as it was introduced in Java 5 generics,
        // which gives us a flexibility to specify the data type of elements for which we need a TreeSet.
        tset.add("E");
        tset.add("D");
        tset.add("C");
        tset.add("B"); // No Impact on set
        if(tset.contains("B")){
            System.out.println(tset); // Order is not maintained
        }
        System.out.println(tset.add("A")); // successful addition return true
        System.out.println(tset.add("A")); // non successful addition return false
        System.out.println(tset);
        Iterator j = tset.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }
        TreeSet<Object> set2 = new TreeSet<Object>();
        set2.add(1);
        // set2.add("Abhinav"); // here it throws ClassCastException, unlike HashSet
        System.out.println(set2);
        //tset.add(10); // throws ClassCastException
        System.out.println("\n##################################################\n");
    }

    public static void myHashMap(){
        System.out.println("HashMap Output:\n");
        Map<Object, Object> map1 = new HashMap<>();
        map1.put("Abhinav", 27);
        map1.put("Aayush", 25);
        map1.put("Anish", 30);
        map1.put("Abhinav", 28);
        map1.put("Aayush", 26);
        map1.put("Anish", 31);
        map1.put("key1", 1);
        map1.put("key2", 2);
        map1.put("key3", 3);
        System.out.println(map1);
        System.out.println(map1.remove("key1", 1)); // return true as successful
        System.out.println(map1.remove("key1", 11)); // returns false as not successful
        System.out.println(map1.remove("key5", 1)); // returns false as not successful
        System.out.println(map1);
        System.out.println(map1.replace("key2", 1)); // returns old value of key2 i.e. 2
        System.out.println(map1.replace("key2", 111)); // returns old value of key2 i.e. 1
        System.out.println(map1.replace("key2", 1111)); // returns old value of key2 i.e. 111
        System.out.println(map1.replace("key5", 1)); // returns null as key5 doesn't exist
        System.out.println(map1);
        System.out.println(map1.remove("key5")); // returns null as key5 doesn't exist
        System.out.println(map1.remove("key2")); // returns value of key2 i.e. 1111
        System.out.println(map1.remove("key3", 11)); // returns false as [key3 , 11] doesn't exist
        System.out.println(map1.remove("key3", 3)); // returns true as successful
        System.out.println(map1);
        System.out.println(map1.isEmpty());
        System.out.println(map1.size());
        System.out.println(map1.containsKey("Abhinav"));
        System.out.println(map1.containsValue(28));
        System.out.println(map1.get("Anish"));
        System.out.println(map1.equals(map1));
        System.out.println(map1.values());
        System.out.println(map1.keySet());
        Set<Object> keys = map1.keySet();
        for (Object key: keys){
            System.out.println(key);
        }
        Collection<Object> values = map1.values();
        for (Object val: values){
            System.out.println(val);
        }
        Object[] keyarr = keys.toArray();
        Object[] valarr = values.toArray();
        for(int i=0;i<keyarr.length;i++){
            System.out.println(keyarr[i] + " - " + valarr[i]);
        }
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("E", 69);
        map2.put("D", 68);
        map2.put("4", 65);
        map2.put("3", 67);
        map2.put("B", 66);
        Object[] keyarray = map2.keySet().toArray();
        Object[] valarray = map2.values().toArray();
        System.out.println("Unordered HashMap");
        for(int i=0;i<keyarray.length;i++) {
            System.out.println(keyarray[i] + " - " + valarray[i]);
        }
        System.out.println("\n##################################################\n");
    }

    public static void myTreeMap(){
        System.out.println("TreeMap Output:\n");
        Map<Object, Object> map1 = new TreeMap<>();
        map1.put("E", 69);
        //map1.put(7, 68); // throws ClassCastException
        //map1.put(5, 65); // throws ClassCastException
        map1.put("9", 67);
        map1.put("B", 66);
        Object[] keyarr = (Object[]) map1.keySet().toArray();
        Object[] valarr = (Object[]) map1.values().toArray();
        System.out.println("Ordered TreeMap");
        for(int i=0;i<keyarr.length;i++) {
            System.out.println(keyarr[i] + " - " + valarr[i]);
        }
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("E", 69);
        map2.put("D", 68);
        map2.put("4", 65);
        map2.put("3", 67);
        map2.put("B", 66);
        Object[] keyarray = map2.keySet().toArray();
        Object[] valarray = map2.values().toArray();
        System.out.println("Ordered TreeMap");
        for(int i=0;i<keyarray.length;i++) {
            System.out.println(keyarray[i] + " - " + valarray[i]);
        }
        System.out.println("\n##################################################\n");
    }

    public static void myStack() {
        System.out.println("Stack Output:\n");
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(0, 0);
        s.push(3);
        s.push(4);
        s.push(6);
        s.add(5, 5);
        System.out.println("My Stack: " + s);
        System.out.println(s.pop());
        System.out.println("My Stack: " + s);
        System.out.println(s.search(1));
        System.out.println(s.search(11));
        System.out.println(s.contains(1));
        System.out.println(s.contains(11));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.firstElement());
        System.out.println(s.get(3));
        System.out.println(s.lastElement());
        System.out.println("My Stack: " + s);
        System.out.println(s.remove(0));
        System.out.print("My Stack is: ");
        for (Integer i: s) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("My Stack: " + s);
        s.clear();
        System.out.println("My Stack: " + s);
        System.out.println("\n##################################################\n");
    }

    public static void myQueue() {
        System.out.println("Queue Output:\n");
        Queue<Integer> q = new LinkedList<>();
        q.add(1); // add() is an Exception throwing method
        System.out.println(q.add(2)); // add)() - return type is boolean
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(6); // offer() is a non Expeption throwing method
        System.out.println(q.offer(7)); // offer() - return type is boolean
        q.offer(8);
        q.offer(9);
        q.offer(10);
        System.out.println(q.remove(10)); // remove() - return type is boolean
        System.out.println(q.element()); // element() - returns the front data of queue.
        System.out.println(q.peek()); // peek() - returns the front data of queue.
        int front = q.peek();
        System.out.println("Front = " + front);
        System.out.println(q.size());
        System.out.println(q.contains(10));
        System.out.print("My Queue is: ");
        for (Integer i: q) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("MyQueue size = " + q.size());
        System.out.println("myQueue: " + q);
        q.clear(); // clear() - return type is void
        System.out.println(q.isEmpty());
        System.out.println();
        System.out.println("\n##################################################\n");
    }

    public static void myArrayBlockingQueue() {
        System.out.println("ArrayBlockingQueue Output:\n");
        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(20);
        q.add(1); // add() is an Exception throwing method
        System.out.println(q.add(2)); // add)() - return type is boolean
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(6); // offer() is a non Expeption throwing method
        System.out.println(q.offer(7)); // offer() - return type is boolean
        q.offer(8);
        q.offer(9);
        q.offer(10);
        System.out.println(q.remove(10)); // remove() - return type is boolean
        System.out.println(q.element()); // element() - returns the front data of queue.
        System.out.println(q.peek()); // peek() - returns the front data of queue.
        int front = q.peek();
        System.out.println("Front = " + front);
        System.out.println(q.size());
        System.out.println(q.contains(10));
        System.out.print("My Queue is: ");
        for (Integer i: q) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("MyQueue size = " + q.size());
        System.out.println("myQueue: " + q);
        q.clear(); // clear() - return type is void
        System.out.println(q.isEmpty());
        System.out.println();
        System.out.println("\n##################################################\n");
    }

    public static void myDeque() {
        System.out.println("Deque Output:\n");
        ArrayDeque<Integer> q = new ArrayDeque<>();
        System.out.println(q.add(1)); // add() return type is booelan
        q.addFirst(0);
        q.add(2); // add at rear end
        q.addLast(3);
        System.out.println(q.offer(4)); // offer() return type is booelan
        q.offerFirst(5);
        q.offer(6); // add at rear end
        q.offerLast(7);
        System.out.println("My Deque: " + q);
        System.out.println(q.element());
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        System.out.println(q.contains(1));
        System.out.print("My Queue is: ");
        for (Integer i: q) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("MyQueue size = " + q.size());
        System.out.println("My Deque: " + q);
        q.push(8); // adds 8 at front
        System.out.println("My Deque: " + q);
        q.pop(); // removes front element
        System.out.println("My Deque: " + q);
        System.out.println(q.remove(7));
        System.out.println("My Deque: " + q);
        System.out.println(q.remove()); // remove() removes front and return front data
        System.out.println("My Deque: " + q);
        System.out.println("\n##################################################\n");
    }

}


/* 

################################################## ALL OUTPUT ##################################################

ArrayList Output:

[Anish, Abhinav, Aayush]
[Anish, Aayush]
2
Anish
63410480
false
true
[Anish]
[]
[Anish, Abhinav, Aayush]
Anish
Abhinav
Aayush
Anish
Abhinav
Aayush
Aayush
Abhinav
Anish
Anish
[ANISH, Abhinav, Aayush]
[Anish, Abhinav, Aayush, 10, 100]
[1, Abhinav]
[Abhinav]

##################################################

LinkedList Output:

[1, Abhinav]
Abhinav
First
Abhinav
[First, Anish, 1, Abhinav, 2, Abhinav]
[First, Anish, 1, Abhinav, 2, Abhinav]
[Anish, 1, Abhinav, 2, Abhinav]
[Anish, 1, 2, Abhinav]
3
[1, 2, 4, 3, 5]
1
2
4
3
5
1
2
4
3
5
5
3
4
2
1

##################################################

HashSet Output:

[Anish, 25, Abhinav, 27, Aayush, 30]
true
false
[New, Anish, 25, Abhinav, 27, Aayush, 30]
New
Anish
25
Abhinav
27
Aayush
30
[1, 2, 3]
[1, Abhinav]

##################################################

TreeSet Output:

[25, 27, 30]
true
false
[25, 27, 30, 50]
25
27
30
50
[B, C, D, E]
true
false
[A, B, C, D, E]
A
B
C
D
E
[1]

##################################################

HashMap Output:

{key1=1, key2=2, Anish=31, key3=3, Abhinav=28, Aayush=26}
true
false
false
{key2=2, Anish=31, key3=3, Abhinav=28, Aayush=26}
2
1
111
null
{key2=1111, Anish=31, key3=3, Abhinav=28, Aayush=26}
null
1111
false
true
{Anish=31, Abhinav=28, Aayush=26}
false
3
true
true
31
true
[31, 28, 26]
[Anish, Abhinav, Aayush]
Anish
Abhinav
Aayush
31
28
26
Anish - 31
Abhinav - 28
Aayush - 26
Unordered HashMap
B - 66
3 - 67
D - 68
4 - 65
E - 69

##################################################

TreeMap Output:

Ordered TreeMap
9 - 67
B - 66
E - 69
Ordered TreeMap
3 - 67
4 - 65
B - 66
D - 68
E - 69

##################################################

Stack Output:

My Stack: [0, 1, 2, 3, 4, 5, 6]
6
My Stack: [0, 1, 2, 3, 4, 5]
5
-1
true
false
false
6
0
3
5
My Stack: [0, 1, 2, 3, 4, 5]
0
My Stack is: 1 2 3 4 5
My Stack: [1, 2, 3, 4, 5]
My Stack: []

##################################################

Queue Output:

true
true
true
1
1
Front = 1
9
false
My Queue is: 1 2 3 4 5 6 7 8 9
MyQueue size = 9
myQueue: [1, 2, 3, 4, 5, 6, 7, 8, 9]
true


##################################################

ArrayBlockingQueue Output:

true
true
true
1
1
Front = 1
9
false
My Queue is: 1 2 3 4 5 6 7 8 9
MyQueue size = 9
myQueue: [1, 2, 3, 4, 5, 6, 7, 8, 9]
true


##################################################

Deque Output:

true
true
My Deque: [5, 0, 1, 2, 3, 4, 6, 7]
5
5
7
5
5
7
true
My Queue is: 5 0 1 2 3 4 6 7
MyQueue size = 8
My Deque: [5, 0, 1, 2, 3, 4, 6, 7]
My Deque: [8, 5, 0, 1, 2, 3, 4, 6, 7]
My Deque: [5, 0, 1, 2, 3, 4, 6, 7]
true
My Deque: [5, 0, 1, 2, 3, 4, 6]
5
My Deque: [0, 1, 2, 3, 4, 6]

##################################################

*/
