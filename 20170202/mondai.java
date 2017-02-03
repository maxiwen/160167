public class mondai{
	public static void main(String[] args) {
		String[] mondai;
		mondai = new String[3];

		mondai[0] = "お名前は？";
		mondai[1] = "家はどこですか";
		mondai[2] = "職業は何ですか";

		String[] data = mondai[0].split(",");
		System.out.println(data[1]);
	}
}