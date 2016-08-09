package PatternString;

/**
 * Class for change in the text tegs on teg <p>
 */

public class Pattern {

	public static void main(String[] args) {
		String string = "<pid=\"name1\"> Абзац 1 текст</p><p id=\"name2\">Абзац 2" + " текст.</p>"
				+ "<p i d=\"name3\">Абзац 1 текст</p>" + "<p id=====!!!>Абзац4</p>";
		//System.out.println(x);
		System.out.println("Строка исходная:");
		System.out.println(string + "\n");
		System.out.println("Строка с замененными тегами:");
		String newString = string.replaceAll("<p.*?>", "<p>");
		System.out.println(newString);
	}
}
