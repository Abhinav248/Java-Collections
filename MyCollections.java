package abhinav.code;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {

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

        // Stack
        myStack();                            // Stack

        // Queue
        myQueue();                            // Queue
        myArrayBlockingQueue();               // ArrayBlockingQueue
        myDeque();                            // Deque

        // Conversion of Collections
        convertCollections();                 // Examples of Important Conversion of Collections

        // Tutorials on Java Collection
        collectionTutorials();                // Examples on Java Collection

        // Concurrent Collections
        concurrentCollectionsTutorial();      // Examples on Concurrent Collections

    }

    public static void myArrayList(){
        System.out.println("ArrayList Output:\n");
        //ArrayList list = new ArrayList();
        //ArrayList list = new ArrayList(2);
        ArrayList<Object> list = new ArrayList(5);
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
        list.add("PQRST");
        list.add("Anish");
        list.add("Abhinav");
        list.add("Aayush");
        list.add("ABCDE");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(list.size()-2));
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(list.toArray(new Object[0]))); // Didn't understand - new Object[0]
        System.out.println(list.toString());
        ListIterator l_iter = list.listIterator();
        while(l_iter.hasNext()){
            System.out.println(l_iter.next());
        }
        while(l_iter.hasPrevious()){
            System.out.println(l_iter.previous());
        }
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove(); // Removes item from the list
        }
        System.out.println(list);
        int x=100;
        list.add(10);
        list.add(x);
        list.set(0, "Anish");
        System.out.println(list.get(0));
        //list.set(10, "Anish"); // throws java.lang.IndexOutOfBoundsException
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
        LinkedList<Object> list2 = list1; // Shallow copy using same memory address on heap
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
        list2.remove(); // Removes first item
        System.out.println(list2);
        list2.remove("Abhinav"); // removes 1st occurrence of Object
        System.out.println(list2);
        System.out.println(list1.indexOf("Abhinav")); // 1st occurrence!
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
        for(Object key : map1.keySet()) {
            System.out.println(key);
        }
        for(Object value : map1.values()) {
            System.out.println(value);
        }
        for(Map.Entry<Object, Object> map : map1.entrySet()) {
            System.out.println("key = " + map.getKey() + ", " + map.getValue());
        }
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

    private static void convertCollections() {

        // Array to List

        String[] arr1 = {"A", "B", "C"};

        // Fixed-size list backed by array
        List<String> list1 = Arrays.asList(arr1);

        // Mutable list
        List<String> list2 = new ArrayList<>(Arrays.asList(arr1));

        // Another way (Java 8+)
        List<String> list3 = Arrays.stream(arr1).collect(Collectors.toList());


        // List to Array

        List<String> list4 = Arrays.asList("X", "Y", "Z");

        String[] arr2 = list4.toArray(new String[0]);  // Best practice
        Object[] arr3 = list4.toArray();


        // List to Set

        List<Integer> list5 = Arrays.asList(1, 2, 2, 3, 4);

        Set<Integer> set1 = new HashSet<>(list5);   // Unordered
        Set<Integer> set2 = new TreeSet<>(list5);   // Sorted
        Set<Integer> set3 = new LinkedHashSet<>(list5); // Maintains insertion order


        // Set to List

        Set<String> set4 = new HashSet<>(Arrays.asList("A", "B", "C"));

        List<String> list6 = new ArrayList<>(set4);
        List<String> list7 = set4.stream().collect(Collectors.toList());


        // List to Queue

        List<String> list8 = Arrays.asList("A", "B", "C");

        Queue<String> queue1 = new LinkedList<>(list8);
        Queue<String> queue2 = new PriorityQueue<>(list8);
        Deque<String> deque1 = new ArrayDeque<>(list8);


        // Queue to List

        Queue<Integer> queue3 = new LinkedList<>();
        queue3.add(10);
        queue3.add(20);

        List<Integer> list9 = new ArrayList<>(queue3);


        // Map to Set

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");

        // Keys
        Set<Integer> keySet = map1.keySet();

        // Values
        Collection<String> values = map1.values();

        // Entries
        Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();


        // Map to List

        // Keys to List
        List<Integer> keys = new ArrayList<>(map1.keySet());

        // Values to List
        List<String> vals = new ArrayList<>(map1.values());

        // Entries to List
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map1.entrySet());


        // List of pairs to Map

        List<String[]> pairs = Arrays.asList(
                new String[]{"A", "1"},
                new String[]{"B", "2"}
        );

        Map<String, String> map2 = pairs.stream()
                .collect(Collectors.toMap(p -> p[0], p -> p[1]));


        // Set to Array

        Set<String> set5 = new HashSet<>(Arrays.asList("A", "B", "C"));

        String[] arr4 = set5.toArray(new String[0]);


        // Array to Set

        String[] arr5 = {"A", "B", "C", "A"};

        Set<String> set6 = new HashSet<>(Arrays.asList(arr5));  // Removes duplicates

    }

    private static void collectionTutorials() {

        System.out.println("=============== JAVA COLLECTIONS FRAMEWORK TUTORIAL ===============\n");

        // =============================================================
        // 1. LIST INTERFACE
        // =============================================================
        System.out.println("\n1️⃣ LIST INTERFACE EXAMPLES\n");

        // ArrayList - dynamic array, allows duplicates, preserves order
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple");  // Duplicate allowed
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Banana");
        System.out.println("After remove: " + arrayList);
        System.out.println("Contains 'Cherry'? " + arrayList.contains("Cherry"));
        System.out.println("Element at index 1: " + arrayList.get(1));

        // LinkedList - doubly-linked list, faster insert/remove at ends
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        linkedList.addFirst("Mango");
        linkedList.addLast("Grapes");
        System.out.println("LinkedList: " + linkedList);
        linkedList.removeFirst();
        System.out.println("After removeFirst(): " + linkedList);

        // Vector - synchronized legacy list
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);

        // Stack - LIFO, extends Vector
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
        System.out.println("Pop top element: " + stack.pop());
        System.out.println("Peek top: " + stack.peek());

        // =============================================================
        // 2. SET INTERFACE
        // =============================================================
        System.out.println("\n2️⃣ SET INTERFACE EXAMPLES\n");

        // HashSet - unordered, no duplicates
        Set<String> hashSet = new HashSet<>(Arrays.asList("A", "B", "C", "A"));
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet - maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet - sorted order (natural ordering)
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(50, 10, 40, 20));
        System.out.println("TreeSet (sorted): " + treeSet);

        // EnumSet - efficient set for Enums
        enum Color { RED, GREEN, BLUE, YELLOW }
        EnumSet<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN);
        enumSet.add(Color.BLUE);
        System.out.println("EnumSet: " + enumSet);

        // =============================================================
        // 3. MAP INTERFACE
        // =============================================================
        System.out.println("\n3️⃣ MAP INTERFACE EXAMPLES\n");

        // HashMap - key-value pairs, unordered, allows null keys
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);
        hashMap.remove(2);
        System.out.println("After remove(2): " + hashMap);
        System.out.println("Contains key 3? " + hashMap.containsKey(3));

        // LinkedHashMap - maintains insertion order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101, "X");
        linkedHashMap.put(102, "Y");
        linkedHashMap.put(103, "Z");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap - sorted keys
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        System.out.println("TreeMap (sorted): " + treeMap);

        // Hashtable - synchronized legacy Map
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        System.out.println("Hashtable: " + hashtable);

        // EnumMap - Map specialized for Enum keys
        EnumMap<Color, String> enumMap = new EnumMap<>(Color.class);
        enumMap.put(Color.RED, "Stop");
        enumMap.put(Color.GREEN, "Go");
        System.out.println("EnumMap: " + enumMap);

        // ConcurrentHashMap - thread-safe and concurrent
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("John", 100);
        concurrentMap.put("Jane", 200);
        System.out.println("ConcurrentHashMap: " + concurrentMap);

        // WeakHashMap - keys are weak references, good for caches
        Map<Object, String> weakHashMap = new WeakHashMap<>();
        Object key = new Object();
        weakHashMap.put(key, "WeakKey");
        System.out.println("Before GC WeakHashMap: " + weakHashMap);
        key = null; // eligible for GC
        System.gc();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("After GC WeakHashMap: " + weakHashMap);

        // IdentityHashMap - uses == instead of equals()
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put(new String("A"), "Value1");
        identityMap.put(new String("A"), "Value2");
        System.out.println("IdentityHashMap: " + identityMap);

        // =============================================================
        // 4. QUEUE / DEQUE INTERFACE
        // =============================================================
        System.out.println("\n4️⃣ QUEUE / DEQUE INTERFACE EXAMPLES\n");

        // PriorityQueue - natural ordering (min-heap)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Poll (smallest): " + priorityQueue.poll());

        // ArrayDeque - double-ended queue
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("ArrayDeque: " + deque);
        deque.pollFirst();
        System.out.println("After pollFirst(): " + deque);

        // LinkedBlockingQueue - thread-safe FIFO queue
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
        blockingQueue.add("Task1");
        blockingQueue.add("Task2");
        System.out.println("LinkedBlockingQueue: " + blockingQueue);

        // PriorityBlockingQueue - priority + thread-safe
        BlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
        priorityBlockingQueue.add(5);
        priorityBlockingQueue.add(1);
        priorityBlockingQueue.add(3);
        System.out.println("PriorityBlockingQueue (sorted): " + priorityBlockingQueue);

        // ConcurrentLinkedQueue - lock-free queue
        Queue<String> concurrentQueue = new ConcurrentLinkedQueue<>();
        concurrentQueue.add("Alpha");
        concurrentQueue.add("Beta");
        System.out.println("ConcurrentLinkedQueue: " + concurrentQueue);

        // LinkedBlockingDeque - thread-safe double-ended queue
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>();
        blockingDeque.add("First");
        blockingDeque.addLast("Last");
        System.out.println("LinkedBlockingDeque: " + blockingDeque);

        // =============================================================
        // 5. COMMON OPERATIONS ON COLLECTIONS
        // =============================================================
        System.out.println("\n5️⃣ COMMON OPERATIONS ON COLLECTIONS\n");

        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 2);
        System.out.println("Numbers: " + numbers);
        System.out.println("Min: " + Collections.min(numbers));
        System.out.println("Max: " + Collections.max(numbers));

        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);
        System.out.println("Sorted: " + sortedList);

        Collections.reverse(sortedList);
        System.out.println("Reversed: " + sortedList);

        // Using streams
        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers via Stream: " + even);

        // Unmodifiable list
        List<String> unmodifiable = Collections.unmodifiableList(arrayList);
        System.out.println("Unmodifiable list: " + unmodifiable);

        System.out.println("\n=============== END OF COLLECTIONS DEMO ===============\n");
    }

    private static void concurrentCollectionsTutorial() {

        System.out.println("=============== JAVA CONCURRENT COLLECTIONS TUTORIAL ===============\n");

        // =============================================================
        // 1️⃣ ConcurrentHashMap
        // =============================================================
        System.out.println("1️⃣ ConcurrentHashMap");
        /*
         * ✅ Thread-safe hash-based map
         * ✅ Allows concurrent read/write operations without locking the entire map
         * ✅ Uses internal segment locks (Java 7) / striped bins (Java 8+)
         *
         * 📈 Time Complexity:
         *   - get(): O(1)
         *   - put(): O(1)
         *   - remove(): O(1)
         */
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("A", 1);
        concurrentMap.put("B", 2);
        concurrentMap.put("C", 3);
        System.out.println("ConcurrentHashMap: " + concurrentMap);
        System.out.println("Get A: " + concurrentMap.get("A"));
        concurrentMap.compute("B", (k, v) -> v + 10);
        System.out.println("After compute(B): " + concurrentMap);
        System.out.println();

        // =============================================================
        // 2️⃣ ConcurrentLinkedQueue
        // =============================================================
        System.out.println("2️⃣ ConcurrentLinkedQueue");
        /*
         * ✅ Lock-free, non-blocking FIFO queue
         * ✅ Ideal for high-concurrency scenarios with producer-consumer
         *
         * 📈 Time Complexity:
         *   - offer(): O(1)
         *   - poll(): O(1)
         *   - peek(): O(1)
         */
        ConcurrentLinkedQueue<String> clq = new ConcurrentLinkedQueue<>();
        clq.offer("Task1");
        clq.offer("Task2");
        clq.offer("Task3");
        System.out.println("ConcurrentLinkedQueue: " + clq);
        System.out.println("Poll: " + clq.poll());
        System.out.println("After poll: " + clq);
        System.out.println();

        // =============================================================
        // 3️⃣ ConcurrentLinkedDeque
        // =============================================================
        System.out.println("3️⃣ ConcurrentLinkedDeque");
        /*
         * ✅ Lock-free, thread-safe double-ended queue
         * ✅ Supports concurrent insertions/removals at both ends
         *
         * 📈 Time Complexity:
         *   - offerFirst()/offerLast(): O(1)
         *   - pollFirst()/pollLast(): O(1)
         *   - peekFirst()/peekLast(): O(1)
         */
        ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<>();
        cld.offerFirst("Front");
        cld.offerLast("Back");
        System.out.println("ConcurrentLinkedDeque: " + cld);
        System.out.println("PollLast: " + cld.pollLast());
        System.out.println("After pollLast: " + cld);
        System.out.println();

        // =============================================================
        // 4️⃣ CopyOnWriteArrayList
        // =============================================================
        System.out.println("4️⃣ CopyOnWriteArrayList");
        /*
         * ✅ Thread-safe variant of ArrayList
         * ✅ Copy of the underlying array is created on every write (add/remove)
         * ✅ Best for scenarios with many reads and few writes
         *
         * 📈 Time Complexity:
         *   - get(): O(1)
         *   - add()/remove(): O(n) (due to copying)
         */
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("A");
        cowList.add("B");
        cowList.add("C");
        System.out.println("CopyOnWriteArrayList: " + cowList);
        cowList.remove("B");
        System.out.println("After remove(B): " + cowList);
        System.out.println();

        // =============================================================
        // 5️⃣ CopyOnWriteArraySet
        // =============================================================
        System.out.println("5️⃣ CopyOnWriteArraySet");
        /*
         * ✅ Thread-safe Set backed by CopyOnWriteArrayList
         * ✅ No duplicates, safe iteration during concurrent modification
         *
         * 📈 Time Complexity:
         *   - add(): O(n)
         *   - contains(): O(n)
         *   - iteration: O(n)
         */
        CopyOnWriteArraySet<String> cowSet = new CopyOnWriteArraySet<>();
        cowSet.add("X");
        cowSet.add("Y");
        cowSet.add("Z");
        System.out.println("CopyOnWriteArraySet: " + cowSet);
        System.out.println("Contains Y? " + cowSet.contains("Y"));
        System.out.println();

        // =============================================================
        // 6️⃣ BlockingQueue Implementations
        // =============================================================
        System.out.println("6️⃣ BlockingQueue Implementations\n");

        // 6.1 LinkedBlockingQueue
        /*
         * ✅ Thread-safe FIFO queue (optionally bounded)
         * ✅ Uses separate locks for put and take operations
         *
         * 📈 Time Complexity:
         *   - put()/take(): O(1)
         *   - offer()/poll(): O(1)
         */
        BlockingQueue<String> lbq = new LinkedBlockingQueue<>();
        lbq.add("One");
        lbq.add("Two");
        System.out.println("LinkedBlockingQueue: " + lbq);
        System.out.println("Take(): " + lbq.poll());
        System.out.println();

        // 6.2 ArrayBlockingQueue
        /*
         * ✅ Bounded blocking queue backed by array
         * ✅ Fairness option available (FIFO locking)
         *
         * 📈 Time Complexity:
         *   - put()/take(): O(1)
         *   - offer()/poll(): O(1)
         */
        BlockingQueue<Integer> abq = new ArrayBlockingQueue<>(3);
        abq.offer(100);
        abq.offer(200);
        abq.offer(300);
        System.out.println("ArrayBlockingQueue: " + abq);
        abq.poll();
        System.out.println("After poll(): " + abq);
        System.out.println();

        // 6.3 PriorityBlockingQueue
        /*
         * ✅ Unbounded, thread-safe priority queue
         * ✅ Elements ordered by natural order or comparator
         *
         * 📈 Time Complexity:
         *   - offer()/add(): O(log n)
         *   - poll(): O(log n)
         *   - peek(): O(1)
         */
        BlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        pbq.add(5);
        pbq.add(1);
        pbq.add(3);
        System.out.println("PriorityBlockingQueue: " + pbq);
        System.out.println("Poll: " + pbq.poll());
        System.out.println();

        // 6.4 DelayQueue
        /*
         * ✅ Elements become available only after delay has expired
         * ✅ Used in task scheduling
         *
         * 📈 Time Complexity:
         *   - offer(): O(log n)
         *   - poll(): O(log n)
         */
        class DelayedTask implements Delayed {
            private final long endTime;
            private final String name;
            public DelayedTask(String name, long delayMillis) {
                this.name = name;
                this.endTime = System.currentTimeMillis() + delayMillis;
            }
            @Override public long getDelay(TimeUnit unit) {
                return unit.convert(endTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            }
            @Override public int compareTo(Delayed other) {
                return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), other.getDelay(TimeUnit.MILLISECONDS));
            }
            @Override public String toString() { return name; }
        }

        DelayQueue<DelayedTask> dq = new DelayQueue<>();
        dq.put(new DelayedTask("Task1", 1000));
        dq.put(new DelayedTask("Task2", 2000));
        System.out.println("DelayQueue (waiting tasks): " + dq);
        System.out.println();

        // 6.5 SynchronousQueue
        /*
         * ✅ No internal capacity – each put must wait for a take
         * ✅ Ideal for direct handoff between threads
         *
         * 📈 Time Complexity:
         *   - put()/take(): O(1)
         */
        SynchronousQueue<String> sq = new SynchronousQueue<>();
        System.out.println("SynchronousQueue (demo skipped, requires 2 threads)");
        System.out.println();

        // 6.6 LinkedBlockingDeque
        /*
         * ✅ Thread-safe double-ended queue
         * ✅ Blocking put/take at both ends
         *
         * 📈 Time Complexity:
         *   - put()/take(): O(1)
         */
        BlockingDeque<String> lbd = new LinkedBlockingDeque<>();
        lbd.addFirst("Front");
        lbd.addLast("Back");
        System.out.println("LinkedBlockingDeque: " + lbd);
        System.out.println("TakeLast(): " + lbd.pollLast());
        System.out.println();

        // =============================================================
        // 7️⃣ ConcurrentSkipListMap
        // =============================================================
        System.out.println("7️⃣ ConcurrentSkipListMap");
        /*
         * ✅ Thread-safe, sorted map (non-blocking)
         * ✅ Keys sorted according to natural order or comparator
         *
         * 📈 Time Complexity:
         *   - get(): O(log n)
         *   - put(): O(log n)
         *   - remove(): O(log n)
         */
        ConcurrentSkipListMap<Integer, String> skipMap = new ConcurrentSkipListMap<>();
        skipMap.put(3, "Three");
        skipMap.put(1, "One");
        skipMap.put(2, "Two");
        System.out.println("ConcurrentSkipListMap (sorted): " + skipMap);
        System.out.println();

        // =============================================================
        // 8️⃣ ConcurrentSkipListSet
        // =============================================================
        System.out.println("8️⃣ ConcurrentSkipListSet");
        /*
         * ✅ Thread-safe, sorted set (non-blocking)
         * ✅ Backed by ConcurrentSkipListMap
         *
         * 📈 Time Complexity:
         *   - add(): O(log n)
         *   - remove(): O(log n)
         *   - contains(): O(log n)
         */
        ConcurrentSkipListSet<Integer> skipSet = new ConcurrentSkipListSet<>();
        skipSet.add(10);
        skipSet.add(5);
        skipSet.add(20);
        System.out.println("ConcurrentSkipListSet (sorted): " + skipSet);
        System.out.println();

        System.out.println("=============== END OF CONCURRENT COLLECTIONS DEMO ===============\n");
    }

}


