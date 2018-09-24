package sample;

public class SampleBitWise {
    static final int VISIBLE = 1;
    static final int DRAGGABLE = 2;
    static final int SELECTABLE = 4;
    static final int EDITABLE = 8;

    public static void main(String[] args) {
        int flags = 0;

        flags = flags | VISIBLE;
        flags = flags | DRAGGABLE;
        // flags = flags | SELECTABLE;
        flags = flags | EDITABLE;

        System.out.println(flags);
        System.out.println(Integer.toBinaryString(flags));

        if ((flags & VISIBLE) == VISIBLE) {
            System.out.println("Visible");
        }

        if ((flags & DRAGGABLE) == DRAGGABLE) {
            System.out.println("Draggable");
        }

        if ((flags & SELECTABLE) == SELECTABLE) {
            System.out.println("Selectable");
        }

        if ((flags & EDITABLE) == EDITABLE) {
            System.out.println("Editable");
        }
    }

}
