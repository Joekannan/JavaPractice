package javaCodeSnippets.Day4;

public class PrivateAccessModifier {

	public static void main(String[] args) {
		Add2Num add = new Add2Num();
		System.out.println(add.a);
		System.out.println(add.b);
		add.sumOf2Num();
	}

}
