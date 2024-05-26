package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate date;
	private String task;
	
	public Task (LocalDate date,String task) {
		this.date=date;
		this.task=task;
	}
	public LocalDate getdate() {
		return date;
	}
	public String gettask() {
		return task;
	}
	public void setdate(LocalDate date) {
		this.date=date;
	}
	public void settask(String task) {
		this.task=task;
	}
}


