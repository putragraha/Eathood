package id.assist.eathood.singleton.contract

import id.assist.eathood.singleton.model.Todo


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoFormContract, v 1.3.0 2020-05-02 14:44 by Putra Nugraha
 */
interface TodoFormContract {

    interface View {

        fun onSuccessAddTodo()
    }

    interface Presenter {

        fun addTodo(todo: Todo)
    }
}