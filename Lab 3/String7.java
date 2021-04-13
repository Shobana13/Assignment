package ass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class String7 {
	void printDate(int year, Month month, int days) {

		LocalDate pdate1 = LocalDate.of(year, month, days);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate1, now);

		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}

	public static void main(String[] args) {

		String7 pd = new String7();
		pd.printDate(2021, Month.MARCH, 8);

	}
}
