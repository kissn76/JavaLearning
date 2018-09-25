package basics;

import java.util.NoSuchElementException;

public class B2SwitchCase {

    public static void main(String[] args) throws NoSuchElementException {
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("By-by!");
                return;
            default:
                System.out.println("'" + c + "' betűt nyomtál!");
                break;
        }
    }

}
