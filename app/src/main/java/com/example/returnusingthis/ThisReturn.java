package com.example.returnusingthis;

public class ThisReturn {
    int x = 100;

    int m1(int x) {
        System.out.println("method m1");
        return this.x;  //returning instance variable value
    }
}
