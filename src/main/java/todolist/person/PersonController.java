package todolist.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todolist.todo.ToDo;
import todolist.todo.ToDoService;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

}
