package com.example;

public class RmmAgent {

    public static void main(String[] args) {
        System.out.println("Simple RMM Agent v3.1 is running...");
        while (true) {
            try {
                System.out.println("Agent Heartbeat: alive");
                Thread.sleep(10000); // 10 seconds
            } catch (InterruptedException e) {
                System.out.println("Agent interrupted!");
            }
        }
    }
}
