# Building Projects with Stack
Excerpt from Get "Programming With Haskell" Manning.

The first thing you need to do is make sure stack is up-to-date.
You can do this with the stack update command:

    $ stack update
It’s common for this operation to take a long time the first time you run stack
(or when it has been a long time).
Because stack is making sure you have a clean environment to build projects in,
many first-time tasks might take a few minutes for everything to run.

The next command you need to run is setup.
In your project directory, run this command:

    $ stack setup
This command ensures that stack is using the correct version of GHC.

Finally, you are ready to build your project.
This can be done with the following command:

    $ stack build
Don’t be concerned if this command takes a bit of time to run the first time you use stack
or build your project.
Future builds will go much faster.

To interact with your project, you need to run stack ghci:

    $ stack ghci
You can run all the tests with:

    $ stack test
The following command just runs the Tests in the module CollatzTest:

    $ stack test :collatz
And this one just the Tests in the module FactTest:
  
    $ stack test :fact
These test-suites are defined in package.yaml.