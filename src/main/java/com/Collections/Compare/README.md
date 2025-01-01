## Comparator
- A Comparator interface is used to order the objects of user-defined classes.
- A Comparator object is capable of comparing two objects of the same class
- Comparator interface contains two methods
  - ```compare(Object obj1, Object obj2)``` used to sort the objects
  - ```equals(Object element)``` used to compare the objects
  - eg 
  ```java
    class Sortbyroll implements Comparator<User>{
      @Override
      public int compare(User o1, User o2){
          return o1.roll-o2.roll;
        }
    }
  ```
  
## Comparable
- It is used to define the natural ordering of the objects within the class.

| Features             | Comparable  |Comparator|
|----------------------|------|------|
| **Definition**       |It defines natural ordering within the class.|It defines external sorting logic.|
| **Method**           |compareTo()|compare()|
| **Implementation**   |It is implemented in the class.|It is implemented in a separate class.|
| **Sorting Criteria** |Natural order sorting|Custom sorting|
|**Usage**|It is used for single sorting order.|It is used for multiple sorting orders.|