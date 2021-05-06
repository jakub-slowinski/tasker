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
   private Boolean realized;
   private Boolean archived;

   @Enumerated(EnumType.STRING)
   private Category category;

   public Task() {
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

   public Boolean getRealized() {
      return realized;
   }

   public void setRealized(Boolean realized) {
      this.realized = realized;
   }

   public Boolean getArchived() {
      return archived;
   }

   public void setArchived(Boolean archived) {
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