/*


                                     JAVA COLLECTIONS FRAMEWORK
--------------------------------------------------------------------------------------------------------



                                    Iterable (Interface)
                                          |
                                   Collection (Interface)
                                          |
       ------------------------------------------------------------------------
       |                                   |                                  |
      List                               Set                               Queue
 (Interface)                        (Interface)                        (Interface)
       |                                   |                                  |
   ---------                       -----------------                ------------------
   |   |   |                       |               |                |                |
ArrayList LinkedList Vector     HashSet     LinkedHashSet     PriorityQueue       Deque
                                      |               |                                |
                                   TreeSet       (Ordered Set)                     ArrayDeque
                                  (SortedSet)



--------------------------------------------------------------------------------------------------------



                                   MAP HIERARCHY (Not a Collection)
                                   --------------------------------
                                            Map (Interface)
                                                  |
                        ---------------------------------------------------
                        |                         |                        |
                    HashMap                 LinkedHashMap               TreeMap
                        |                         |                    (SortedMap)
                ConcurrentHashMap                 |
                (Concurrent Map)            LRU cache patterns



--------------------------------------------------------------------------------------------------------



                               CONCURRENT COLLECTIONS (java.util.concurrent)
    --------------------------------------------------------------------------------
    |                         |                         |                         |
ConcurrentHashMap     CopyOnWriteArrayList     CopyOnWriteArraySet        ConcurrentLinkedQueue
ConcurrentSkipListMap ConcurrentSkipListSet    ConcurrentLinkedDeque      ArrayBlockingQueue
LinkedBlockingQueue   PriorityBlockingQueue    DelayQueue                 SynchronousQueue



--------------------------------------------------------------------------------------------------------

 */


