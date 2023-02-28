package com.todosapp.TodoApp.model;

import java.time.LocalDate;


public class Todo {

	private long id;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private String status;

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(long id, String description, LocalDate startDate, LocalDate endDate, String status) {
		super();
		this.id = id;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public long getId() {
		return id;
	}


	public String getDescription() {
		return description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", status=" + status + "]";
	}

}
