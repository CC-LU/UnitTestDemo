package cclu.unittestdemo.core

class RemoteLoginRepositoryImpl : LoginRepository {
    override fun auth(name: String, password: String, callback: LoginCallback) {
        callback.fail()
    }
}