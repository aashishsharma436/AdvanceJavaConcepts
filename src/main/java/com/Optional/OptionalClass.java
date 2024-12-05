package com.Optional;

import java.util.Optional;

public class OptionalClass {
    /*
    -> To overcome from nullPointerException, we use optional library
    -> Optional helps you in writing a neat code without using too many null checks
    -> By using Optional, we can specify alternate values to return or alternate code to run
    -> This makes the code more readable because the facts which were hidden are now visible to developer.

    Important Method of Optional
    1. isPresent(): It returns true if the value is present
    2. get(): returns the value of Optional
    3. Optional.OfNullable(Object): Handle the NullPointerException, It Returns an Optional describing the specified value if non-null, otherwise returns an empty Optional.
    4. Optional.Of(Object): Returns an Optional with the specified present non-null value.
    5. hashCode(): Returns the hash code value of the present value, if any, or 0 if no value is present.

    Concrete Methods:   The method has a complete definition but can be overridden in the inherited class. If we make this method final
                        then we can not be overridden

     */
    public static void main(String[] args) {
        String str = null;
        Optional<String> checknull = Optional.ofNullable(str);
        if (checknull.isPresent()) System.out.println("Value of String is null");
        else System.out.println("Value of String is: "+ str);
        System.out.println(checknull.hashCode());
    }
}
