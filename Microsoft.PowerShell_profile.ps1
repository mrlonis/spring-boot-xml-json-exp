$JAVA_8_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-8.0.412.8-hotspot' # Replace with your correct version
$JAVA_11_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-11.0.23.9-hotspot' # Replace with your correct version
$JAVA_17_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-17.0.11.9-hotspot' # Replace with your correct version
$JAVA_21_PATH = 'C:\Program Files\Eclipse Adoptium\jdk-21.0.3.9-hotspot' # Replace with your correct version

Set-Alias -Name java8 -Value ($env:JAVA_HOME = $JAVA_8_PATH)
Set-Alias -Name java11 -Value ($env:JAVA_HOME = $JAVA_11_PATH)
Set-Alias -Name java17 -Value ($env:JAVA_HOME = $JAVA_17_PATH)
Set-Alias -Name java21 -Value ($env:JAVA_HOME = $JAVA_21_PATH)

Set-Alias -Name default_java8 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_8_PATH, 'Machine'))
Set-Alias -Name default_java11 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_11_PATH, 'Machine'))
Set-Alias -Name default_java17 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_17_PATH, 'Machine'))
Set-Alias -Name default_java21 -Value ([Environment]::SetEnvironmentVariable('JAVA_HOME', $JAVA_21_PATH, 'Machine'))

Set-Alias -Name java -Value (Join-Path $env:JAVA_HOME 'bin\java.exe') # Load java from JAVA_HOME instead of the system path

Import-Module PSReadLine
Set-PSReadLineOption -PredictionSource History
