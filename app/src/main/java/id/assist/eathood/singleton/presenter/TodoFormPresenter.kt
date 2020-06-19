package id.assist.eathood.singleton.presenter

import id.assist.eathood.singleton.contract.TodoFormContract
import id.assist.eathood.singleton.model.Todo
import id.assist.eathood.singleton.repository.TodoListRepository


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoFormPresenter, v 1.3.0 2020-05-02 14:46 by Putra Nugraha
 */
class TodoFormPresenter(private val view: TodoFormContract.View): TodoFormContract.Presenter {

    override fun addTodo(todo: Todo) {
        if (TodoListRepository.addItem(todo)) {
            view.onSuccessAddTodo()
        }
    }
}