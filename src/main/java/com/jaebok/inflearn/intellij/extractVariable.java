package com.jaebok.inflearn.intellij;

public class extractVariable {
    public void variable() {
        String messag = String.format("%d + %d = %d", 1, 2, 1 + 3);
        System.out.println(messag);
        System.out.println(messag);
        System.out.println(String.format("%d + %d = %d", 1, 2, 1 + 2));
    }

    public void parameter() {
        parameter(10);
    }

    public void parameter(int num) {
        System.out.println(num);
        System.out.println(num);
    }
}
