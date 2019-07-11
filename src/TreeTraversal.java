// 백준 1991

import java.util.Scanner;
import java.util.TreeMap;

public class TreeTraversal implements Run {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] array = new String[N + 1];
        TreeMap<String, Node> treeMap = new TreeMap<>();
        for (int i = 1; i <= N; i++) {
            array[i] = scanner.next();
            String left = scanner.next();
            String right = scanner.next();
            treeMap.put(array[i], new Node(array[i],
                    left.equals(".") ? null : new Node(left),
                    right.equals(".") ? null : new Node(right)
            ));
        }

        Node root = treeMap.get(array[1]);
        root.makeTree(treeMap);

        root.prePrint();
        System.out.println();
        root.inPrint();
        System.out.println();
        root.postPrint();
    }
}

class Node {
    private String root;
    private Node leftNode;
    private Node rightNode;

    public Node(String root) {
        this.root = root;
    }

    public Node(String root, Node leftNode, Node rightNode) {
        this.root = root;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public void makeTree(TreeMap treeMap) {
        if (leftNode != null) {
            leftNode = (Node) treeMap.get(leftNode.root);
            leftNode.makeTree(treeMap);
        }
        if (rightNode != null) {
            rightNode = (Node) treeMap.get(rightNode.root);
            rightNode.makeTree(treeMap);
        }
    }

    public void prePrint() {
        System.out.print(this.root);
        if (leftNode != null) {
            leftNode.prePrint();
        }
        if (rightNode != null) {
            rightNode.prePrint();
        }
    }

    public void inPrint() {
        if (leftNode != null) {
            leftNode.inPrint();
        }
        System.out.print(this.root);
        if (rightNode != null) {
            rightNode.inPrint();
        }
    }

    public void postPrint() {
        if (leftNode != null) {
            leftNode.postPrint();
        }
        if (rightNode != null) {
            rightNode.postPrint();
        }
        System.out.print(this.root);
    }
}