package com.example.cicdandroidapp
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class CounterScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun clickingButtonIncrementsCounter() {
        composeTestRule.setContent {
            CounterScreen()
        }

        composeTestRule.onNodeWithText("Click Me").performClick()
        composeTestRule.onNodeWithText("You clicked 1 times").assertExists()
    }
}