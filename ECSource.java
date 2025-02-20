class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    Node<T> temp = head;
    boolean isUnique = true;
    while (temp != null) {
      if (temp.next == null) {
        break;
      }
      if (temp.val == temp.next.val) {
        temp = temp.next;
        isUnique = true;
      }
      else {
        isUnique = false;
        break;
      }
    }
    return isUnique;
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        // System.out.println((ECSource.isUnivalueList(z)));
        // Node<Integer> u = new Node<>(2);
        // Node<Integer> v = new Node<>(2);
        // Node<Integer> w = new Node<>(2);
        // Node<Integer> x = new Node<>(2);
        // Node<Integer> y = new Node<>(2);
        
        // u.next = v;
        // v.next = w;
        // w.next = x;
        // x.next = y;
        
        // // 2 -> 2 -> 2 -> 2 -> 2
        
        // System.out.println(ECSource.isUnivalueList(u)); // true
      Node<Integer> u = new Node<>(2);
      Node<Integer> v = new Node<>(2);
      Node<Integer> w = new Node<>(3);
      Node<Integer> x = new Node<>(3);
      Node<Integer> y = new Node<>(2);

      u.next = v;
      v.next = w;
      w.next = x;
      x.next = y;

      // 2 -> 2 -> 3 -> 3 -> 2

        System.out.println(ECSource.isUnivalueList(u)); // false
        
    }
}
