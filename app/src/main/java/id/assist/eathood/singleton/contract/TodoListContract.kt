package id.assist.eathood.singleton.contract

import id.assist.eathood.singleton.model.Todo


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoListContract, v 1.3.0 2020-05-02 11:36 by Putra Nugraha
 */
interface TodoListContract {

    interface View {

        fun onSuccessGetTodoList(todoList: MutableList<Todo>)

        fun onTodoRemoved()
    }

    interface Presenter {

        fun getTodoList()

        fun removeTodo(todo: Todo)
    }
}