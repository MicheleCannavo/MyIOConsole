# 1. M

@startuml
class util.console.Input {
- <<Create>> Input()
+ {static} String readLine(String,Object)
+ {static} String readPassword()
  }
  class util.console.Output {
- <<Create>> Output()
+ {static} void printLine(String,Object)
+ {static} void printnlLine(String,Object)
+ {static} void printNotValid()
+ {static} void printIsPresent(String)
  }
  class util.console.Console {
- <<Create>> Console()
+ {static} void clrscr()
  }
  @enduml

