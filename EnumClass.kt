enum class State{
    Start,Middle,Stop
}


fun main() {
   var state=State.Stop
   var message=when(state)
    {
        State.Start->"Hello"
        State.Middle->"haiii"
        State.Stop->"hooooo"
        
    }
    println(message)
}