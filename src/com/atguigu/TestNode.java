package com.atguigu;

public class TestNode {
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.append(n2).append(n3).append(n4);
        n1.showAllData();
        n1.reverse().showAllData();
    }
}
