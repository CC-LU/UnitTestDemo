package cclu.unittestdemo.ui.login

import cclu.unittestdemo.core.LoginCallback
import cclu.unittestdemo.core.LoginRepository

class LoginViewModel(private val repository: LoginRepository) {

    var result: String? = null

    fun login(name: String, password: String) {
        repository.auth(name, password, object : LoginCallback {
            override fun success() {
                result = "成功"
            }

            override fun fail() {
                result = "失敗"
            }

        })
    }
}