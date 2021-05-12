package todolist.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {
//    private List<ToDo> todos = new ArrayList<>(
//
//            Arrays.asList(
//                    new ToDo(1, "T1", "Summary 1","d1"),
//                    new ToDo(2, "T2", "Summary 2","d2"),
//                    new ToDo(3, "T3", "Summary 3","d3")
//
//            )
//
//    );

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getAllToDos() {
        List<ToDo> todos = new ArrayList<>();
        toDoRepository.findAll().forEach(todos::add);
        return todos;
    }

    public Optional<ToDo> getToDo(Integer id) {
        return toDoRepository.findById(id);
        // todos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void createToDo(ToDo todo) {
        //todos.add( todo );
        toDoRepository.save(todo);
    }

    public void updateToDo(Integer id, ToDo todo) {
        toDoRepository.save(todo);

//        for (int i = 0; i < todos.size(); i++) {
//            ToDo t = todos.get(i);
//            if (t.getId().equals(todo.getId())) {
//                todos.set(i, todo);
//            }
//        }
    }

    public void deleteToDo(Integer id) {
        toDoRepository.deleteById(id);
        // todos.removeIf(t -> t.getId().equals(id));
    }
}
