package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
	private String task;
	private LocalDate date;

	public Task(LocalDate date, String task) {
		this.task = task;
		this.date = date;
	}

	final public String getTask() {
		return this.task;
	}

	public LocalDate getDate() {

		return this.date;
	}

	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String s = date.format(f);
		StringBuilder t = new StringBuilder().append(s).append(":").append(getTask());

		String u = t.toString();
		return u;

	}

	@Override
	public int compareTo(Task o) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	};

}

//2021年10月21日 牛乳を買う。
//2021年9月15日 ○○社面談。
//2021年12月4日 手帳を買う。
//2021年8月10日 散髪に行く。
//2021年11月9日 スクールの課題を解く。