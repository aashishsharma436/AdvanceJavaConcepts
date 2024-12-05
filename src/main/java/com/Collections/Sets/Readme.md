1. NavigableSet Interface
    - Definition: A sub-interface of SortedSet that provides methods for navigation and retrieval of elements.
      - Supports methods for accessing elements based on their proximity to a given element, such as:
        - lower(E e): Returns the greatest element strictly less than e.
        - floor(E e): Returns the greatest element less than or equal to e.
        - ceiling(E e): Returns the least element greater than or equal to e.
        - higher(E e): Returns the least element strictly greater than e.
      - Provides views such as descendingSet() (reversed order). 
      - Example Implementation: TreeSet, ConcurrentSkipListSet. 
      - Use Case: When you need a sorted set with additional navigation capabilities.
      

2. TreeSet Class
   - Implements NavigableSet and is backed by a Red-Black tree.
   - Maintains elements in ascending order (natural ordering or via a custom comparator).
   - Does not allow null elements.
   - Methods like first(), last(), and range views (subSet(), headSet(), tailSet()) are supported.
   - Not thread-safe.
   - Use Case: When you need a sorted set without the need for thread safety.
   - Basic operations (add, remove, contains) have a time complexity of O(logn).


3. ConcurrentSkipListSet Class
   - A thread-safe, concurrent implementation of NavigableSet using a skip list.
   - Maintains elements in ascending order.
   - Thread-safe for concurrent access without explicit synchronization.
   - Does not allow null elements.
   - Iterators and views reflect the current state of the set at the time of iteration.
   - Slower than TreeSet for single-threaded operations but excels in concurrent environments.
   - Use Case: When you need a thread-safe sorted set with good performance in concurrent scenarios.
   - Operations like add, remove, and contains have a time complexity of O(logn).


# Comparison of NavigableSet, TreeSet, and ConcurrentSkipListSet

| Feature                   | NavigableSet                        | TreeSet                                    | ConcurrentSkipListSet                     |
|---------------------------|-------------------------------------|--------------------------------------------|-------------------------------------------|
| **Interface or Class**    | Interface                           | Class                                      | Class                                     |
| **Thread Safety**         | Not thread-safe by itself           | Not thread-safe                            | Thread-safe                               |
| **Sorting Order**         | Natural/custom comparator           | Natural/custom comparator                  | Natural/custom comparator                 |
| **Null Handling**         | Implementation-dependent            | Does not allow `null`                      | Does not allow `null`                     |
| **Data Structure**        | Implementation-dependent            | Red-Black tree                             | Skip list                                 |
| **Concurrency**           | Not inherently concurrent           | Single-threaded use only                   | Designed for concurrent access            |
| **Performance**           | Depends on implementation           | `O(log n)`                                 | `O(log n)`                                |
| **Additional Methods**    | Navigation (`lower`, `floor`, etc.) | Navigation + range views (`subSet`, etc.)  | Navigation + range views (`subSet`, etc.) |

