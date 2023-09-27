package numbers;

public class RemoveLetters_Edubridge {

	public static void main(String[] args)
	{
		String input = "Edubridge";

        if (input.length() >= 2) {
            String result = input.substring(1, input.length() - 1);
            System.out.println("Original: " + input);
            System.out.println("Modified: " + result);
        } else {
            System.out.println("Input string is too short.");
        }
		

	}

}
