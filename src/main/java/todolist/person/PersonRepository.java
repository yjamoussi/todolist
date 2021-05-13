package todolist.person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todolist.todo.ToDo;



@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {


}
