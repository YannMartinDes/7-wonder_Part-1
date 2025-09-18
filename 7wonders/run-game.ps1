# run-game.ps1
param(
    [int]$Players = 4   # default number of players
)

$env:JAVA_HOME="C:\Program Files\Eclipse Adoptium\jdk-11.0.28.6-hotspot"
$mvn = "mvn"

# Launch Game Server with number of players
Start-Process powershell -ArgumentList "-NoExit", "-Command `"cd `"$PWD`"; $mvn -pl gameserver exec:java '-Dexec.mainClass=servergame.App' '-Dexec.args=$Players'`""

# Launch Stats Server
Start-Process powershell -ArgumentList "-NoExit", "-Command `"cd `"$PWD`"; $mvn -pl statsserver exec:java '-Dexec.mainClass=serverstat.App'`""
