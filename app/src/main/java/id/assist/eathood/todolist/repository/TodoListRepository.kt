package id.assist.eathood.todolist.repository

import id.assist.eathood.todolist.model.Todo


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoListEntityRepository, v 1.3.0 2020-05-02 12:04 by Putra Nugraha
 */
object TodoListRepository {

    val todoList = mutableListOf<Todo>()

    fun addItem(todo: Todo):Boolean = todoList.add(todo)

    fun removeItem(todo: Todo): Boolean = todoList.remove(todo)
}