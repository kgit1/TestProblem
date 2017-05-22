package aTestProblem;

public class DataDate implements Comparable<DataDate> {

	private int year;
	private int month;
	private int day;

	public DataDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}

	@Override
	public int compareTo(DataDate date) {
		if (this.getYear() == date.getYear()) {

			if (this.getMonth() == date.getMonth()) {

				if (this.getDay() > date.getDay()) {
					return 1;
				} else if (this.getDay() < date.getDay()) {
					return -1;
				}
				return 0;

			} else if (this.getMonth() > date.getMonth()) {
				return 1;
			} else if (this.getMonth() < date.getMonth()) {
				return -1;
			}
			//return 0;
		} else if (this.getYear() > date.getYear()) {
			return 1;
		} else if (this.getYear() < date.getYear()) {
			return -1;
		}
		return 0;
	}

}
