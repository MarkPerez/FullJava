package dayOne;

import java.util.Scanner;

/**
 * Created by Student on 27/06/2016.
 */
public class BinaryProgramme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String binary = input.nextLine();

        Conversion(binary);
    }

    static void Conversion(String binary)
    {
        int result = 0, mul = 1;
        for (int i = binary.length() - 1; i >= 0; i--)
        {
            if (binary.charAt(i) == '1')
            {
                result += mul;
            }
            mul *= 2;
        }

        System.out.println(result);
    }


}
