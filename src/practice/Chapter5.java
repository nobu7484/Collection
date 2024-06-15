package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		List<Task> list1 = new ArrayList<>();
		list1.add(new Task(LocalDate.of(2024,10,21),"牛乳を買う。"));
		list1.add(new Task(LocalDate.of(2024,9,15),"●●社面談"));
		list1.add(new Task(LocalDate.of(2024,12,4),"手帳を買う"));
		list1.add(new Task(LocalDate.of(2024,8,10),"散髪に行く"));
		list1.add(new Task(LocalDate.of(2024,11,9),"スクールの課題を解く"));
	
		 Collections.sort(list1, (task1, task2) -> task1.getDate().compareTo(task2.getDate()));
				
		   for (Task task : list1) {
			   System.out.println(task.getDate() + ": " + task.getTask());
		 }
	}

}