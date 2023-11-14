public class BinaryToDecimalLL {
    public static void main(String[] args) {

        LinkedList mylist = new LinkedList(0);
        /*mylist.append(0);
        mylist.append(1);*/

        LinkedList.Node current = mylist.head;
        int dec = 0;

        while (current!=null){
            dec = (dec*2) + current.value;
            current = current.next;
        }
        System.out.println(dec);
    }
}
