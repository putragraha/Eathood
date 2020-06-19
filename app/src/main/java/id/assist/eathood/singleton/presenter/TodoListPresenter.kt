package id.assist.eathood.singleton.presenter

import id.assist.eathood.singleton.contract.TodoListContract
import id.assist.eathood.singleton.model.Todo
import id.assist.eathood.singleton.repository.TodoListRepository


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