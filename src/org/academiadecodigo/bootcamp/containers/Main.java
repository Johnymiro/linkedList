package org.academiadecodigo.bootcamp.containers;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> str = new LinkedList<>();
        LinkedList<Integer> integer = new LinkedList<>();
        LinkedList<String[]> strArr = new LinkedList<>();

        String[] arr = {"Hello", "from", "ArrayList"};

        strArr.add(arr);
        str.add("Hello");
        integer.add(1);


        System.out.println(str.get(0));
    }
}
