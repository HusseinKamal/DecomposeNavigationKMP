package navigation

sealed interface SealedAEvent{
    data object ClickButtonA:SealedAEvent
    data class UpdateText(val text : String) :SealedAEvent

}
