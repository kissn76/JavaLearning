package basics;

public class A3BitWise {

    static final int VISIBLE = 1;
    static final int DRAGGABLE = 2;
    static final int SELECTABLE = 4;
    static final int EDITABLE = 8;

    public static void main(String[] args) {
        int flags = 0;

        flags = flags | VISIBLE;
        // flags = flags | DRAGGABLE;
        flags = flags | SELECTABLE;
        flags = flags | EDITABLE;

        System.out.println(flags);
        System.out.println(Integer.toBinaryString(flags));

        String f = "";

        if ((flags & VISIBLE) == VISIBLE) {
            f += "Visible";
            f += " ";
        }

        if ((flags & DRAGGABLE) == DRAGGABLE) {
            f += "Draggable";
            f += " ";
        }

        if ((flags & SELECTABLE) == SELECTABLE) {
            f += "Selectable";
            f += " ";
        }

        if ((flags & EDITABLE) == EDITABLE) {
            f += "Editable";
            f += " ";
        }

        f = f.trim();
        System.out.println(f);
    }

}
