package entity;

public abstract class Parent {

    static {
        System.out.println("Parent: static 1");
    }

    static {
        System.out.println("Parent: static 2");
    }

    private String name;

    {
        System.out.println("Parent: instance 1");
    }

    {
        System.out.println("Parent: instance 2");
    }

    Parent() {
        System.out.println("Parent: constructor");
    }

    Parent(String name) {
        this.name = name;
        System.out.println("Parent: name - constructor");
    }
}
