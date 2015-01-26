
import java.util.Scanner;

public class BitRotation_Broken {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());
        
        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();

            if (direction.equals("right")) {  // == don't work correct for string
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 5; //change bit pos.6 -> 5
            } else {
                int leftMostBit = (number >> 5) & 1; //change bit pos.6 -> 5
                number <<= 1;
                number &=(~(1<<6));  //add this row for delete bit pos.6
                number |= leftMostBit;
            }
        }

        System.out.println(number);
    }
}