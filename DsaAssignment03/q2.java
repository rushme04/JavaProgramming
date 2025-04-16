package DsaAssignment03;

public class q2 {

	public static void main(String[] args) {
		String[] colors = {"Red", "Blue", "Green"};

        try {
        	//Valid Access
            System.out.println("First color: " + colors[0]);
            // ArrayIndexOutOfBoundsException
            System.out.println("Fourth color: " + colors[3]);

            //NullPointerException
            colors[1] = null;
            System.out.println("Length of color at index 1: " + colors[1].length());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Index is out of range!");
        } catch (NullPointerException e) {

            System.out.println("Error: Color is null!");
        }
    
	}

}
