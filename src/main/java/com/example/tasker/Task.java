package com.example.tasker;

//import org.springframework.data.annotation.Id;
import javax.persistence.*;

@Entity
public class Task {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String description;
   private boolean realized;
   private boolean archived;

   @Enumerated(EnumType.STRING)
   private Category category;

   public Task(Long id, String name, String description, boolean realized, boolean archived) {
      this.id = id;
      this.name = name;
      this.description = description;
      this.realized = realized;
      this.archived = archived;
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

   public boolean isRealized() {
      return realized;
   }

   public void setRealized(boolean realized) {
      this.realized = realized;
   }

   public boolean isArchived() {
      return archived;
   }

   public void setArchived(boolean archived) {
      this.archived = archived;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

   @Override
   public String toString() {
      return "Task{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", description='" + description + '\'' +
              ", realized=" + realized +
              ", archived=" + archived +
              ", category=" + category +
              '}';
   }
}
