package cclu.unittestdemo.core

class RemoteLoginRepositoryImpl : LoginRepository {
    override fun login(name: String, password: String, callback: LoginCallback) {
        callback.fail()
    }
}