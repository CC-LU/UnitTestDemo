package cclu.unittestdemo.ui.login

import cclu.unittestdemo.core.LoginCallback
import cclu.unittestdemo.core.LoginRepository
import io.mockk.CapturingSlot
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class LoginViewModelTest {
    
    @Test
    fun login() {

        val repo = mockk<LoginRepository>()
        val viewModel = LoginViewModel(repo)
        val expected = "成功"

        val slot = CapturingSlot<LoginCallback>()
        every { repo.login(any(), any(), capture(slot)) }.answers {
            slot.captured.success()
        }

        viewModel.login("1", "2")

        Assert.assertEquals(expected, viewModel.result)
    }
}