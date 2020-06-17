package com.example.todomvvm.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task")
public class TaskEntry {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private int priority;
    @ColumnInfo(name="updated_at")
    private Date updatedAt;

    private boolean status;
    private String dueDate;

    @Ignore
    public TaskEntry(String title, String description, int priority, Date updatedAt, String dueDate, boolean status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.status = status;
        this.dueDate = dueDate;
    }

    public TaskEntry(int id, String title, String description, int priority, Date updatedAt, String dueDate, boolean status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.status = status;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
