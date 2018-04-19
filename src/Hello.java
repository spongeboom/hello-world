import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
			if(args.length == 0)
				System.out.println("길이가짧아요 다시입력 하세");
			else
			System.out.println("안녕하세요" + args[0] + "" );
			
	}
}