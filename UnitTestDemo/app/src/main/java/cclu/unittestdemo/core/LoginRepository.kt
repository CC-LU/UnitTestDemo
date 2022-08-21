package cclu.unittestdemo.core

interface LoginRepository {
//    fun auth(name: String, password: String): Boolean

    fun auth(name: String, password: String, callback: LoginCallback)
}

interface LoginCallback {
    fun success()
    fun fail()
}