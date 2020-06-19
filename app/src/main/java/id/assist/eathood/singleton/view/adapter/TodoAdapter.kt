package id.assist.eathood.singleton.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.assist.eathood.R
import id.assist.eathood.singleton.model.Todo
import kotlinx.android.synthetic.main.view_todo_item.view.*


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoAdapter, v 1.3.0 2020-05-02 14:06 by Putra Nugraha
 */
class TodoAdapter(
    private val removeListener: (Todo) -> Unit
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    private val todoList = mutableListOf<Todo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_todo_item, parent, false)
        )
    }

    override fun getItemCount(): Int = todoList.size

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todoList[position], removeListener)
    }

    fun setItems(todoList: MutableList<Todo>) {
        this.todoList.clear()
        this.todoList.addAll(todoList)
        notifyDataSetChanged()
    }

    class TodoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(todo: Todo, removeListener: (Todo) -> Unit)= with(itemView) {
            tvTitle.text = todo.title
            tvDescription.text = todo.description
            btnRemove.setOnClickListener {
                removeListener(todo)
            }
        }
    }
}