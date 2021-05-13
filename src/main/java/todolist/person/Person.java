package todolist.person;

import todolist.todo.ToDo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    private Long id;
    private String name;

    public Person(Long id, String name, List<ToDo> items) {
        this.id = id;
        this.name = name;
        this.todos = items;
    }

    public Person() {
    }

    @OneToMany(targetEntity = ToDo.class)
    private List<ToDo> todos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> items) {
        this.todos = items;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
