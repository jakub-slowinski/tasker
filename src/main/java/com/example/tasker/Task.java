package com.example.tasker;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Task {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String description;

   @DateTimeFormat(pattern = "dd-MM-YYYY")
   private LocalDate deadline;
   private boolean realized;

   @Enumerated(EnumType.STRING)
   private Category category;

   public Task(Long id, String name, String description, LocalDate deadline, boolean realized, Category category) {
      this.id = id;
      this.name = name;
      this.description = description;
      this.deadline = deadline;
      this.realized = realized;
      this.category = category;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public LocalDate getDeadline() {
      return deadline;
   }

   public void setDeadline(LocalDate deadline) {
      this.deadline = deadline;
   }

   public boolean isRealized() {
      return realized;
   }

   public void setRealized(boolean realized) {
      this.realized = realized;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }
}
