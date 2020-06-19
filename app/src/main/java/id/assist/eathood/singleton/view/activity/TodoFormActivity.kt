package id.assist.eathood.singleton.view.activity

import android.app.Activity
import id.assist.eathood.R
import id.assist.eathood.base.BaseActivity
import id.assist.eathood.singleton.contract.TodoFormContract
import id.assist.eathood.singleton.model.Todo
import id.assist.eathood.singleton.presenter.TodoFormPresenter
import kotlinx.android.synthetic.main.activity_todo_form.*


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version TodoFormActivity, v 1.3.0 2020-05-02 14:38 by Putra Nugraha
 */
class TodoFormActivity: BaseActivity(), TodoFormContract.View {

    companion object {

        const val REQUEST_CODE = 100
    }

    lateinit var presenter: TodoFormContract.Presenter

    override fun getLayout(): Int = R.layout.activity_todo_form

    override fun initView() {
        presenter = TodoFormPresenter(this)
        btnAdd?.setOnClickListener {
            presenter.addTodo(Todo(etTitle?.text.toString(), etDescription?.text.toString()))
        }
    }

    override fun onSuccessAddTodo() {
        setResult(Activity.RESULT_OK)
        finish()
    }
}