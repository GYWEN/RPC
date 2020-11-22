package com.gyw.struct.binaryTree;

import javafx.scene.layout.BorderStrokeStyle;

public class BST<T extends Comparable<T>> {

    private Node<T> root;
    private int size;


    public void add(T val){
        add(root,val);
    }

    /**
     * 向某个子树中插入数据
     * @param node node
     * @param val val
     */
    private void add(Node<T> node, T val){

        if(node == null){
            node = new Node<T>(val);
            return;
        }
        //左子树
        if(node.val.compareTo(val) < 0){
            add(node.left,val);
        } else {
            add(node.right,val);
        }


    }

    public void test(Node<Integer> t){
        if(t == null){
            t= new Node<Integer>(0);
        }
        t.val = t.val + 1;
    }

    public static class Node<T>{
        private T val;
        private Node<T> left;
        private Node<T> right;

        public Node(T val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        BST<Integer> bst = new BST<Integer>();
        Node<Integer> node = null;
//        bst.add(1);
//        bst.add(2);
//        bst.add(3);
        bst.test(node);
        System.err.println(node.val);

    }

}
