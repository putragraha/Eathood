package id.assist.eathood.singleton.view.activity

import android.app.Activity
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import id.assist.eathood.R
import id.assist.eathood.base.BaseActivity
import id.assist.eathood.singleton.contract.TodoListContract
import id.assist.eathood.singleton.model.Todo
import id.assist.eathood.singleton.presenter.TodoListPresenter
import id.assist.eathood.singleton.view.adapter.TodoAdapter
import kotlinx.android.synthetic.main.activity_todo_list.*


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoListActivity, v 1.3.0 2020-05-02 11:31 by Putra Nugraha
 */
class TodoListActivity: BaseActivity(), TodoListContract.View {

    lateinit var todoListPresenter: TodoListContract.Presenter

    lateinit var todoAdapter: TodoAdapter

    override fun getLayout(): Int = R.layout.activity_todo_list

    override fun initView() {
        fabToForm?.setOnClickListener { goToForm() }
        todoListPresenter = TodoListPresenter(this)
        setupRecyclerView()
    }

    override fun onSuccessGetTodoList(todoList: MutableList<Todo>) {
        todoAdapter.setItems(todoList)
    }

    override fun onTodoRemoved() {
        todoListPresenter.getTodoList()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode) {
            TodoFormActivity.REQUEST_CODE -> handleActivityResult(resultCode)
        }
    }

    private fun setupRecyclerView() {
        todoAdapter = TodoAdapter { todoListPresenter.removeTodo(it) }
        rvFood?.apply {
            layoutManager = LinearLayoutManager(this@TodoListActivity)
            adapter = todoAdapter
        }
    }

    private fun goToForm() {
        startActivityForResult(
            Intent(this, TodoFormActivity::class.java),
            TodoFormActivity.REQUEST_CODE
        )
    }

    private fun handleActivityResult(resultCode: Int) {
        when (resultCode) {
            Activity.RESULT_OK -> todoListPresenter.getTodoList()
        }
    }
}