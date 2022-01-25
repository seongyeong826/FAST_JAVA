package ch11;

public class MakeReportTest {

	public static void main(String[] args) {
		
		MakeReport buildder = new MakeReport();
		String report = buildder.getReport();
		
		System.out.println(report);

	}

}