/*

Console Output of Above Code
============================

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
[PQRST, Anish, Abhinav, Aayush, ABCDE]
PQRST
ABCDE
Aayush
[PQRST, Anish, Abhinav, Aayush, ABCDE]
[PQRST, Anish, Abhinav, Aayush, ABCDE]
[PQRST, Anish, Abhinav, Aayush, ABCDE]
[PQRST, Anish, Abhinav, Aayush, ABCDE]
PQRST
Anish
Abhinav
Aayush
ABCDE
ABCDE
Aayush
Abhinav
Anish
PQRST
PQRST
Anish
Abhinav
Aayush
ABCDE
[]
Anish
[Anish, 100]
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
key1
key2
Anish
key3
Abhinav
Aayush
1
2
31
3
28
26
key = key1, 1
key = key2, 2
key = Anish, 31
key = key3, 3
key = Abhinav, 28
key = Aayush, 26
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

=============== JAVA COLLECTIONS FRAMEWORK TUTORIAL ===============


1️⃣ LIST INTERFACE EXAMPLES

ArrayList: [Apple, Banana, Cherry, Apple]
After remove: [Apple, Cherry, Apple]
Contains 'Cherry'? true
Element at index 1: Cherry
LinkedList: [Mango, Apple, Cherry, Apple, Grapes]
After removeFirst(): [Apple, Cherry, Apple, Grapes]
Vector: [10, 20, 30]
Stack: [Java, Python, C++]
Pop top element: C++
Peek top: Python

2️⃣ SET INTERFACE EXAMPLES

HashSet: [A, B, C]
LinkedHashSet: [One, Two, Three]
TreeSet (sorted): [10, 20, 40, 50]
EnumSet: [RED, GREEN, BLUE]

3️⃣ MAP INTERFACE EXAMPLES

HashMap: {1=One, 2=Two, 3=Three}
After remove(2): {1=One, 3=Three}
Contains key 3? true
LinkedHashMap: {101=X, 102=Y, 103=Z}
TreeMap (sorted): {A=1, B=2, C=3}
Hashtable: {One=1, Two=2}
EnumMap: {RED=Stop, GREEN=Go}
ConcurrentHashMap: {John=100, Jane=200}
Before GC WeakHashMap: {java.lang.Object@1b28cdfa=WeakKey}
After GC WeakHashMap: {}
IdentityHashMap: {A=Value2, A=Value1}

4️⃣ QUEUE / DEQUE INTERFACE EXAMPLES

PriorityQueue: [10, 30, 20]
Poll (smallest): 10
ArrayDeque: [Front, Back]
After pollFirst(): [Back]
LinkedBlockingQueue: [Task1, Task2]
PriorityBlockingQueue (sorted): [1, 5, 3]
ConcurrentLinkedQueue: [Alpha, Beta]
LinkedBlockingDeque: [First, Last]

5️⃣ COMMON OPERATIONS ON COLLECTIONS

Numbers: [5, 3, 9, 1, 2]
Min: 1
Max: 9
Sorted: [1, 2, 3, 5, 9]
Reversed: [9, 5, 3, 2, 1]
Even numbers via Stream: [2]
Unmodifiable list: [Apple, Cherry, Apple]

=============== END OF COLLECTIONS DEMO ===============

=============== JAVA CONCURRENT COLLECTIONS TUTORIAL ===============

1️⃣ ConcurrentHashMap
ConcurrentHashMap: {A=1, B=2, C=3}
Get A: 1
After compute(B): {A=1, B=12, C=3}

2️⃣ ConcurrentLinkedQueue
ConcurrentLinkedQueue: [Task1, Task2, Task3]
Poll: Task1
After poll: [Task2, Task3]

3️⃣ ConcurrentLinkedDeque
ConcurrentLinkedDeque: [Front, Back]
PollLast: Back
After pollLast: [Front]

4️⃣ CopyOnWriteArrayList
CopyOnWriteArrayList: [A, B, C]
After remove(B): [A, C]

5️⃣ CopyOnWriteArraySet
CopyOnWriteArraySet: [X, Y, Z]
Contains Y? true

6️⃣ BlockingQueue Implementations

LinkedBlockingQueue: [One, Two]
Take(): One

ArrayBlockingQueue: [100, 200, 300]
After poll(): [200, 300]

PriorityBlockingQueue: [1, 5, 3]
Poll: 1

DelayQueue (waiting tasks): [Task1, Task2]

SynchronousQueue (demo skipped, requires 2 threads)

LinkedBlockingDeque: [Front, Back]
TakeLast(): Back

7️⃣ ConcurrentSkipListMap
ConcurrentSkipListMap (sorted): {1=One, 2=Two, 3=Three}

8️⃣ ConcurrentSkipListSet
ConcurrentSkipListSet (sorted): [5, 10, 20]

=============== END OF CONCURRENT COLLECTIONS DEMO ===============


*/
