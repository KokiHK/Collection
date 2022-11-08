
package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {

		//DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		LocalDate date1 = LocalDate.of(2021, 10, 21);
		LocalDate date2 = LocalDate.of(2021, 9, 15);
		LocalDate date3 = LocalDate.of(2021, 12, 4);
		LocalDate date4 = LocalDate.of(2021, 8, 10);
		LocalDate date5 = LocalDate.of(2021, 11, 9);

		//LocalDate date1m = LocalDate.parse("2021, 10, 21");

		Task task1 = new Task(date1, "牛乳を買う。");
		Task task2 = new Task(date2, "○○社面談。");
		Task task3 = new Task(date3, "手帳を買う。");
		Task task4 = new Task(date4, "散髪に行く。");
		Task task5 = new Task(date5, "スクールの課題を解く。");

		List<Task> diary = new ArrayList<Task>();
		diary.add(task1);
		diary.add(task2);
		diary.add(task3);
		diary.add(task4);
		diary.add(task5);

		Comparator<Task> comparator = new Comparator<Task>() {
			@Override
			public int compare(Task task1, Task task2) {
				return task1.getDate().compareTo(task2.getDate());
			}
		};

		Collections.sort(diary,comparator);

		for (Task u2 : diary) {
			System.out.println(u2);

		}

	}

}

//2021年10月21日 牛乳を買う。
//2021年9月15日 ○○社面談。
//2021年12月4日 手帳を買う。
//2021年8月10日 散髪に行く。
//2021年11月9日 スクールの課題を解く。
