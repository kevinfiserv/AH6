import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    // todo
    List<String> newArr = new ArrayList<>();

    while (head != null) {
      newArr.add(head.val);
      head = head.next;
    }

    return newArr;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(Solution.linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]

    Node<String> k = new Node<>("k");
    Node<String> e = new Node<>("e");
    Node<String> v = new Node<>("v");
    k.next = e;
    e.next = v;

    // k -> e -> v
    System.out.println(Solution.linkedListValues(k));
  }
}
