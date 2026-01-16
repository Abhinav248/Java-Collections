====================================================================
README – Java Collections Demonstration (List, Set, Map, Queue, Stack)
====================================================================

This project demonstrates the usage, behavior, internal hierarchy,
and performance characteristics of core Java Collection Framework
data structures using simple example methods.

The `main` method acts as a driver that invokes individual methods,
each showcasing a specific collection type.

--------------------------------------------------------------------
1. MAIN METHOD OVERVIEW
--------------------------------------------------------------------

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
    convertCollections();                 // Important collection conversions

    // Tutorials on Java Collection
    collectionTutorials();                // Conceptual tutorials

    // Concurrent Collections
    concurrentCollectionsTutorial();      // Thread-safe collections

}

Each method focuses on:
- Basic operations (add, remove, search)
- Ordering and uniqueness
- Performance characteristics
- Use cases

--------------------------------------------------------------------
2. JAVA COLLECTION FRAMEWORK – CLASS HIERARCHY (TEXT DIAGRAM)
--------------------------------------------------------------------

NOTE:
- Collection and Map are separate hierarchies.
- Hashtable is a legacy synchronized Map.
- TreeMap is Red-Black Tree based.
- HashMap and Hashtable are hash-based.

-------------------------
COLLECTION HIERARCHY
-------------------------

java.lang.Iterable
        |
        v
java.util.Collection
        |
        +---------------------------+
        |                           |
     java.util.List             java.util.Set
        |                           |
        |                           +----------------------+
        |                           |                      |
        |                       HashSet                TreeSet
        |                           |                      |
        |                       (uses HashMap)     (uses TreeMap)
        |
        +-------------------+
        |                   |
    ArrayList           LinkedList
                            |
                            v
                         Deque
                            |
                            v
                        ArrayDeque


-------------------------
QUEUE / STACK HIERARCHY
-------------------------

java.util.Collection
        |
        v
java.util.Queue
        |
        +--------------------+
        |                    |
   PriorityQueue         Deque
                              |
                              +----------------+
                              |                |
                         ArrayDeque         LinkedList


java.util.Vector
        |
        v
      Stack   (Legacy, synchronized)


-------------------------
MAP HIERARCHY
-------------------------

java.util.Map
        |
        +-------------------------------+
        |                               |
     HashMap                         TreeMap
        |                               |
        |                        (Red-Black Tree)
        |
     Hashtable   (Legacy, synchronized)

--------------------------------------------------------------------
3. INTERNAL WORKING – HIGH LEVEL
--------------------------------------------------------------------

ArrayList
- Backed by dynamic array
- Index-based access is fast
- Costly insert/remove in middle

LinkedList
- Doubly linked list
- Fast insert/remove
- Slow random access

HashSet
- Uses HashMap internally
- No ordering
- No duplicates

TreeSet
- Uses TreeMap internally
- Sorted order maintained
- No duplicates

HashMap
- Hash table with buckets
- Allows one null key
- Not thread-safe

Hashtable
- Synchronized HashMap (legacy)
- No null key/value
- Slower due to synchronization

TreeMap
- Red-Black Tree
- Sorted by key
- No hashing, no buckets, no collisions

--------------------------------------------------------------------
4. TIME COMPLEXITY TABLE (AVERAGE CASE)
--------------------------------------------------------------------

Legend:
add      -> insert element
remove   -> delete element
contains -> search element / key

------------------------------------------------------------
DATA STRUCTURE        | add      | remove   | contains
------------------------------------------------------------
ArrayList             | O(1)*    | O(n)     | O(n)
LinkedList            | O(1)**   | O(1)**   | O(n)
------------------------------------------------------------
HashSet               | O(1)     | O(1)     | O(1)
TreeSet               | O(log n) | O(log n) | O(log n)
------------------------------------------------------------
HashMap               | O(1)     | O(1)     | O(1)
Hashtable              | O(1)     | O(1)     | O(1)
TreeMap               | O(log n) | O(log n) | O(log n)
------------------------------------------------------------
Stack                  | O(1)     | O(1)     | O(n)
Queue (LinkedList)     | O(1)     | O(1)     | O(n)
ArrayBlockingQueue     | O(1)     | O(1)     | O(n)
Deque (ArrayDeque)     | O(1)     | O(1)     | O(n)
------------------------------------------------------------

* ArrayList add is O(1) amortized (resizing costs O(n))
** LinkedList add/remove is O(1) only when position is known

Worst Case Notes:
- Hash-based structures degrade to O(n) if hash collisions are extreme
- Tree-based structures remain O(log n) due to balancing

--------------------------------------------------------------------
5. KEY DIFFERENCES – HashMap vs Hashtable vs TreeMap
--------------------------------------------------------------------

HashMap
- Not synchronized
- Allows one null key
- Faster
- Uses hashing + buckets

Hashtable
- Synchronized
- No null key/value
- Legacy
- Thread-safe but slower

TreeMap
- Sorted Map
- No hashing
- Uses Red-Black Tree
- No null key
- Guaranteed O(log n)

--------------------------------------------------------------------
6. CONCURRENT COLLECTIONS (MENTIONED IN PROJECT)
--------------------------------------------------------------------

Examples typically covered:
- ConcurrentHashMap
- CopyOnWriteArrayList
- CopyOnWriteArraySet
- BlockingQueue variants

Purpose:
- Thread safety without full synchronization
- Better scalability than Hashtable or synchronized blocks

--------------------------------------------------------------------
7. WHY THIS STRUCTURE IS USEFUL
--------------------------------------------------------------------

This project helps you:
- Understand when to use which collection
- Visualize internal Java collection hierarchy
- Compare performance trade-offs
- Prepare for Java & DSA interviews
- Relate theory to real code execution

--------------------------------------------------------------------
END OF README
--------------------------------------------------------------------
