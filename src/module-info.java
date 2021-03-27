module Lambda {import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5784970830);
    numbers.add(9864699847);
    numbers.add(8868242728);
    numbers.add(17367372753);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
interface StringFunction {
	  String run(String str);
	}

	public class Main {
	  public static void main(String[] args) {
	    StringFunction email = (s) -> s + "imaishwaryashelar@gmail.com";
	    StringFunction FirstName = (s) -> s + "Aishwarya";
	    printFormatted("imaishwaryashelar@gmail.com", print);
	    printFormatted("Aishwarya", print);
	  }
	  public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }
	}


}