1. Sorted Map:
    ->A sub-interface of Map that ensures keys are in ascending order
    -> Maintains the natural ordering of keys or uses a custom Comparator
    -> Provides methods like firstKey(), lastKey() and subMap().
    -> UseCase: when you need a map of Sorted Keys.

2. Navigable Map:
    -> Extends SortedMap with Navigation Methods
    -> Additional Methods like lowerKey(), floorKey(), ceilingKey(), higerKey()
    -> Supports descending views with descendingMap().
    -> Use Case: When you need more fine-grained control over key ordering.

3. Concurrent Map:
    -> A sub-interface of Map designed for concurrent use.
    -> Provides atomic operations like putIfAbsent(), remove(), replace()
    -> Use Case: When multiple threads access and modify the map concurrently

4. Tree Map:
    -> Implements NavigableMap and SortedMap, backed by Red-black Tree
    -> Sorted key Order
    -> Allows null values but not null keys
    -> Use Case: When you need a map with sorted keys and don't need thread safety

5. Abstract Map:
    - A skeletal implementations of Map interface
    - simplifies the creation of custom map implementations
    - Provides default implementations for most Map methods
    - Use Case: When creating custom map implementations by extending AbstractMap.

6. EnumMap:
    - A specialize Map for use with enum keys
    - Keys must be of a single enum type
    - Very fast due to internal use of arrays
    - Use Case: When the keys of the map are enums

7. ConcurrentHashMap:
    - Implements ConcurrentMap and Map for thread safe operations
    - Allows high concurrency with segment-based locking(bucket-level locking)
    - Does not allow null keys or null values.
    - Use Case: When you need a highly concurrent and thread-safe map

8. HashMap:
    - Implements Map interface using hash table 
    - Allow null keys and values
    - Does not guarantee any order ok keys
    - General purpose map for non-thread safe use

9. IdentityHashMap:
    - A specialized Map implementation using reference equality(==) instead of equals() for keys.
    - Faster when reference equality is sufficient.
    - Useful for topology-preserving graph algo.
    - UseCase: when you need key comparison based on object identity.

10. LinkedHashMap:
    - Extends HashMap to maintain insertion order.
    - Iteration order matches the order in which keys are inserted.
    - Optionally maintains access order when configured.
    - Use Case: When iteration order is important.

11. HashTable:
    - A legacy synchronized map implementation.
    - Thread-safe but slower than concurrentHashMap
    - Does not allow null keys or values.
    - UseCase: Legacy code that requires thread safety

12. Properties class:
    - A subclass of HashTable specifically for managing key-value pairs where both keys and values are String
    - Commonly used for configuration settings.
    - Supports loading and storing properties to and from streams.
    - UseCase: When you need to handle application configuration or setting files.

# Summary Table

| Class/Interface       | Key Features                            | Thread Safety        | Order Maintenance       | Null Key/Value |
|------------------------|-----------------------------------------|----------------------|-------------------------|----------------|
| SortedMap             | Keys sorted, sub-interface of Map.      | No                   | Sorted                  | No/Yes         |
| NavigableMap          | Navigation methods, descending views.   | No                   | Sorted                  | No/Yes         |
| ConcurrentMap         | Atomic operations for concurrency.      | Yes                  | No                      | No/No          |
| TreeMap               | Red-Black tree, sorted keys.            | No                   | Sorted                  | No/Yes         |
| AbstractMap           | Base class for custom maps.             | Depends on subclass  | Depends on subclass     | Depends        |
| ConcurrentHashMap     | High concurrency map.                   | Yes                  | No                      | No/No          |
| EnumMap               | Optimized for enum keys.                | No                   | Enum ordinal order      | No/Yes         |
| HashMap               | General-purpose hash table.             | No                   | No                      | Yes/Yes        |
| IdentityHashMap       | Reference equality for keys.            | No                   | No                      | Yes/Yes        |
| LinkedHashMap         | Maintains insertion/access order.       | No                   | Yes                     | Yes/Yes        |
| HashTable             | Legacy synchronized map.                | Yes                  | No                      | No/No          |
| Properties            | String-based keys/values.               | Yes                  | No                      | No/No          |

