package com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Demo implements java.io.Serializable{
    public int a;
    public String b;
    Demo (int a, String b){
        this.a = a;
        this.b = b;
    }
}

public class Serializations {
    /*
    Serialization is a mechanism to convert the state of object into byte stream.
    Deserialization is the reverse process where the byte stream is used to recreate the actual java object in memory.
    Serialization and Deserialization are crucial for saving and restoring the state of java objects.

    byte stream created is platform independent, So the object serialized on one machine can be deserialized on the other machine.
    To make java object serializable, we implement serializable interface
    java.io.Serializable interface

    Advantages of Serialization
    1. to save the state of an object.
    2. to travel an object across the network.

    transient is a variable modifier used in serialization. At the time of serialization,
    if we don’t want to save the value of a particular variable in a file, then we use transient keyword

    Note:
    1. If a parent class implements Serializable interface, then child class does not need to implement it, but vice versa, it's not true.
    2. only non-static data members are saved via a serialization process.
    3. Static data members and transient data members are not saved via Serialization Process.
        So, if you don't want to save values of a non-static data member, then make it transient.
    4. Constructor of an object is never called when an object is Serialized.
    5. Associated members must be implementing serializable interface.
     */

    public static void main(String[] args) {
        Demo object = new Demo(1, "name");
        String filename = "file.ser";
        Path path = Paths.get(filename);

        //Serialization
        try{
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path));

            out.writeObject(object);    // Object has been serialized
            out.close();

        }catch (IOException e){
            System.out.println(e);
        }


        Demo object1  = null;
        //Deserialization
        try{
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path));
            object1 = (Demo) in.readObject(); // Object is Deserialized

            in.close();

            System.out.println(object1.a);
            System.out.println(object1.b);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
