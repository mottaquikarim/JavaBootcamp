# Setting Up Our Environment

In order to be able to write and run java programs, we must first set up a development environment.

## Notes & Disclaimers

`IDE`s (integrated development environments) are very popular in the java world - and for good reason, java can be a bit overly verbose and IDEs provide a way to quickly look up definitions and autocomplete java variable names and functions.

That being said, we will **not** be using an IDE for today's class. This is mainly because:

1. I don't like IDEs in principle.
2. They have a bit of a steep learning curve - which is impractical given today's course setup.
3. They are **heavy**, in other words, large programs that take a while to download, install and sometimes, even run
4. They are especially useful when writing large scale programs that are complex in functionality - we will **not** be doing this as part of class today.


Instead, let's consider a simpler, more lightweight approach.

## Approach

We will use **[Sublime Text 3](https://www.sublimetext.com/3)** as our code editor of choice.

We will add a few plugins that will help us run java more easily and define a process for how we may stitch it all together.

## STEP 0: Is Java Already Installed?

In terminal,  run:

```
javac --version
```

**FOR MAC USERS**: you can open terminal by: `Cmd + space` and then typing in the word `terminal` and hitting enter.

**FOR WINDOWS USERS**: you want to open the Command Prompt (Start > search for "run" or "command").

If your terminal outputs something like...

```
JDK x.x.x
```

Congrats! You hava Java installed. Skip to the **Download and Install Sublime Text 3** step.

## STEP 1: Installing Java

*PLEASE READ THE INSTRUCTIONS **CAREFULLY***

* **MAC USERS**: [Installing Java Instructions](https://www.ntu.edu.sg/home/ehchua/programming/howto/JDK_HowTo.html#jdk_mac)
* **PC USERS**: [Installing Java Instructions](https://www.ntu.edu.sg/home/ehchua/programming/howto/JDK_HowTo.html#jdk-install)

## STEP 2: Download and Install Sublime Text 3

Ok, have Java installed? *Sweet*. Download Sublime Text.

**[Find it here](https://www.sublimetext.com/3)**.

Once downloaded, **please** go to your `downloads` folder and install the software by following onscreen instructions.

## STEP 3: Install the `Terminal` package.

First, you'll need to install **[package control](https://packagecontrol.io/installation)**. Follow the instructions on that page.

Then, open up `package control` in Sublime by typing `Cmd + Shift + P` and typing in the following:

![package](/assets/package-control.png)

Finally, in the search bar that appears, type in `Terminal`:

![terminal](/assets/terminal.png)

This will install the `Terminal` package. You can test this by typing `Cmd + Shift + T` and observing that a terminal window appears.

Should look something like this:

![final](/assets/final-terminal.png)

## STEP 4: Set up a Build System.

Go to `Tools > Build System > New Build System`.

![build-system](/assets/new-build-system.png)

Update the code there with (copy pasted after screen shot):

![build-system-2](/assets/build-system.png)

```json
{
	"shell_cmd": "javac *.java",
	"shell": true
}
```

**NOW**, pressing `Cmd + B` will always **compile** your java code.

## STEP 5: TEST TEST TEST

Open up the **zipped** version of this repo and navigate to `examples/basics/p1` folder. You can drag it over to Sublime to open it in sublime.

Try to run it! First, hit `Cmd + B`. Then, hit `Cmd + Shift + T`.


Finally, in your terminal window, run:

```
java HelloWrold
```

![working example](/assets/working-example.png)
