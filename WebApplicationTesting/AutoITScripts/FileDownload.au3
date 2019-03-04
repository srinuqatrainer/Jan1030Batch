WinWaitActive("Opening selenium-server-standalone-3.141.59.jar")
Send("{TAB}")
Send("{ENTER}")

ControlSend("Enter name of file to save to…","","Edit1","selenium-server-standalone-3.141.59");
ControlClick("Enter name of file to save to…","","Button2")

WinActivate("Confirm Save As")
Send("{TAB}")
Send("{ENTER}")