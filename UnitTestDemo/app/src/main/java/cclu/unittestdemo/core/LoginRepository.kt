package cclu.unittestdemo.core

interface LoginRepository {
    
    fun login(name: String, password: String, callback: LoginCallback)
}

interface LoginCallback {
    fun success()
    fun fail()
}