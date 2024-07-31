package command_P9;

public class CommandPatternTest {
    public static void main(String[] args) {
        // Creating a light instance
        Light light = new Light();

        // Creating command instances
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Creating a remote control instance
        RemoteControl remoteControl = new RemoteControl();

        // Setting command and pressing button to turn on the light
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        // Setting command and pressing button to turn off the light
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}

