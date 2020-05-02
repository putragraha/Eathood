package id.assist.eathood.todolist.presenter

import id.assist.eathood.todolist.contract.TodoListContract
import id.assist.eathood.todolist.model.Todo
import id.assist.eathood.todolist.repository.TodoListRepository


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoListPresenter, v 1.3.0 2020-05-02 13:51 by Putra Nugraha
 */
class TodoListPresenter(private val view: TodoListContract.View): TodoListContract.Presenter {

    override fun getTodoList() {
        view.onSuccessGetTodoList(TodoListRepository.todoList)
    }

    override fun removeTodo(todo: Todo) {
        if (TodoListRepository.removeItem(todo)) view.onTodoRemoved()
    }
}