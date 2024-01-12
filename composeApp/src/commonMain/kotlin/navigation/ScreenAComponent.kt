package navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value

class ScreenAComponent (
    componentContext : ComponentContext,
    private val onNavigateToScreenB : (String) -> Unit
): ComponentContext by componentContext{

    private var _text = MutableValue("")
    val text : Value<String> = _text

    fun onEvent(event :SealedAEvent){
        when(event){
            SealedAEvent.ClickButtonA -> onNavigateToScreenB(text.value)
            is SealedAEvent.UpdateText -> {
                _text.value = event.text
            }
        }

    }
}