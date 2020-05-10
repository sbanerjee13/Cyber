# Setup Insructions

These are instructions on how to setup a development environment for working on Cyberworld.

Note: If you need any help with the setup, you can join our [discord server](www.discord.gg/5MyGWRD).

Extra note: Setup instructions are only made for Windows currently.

## Step 1: Java JDK

Go to the Oracle page for [Java JDK](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) to get Java JDK. Simply run the downloaded file and follow the instructions for installation.

## Step 2: IntelliJ IDE

For working on Cyberworld, you need an IDE for building artifacts. IntelliJ is the only IDE we have documentation for at the moment.

### Downloading and Installing

You'll need to download IntelliJ from the [JetBrains website](https://www.jetbrains.com/idea/download/#section=windows); community edition has all the tools you need.

Continue through the installation process, making sure to get the 64x bit launcher (if your PC is 64 bit) and the 32 bit runtime.

When it's done installing, open it up. Configure it how you like, although it's recommended to just use the defaults, the button to do so is on the bottom left.

If this is your first time using IntelliJ, you'll be greeted with the welcome screen. Go to the bottom right and press on  
*Configure > Plugins*. Search for **Minecraft Development** and install it. You may need to restart IntelliJ.

If you aren't given the welcome screen, go to *File > Settings > Plugins*. Search for **Minecraft Development** and install it. Restart IntelliJ.

## Step 3: Spigot Server

In order to actually run and test the plugin, you'll need Spigot to create a local server where you can test new features or bug fixes.

Go to [the Spigot dowload page](https://getbukkit.org/download/spigot) and be sure to get **version 1.15.2**. When it's done downloading, **DO NOT** run it yet. Create a folder called server and place it somewhere convenient (on your desktop is recommended).

Now, drag the *.jar* file you downloaded and place it in the server folder. Now you can run it. The folder with fill up with a few files. Open up the *eula.txt* and change *false* to *true* and save it. Run the *.jar* file again and it should fill up with more files and folders.

Inside the server folder, create a new text document. Inside of it, put in the following text: `java -Xms512M -Xmx1G -jar spigot-1.15.2.jar -o true`. Save the file and rename it to *Start.bat*. Make sure that your *eula.txt* file is still set to true.

## Step 4: Cloning the repository

Download [Git](https://git-scm.com/downloads) and follow the installation process.

You can either use Git Bash(the command line) or use [GitHub Desktop](https://desktop.github.com/).

If you have access to the main repository, just clone it directly. If not, make a fork of the repository and clone it from yours.

Open up the repository from IntelliJ. On the bottom right will be some information. Mak sure CRLF is used, not LF. Also be sure *Spaces: 4* is displayed.

## Step 5: Configuring IntelliJ builds

Inside of IntelliJ with the project open, go to *File > Project Structure*. On the Project tab, makes sure the project SDK is set to the version of Java you downloaded. Go to the Articafts tab. Press the plus sign on the left panel. Select *JAR > From dependencies and modules* and press OK. Change the output directory to the plugin folder found inside the server folder. Click Apply then OK.

From the taskbar at the top, press *Build > Build Artifacts* and in the center of your screen select *Build*. When it's done building, check your plugin folder to make sure there a *.jar* there; that's the artifact.

## Step 6: Running the Server Locally

You can test your features inside of Minecraft. After building an artifact succesfully, run *Start.bat*. A command prompt should open up warning you about the version being outdated, don't worry it will start up anyway. It should eventually show the Minecraft server manager GUI. Now, open up Minecraft and go to multiplayer. Create a server with the server address being `localhost` and join the server. If you need to, you can make yourself an operater by going in the server manager and typing in `op <username>` where `<username>` is your username. If you make a new artifact and want to test it in the server, just type in `/reload` in the chat. You must be an operator to do so.

## Conclusion

That should be it! You are ready to start working on Cyberworld. Remember, if you have any questions or issues, you can ask in our [discord server](www.discord.gg/5MyGWRD).