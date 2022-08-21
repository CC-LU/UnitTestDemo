package cclu.unittestdemo.ui.login

import cclu.unittestdemo.core.LoginCallback
import cclu.unittestdemo.core.LoginRepository
import org.junit.Assert

import org.junit.Test
import org.mockito.Mockito
import org.mockito.kotlin.any
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.whenever

class LoginViewModelTest {

    @Test
    fun 登入成功_設定成功狀態() {

        val loginRepository = Mockito.mock(LoginRepository::class.java)
        val viewModel = LoginViewModel(loginRepository)
        val expected = "成功"

        doAnswer {
            val callback = it.arguments[2] as LoginCallback
            callback.success()
        }.whenever(loginRepository).login(any(), any(), any())

        viewModel.login(any(), any())

        Assert.assertEquals(expected, viewModel.result)
    }
}