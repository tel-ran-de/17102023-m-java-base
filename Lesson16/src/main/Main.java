package main;

import task.Test;
import task.sub_task.SubTest;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.name);
        SubTest subTest = new SubTest();
        System.out.println(subTest.name);
    }
}
